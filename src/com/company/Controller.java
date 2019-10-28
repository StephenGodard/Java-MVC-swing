package com.company;

import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class Controller {
    private Model model;
    private Views view;
    private ActionListener actionListener;
    public Controller()throws ClassNotFoundException, SQLException  {
        this.model=new Model();
        this.view=new Views();
    }
    public void control(){
        view.getConnect().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)  {
                try {
                    linkButtonConnexion();
                }
                catch(SQLException f){
                }
                catch(ClassNotFoundException f){
                }
            }

        });

        view.getNewAudit().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.addUser();
                view.getRegistration().addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        try{
                            linkBttonRegistration();
                        }
                        catch(SQLException g){

                        }
                        catch (ClassNotFoundException g){

                        }
                    }
                });
            }
        });


    }
    private void linkButtonConnexion() throws ClassNotFoundException,SQLException{

        String result=model.authentification(view.getLoginEntry().getText(),new String(view.getPassword().getPassword()));
        System.out.println(result);
    }

    private void linkBttonRegistration() throws ClassNotFoundException,SQLException{

        String result= model.inscription(view.getGetNewAudit().getText(),new String(view.getGetNewPassword().getPassword()),view.getGetNomNewAudit().getText());
        System.out.println(result);
    }
    public void fin() {
        try {
            model.conn.close();
        }
        catch(SQLException e){

        }
    }

}
