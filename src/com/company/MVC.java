package com.company;
import java.awt.*;
import java.sql.SQLException;
import javax.swing.*;
import java.util.Scanner;
public class MVC {
    public static void main(String argv[]) throws ClassNotFoundException, SQLException {
        Controller controller=new Controller();
        Scanner sc=new Scanner(System.in);
        controller.control();

        while(true){

            System.out.println("Appuyez sur 1 pour mettre fn à la connexion");

            int i=sc.nextInt();
            if(i==1){
                controller.fin();
                break;
            }
        }




    }

}
