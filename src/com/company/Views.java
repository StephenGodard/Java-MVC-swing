package com.company;

import javax.swing.*;
import java.awt.*;


public class Views extends JFrame {
    // MainWindows
    private JFrame mainWindows;
    private JMenu menu;
    private JMenuBar menuBar;
    private JMenuItem newAudit;
    private JMenuItem save;
    private JMenu help;
    private JTextField loginEntry;
    private JLabel login;
    private Container container;
    private Container loginRow;
    private Container passwordRow;
    private JLabel passwordLabel;
    private JPasswordField password;
    private Container connexion;
    private JButton connect;
    // Addwindows
    private JLabel labelNewAudit;
    private JTextField getNewAudit;
    private JLabel labelNewPassword;
    private JPasswordField getNewPassword;
    private JLabel labelNomNewAudit;
    private JTextField getNomNewAudit;
    private JButton registration;
    private JFrame addWindows;
    public Views() throws HeadlessException {
        mainWindows=new JFrame("A6");
        mainWindows.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindows.setSize(600,400);
        container=new Container();
        container.setLayout(new GridLayout(6,1));
        menuBar=new JMenuBar();
        menu=new JMenu("Audit");
        newAudit=new JMenuItem("nouvel audit");
        save=new JMenuItem("sauvegarder");
        menu.add(newAudit);
        menu.add(save);
        help=new JMenu("Aide");
        menuBar.add(menu);
        menuBar.add(help);
        container.add(menuBar);
        Container labelConnexion=new Container();
        labelConnexion.setLayout(new FlowLayout());
        JLabel labelConnect=new JLabel("Connexion");
        labelConnexion.add(labelConnect);
        container.add(labelConnexion);
        //
        loginRow=new Container();
        loginRow.setLayout(new FlowLayout());
        login=new JLabel("login");
        loginEntry=new JTextField("",10);
        loginRow.add(login);
        loginRow.add(loginEntry);
        container.add(loginRow);
        passwordRow=new Container();
        passwordRow.setLayout(new FlowLayout());
        passwordLabel=new JLabel("password");
        password=new JPasswordField("",8);
        this.passwordRow.add(passwordLabel);
        this.passwordRow.add(password);
        passwordRow.add(passwordLabel);
        passwordRow.add(password);
        container.add(passwordRow);
        connexion=new Container();
        connexion.setLayout(new FlowLayout());
        connect=new JButton("Connexion");
        connexion.add(connect);
        container.add(connexion);
        mainWindows.getContentPane().add(container);
        this.mainWindows.setVisible(true);
    }

    public JMenuItem getNewAudit() {
        return newAudit;
    }

    public JMenuItem getSave() {
        return save;
    }

    public JMenu getHelp() {
        return help;
    }

    public JTextField getLoginEntry() {
        return loginEntry;
    }

    public JPasswordField getPassword() {
        return password;
    }

    public JButton getConnect() {
        return connect;
    }

    public JTextField getGetNewAudit() {
        return getNewAudit;
    }

    public JPasswordField getGetNewPassword() {
        return getNewPassword;
    }

    public JButton getRegistration() {
        return registration;
    }

    public JTextField getGetNomNewAudit() {
        return getNomNewAudit;
    }

    public void addUser(){
        addWindows=new JFrame("nouvel Audit");
        addWindows.setSize(400,300);
        Container blocAjout=new Container();
        blocAjout.setLayout(new GridLayout(5,1));
        Container ajoutLigne1 = new Container();
        ajoutLigne1.setLayout(new FlowLayout());
        labelNewAudit=new JLabel("login");
        getNewAudit=new JTextField("",10);
        ajoutLigne1.add(labelNewAudit);
        ajoutLigne1.add(getNewAudit);
        blocAjout.add(ajoutLigne1);
        Container ajoutLigne2=new Container();
        ajoutLigne2.setLayout(new FlowLayout());
        labelNewPassword=new JLabel("password");
        getNewPassword=new JPasswordField("",8);
        ajoutLigne2.add(labelNewPassword);
        ajoutLigne2.add(getNewPassword);
        blocAjout.add(ajoutLigne2);
        Container ajoutLigne3=new Container();
        ajoutLigne3.setLayout(new FlowLayout());
        labelNomNewAudit=new JLabel("Nom");
        getNomNewAudit=new JTextField("",10);
        ajoutLigne3.add(labelNomNewAudit);
        ajoutLigne3.add(getNomNewAudit);
        blocAjout.add(ajoutLigne3);
        registration=new JButton("S'inscrire");
        registration.setSize(new Dimension(2,2));
        blocAjout.add(registration);
        addWindows.getContentPane().add(blocAjout);
       addWindows.setVisible(true);
    }

}
