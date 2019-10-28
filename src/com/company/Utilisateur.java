package com.company;
import java.io.*;
public class Utilisateur {
    String login;
    String mdp;

    Utilisateur() {
        this.login = new String();
        this.mdp = new String();

    }

    Utilisateur(String a, String b) {
        this.login = a;
        this.mdp = b;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public String toString() {
        return login;
    }

    public  void authentification(){
        String path="C:/Users/pheph/IdeaProjects/Etude_inplementation_A6/src/com/company/";
        String passworduser=this.mdp;
        try {
            FileReader fr = new FileReader(path + "bdd.csv");
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {

                if(passworduser.equals(line)){
                    System.out.println("Connecter");
                     }

            }

        }
        catch (IOException e) {
            System.err.format("Impossible d'ouvrir le fichier", e);
        }


    }



}

