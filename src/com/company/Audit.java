package com.company;

import java.io.*;


public class Audit {
    Auditeur redacteur;
    Critere parent;

    public Audit(Auditeur redacteur, Critere parent) {
        this.redacteur = redacteur;
        this.parent = parent;
    }
    public Audit(){
        this.redacteur=new Auditeur();
        this.parent=new Critere();
    }

    public Auditeur getRedacteur() {
        return redacteur;
    }

    public void setRedacteur(Auditeur redacteur) {
        this.redacteur = redacteur;
    }

    public Critere getParent() {
        return parent;
    }

    public void setParent(Critere parent) {
        this.parent = parent;
    }

    public String displaytree(){

        return this.parent.getArbo();

    }

    public Double calculNote(){
        return this.parent.getMoy();
    }
    public void backUp(String namefile,String tree) throws IOException {
        String path="C:/Users/pheph/IdeaProjects/Etude_inplementation_A6/src/com/company/";

        try {
            PrintWriter writer = new PrintWriter(namefile, "UTF-8");
            writer.println(tree);
            writer.close();

        }
        catch (IOException e) {
            PrintWriter writer = new PrintWriter(new FileWriter(namefile));
            writer.println(tree);
            writer.close();
        }


    }
}
