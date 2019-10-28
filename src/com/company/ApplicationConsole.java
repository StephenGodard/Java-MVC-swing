package com.company;

import java.io.*;

public class ApplicationConsole {
    public static void main(String[] argv) throws IOException{
        Auditeur creponutella=new Auditeur("crepo","Java");
        creponutella.authentification();
        //Securité Web
        Critere securiterWeb=new Critere();
        securiterWeb.setInutile("securiterWeb");
        securiterWeb.setNote(4.28);
         // securité accès fils de securité web
        Critere securiterAcces=new Critere();
        securiterAcces.setInutile("securiterAcces");
        securiterAcces.setNote(4.28);
        securiterWeb.addEnfants(securiterAcces);
        securiterAcces.setParent(securiterWeb);

        //securité password fils de sécurité accès
        Critere securiterPassword=new Critere();
        securiterPassword.setInutile("securiterPassword");
        securiterPassword.setParent(securiterAcces);
        securiterAcces.addEnfants(securiterPassword);
        securiterPassword.setNote(4.28);
        //securité passwordLong fils de sécurité password
        Critere passwordLong=new Critere();
        passwordLong.setInutile("passwordLong");
        passwordLong.setParent(securiterPassword);
        securiterPassword.addEnfants(passwordLong);
        passwordLong.setNote(4.28);
        //securité hash fils de securité password
        Critere hash=new Critere();
        hash.setInutile("hash");
        hash.setParent(securiterPassword);
        securiterPassword.addEnfants(passwordLong);

        //securité serveur fils de securité web
        Critere securiterServeur=new Critere();
        securiterServeur.setInutile("securiterServeur");
        securiterServeur.setParent(securiterWeb);
        securiterWeb.addEnfants(securiterServeur);

        //securité phpinfo fils de securité serveur
        Critere phpinfo=new Critere();
        phpinfo.setInutile("phpinfo");
        phpinfo.setParent(securiterServeur);
        securiterServeur.addEnfants(phpinfo);

        //securité droits777 fils de securité serveur
        Critere droits777=new Critere();
        droits777.setInutile("droits777");
        droits777.setParent(securiterServeur);
        securiterServeur.addEnfants(droits777);
        droits777.setNote(4.28);
        Audit question6=new Audit(creponutella,securiterWeb);
        System.out.println(question6.displaytree());
        System.out.println(question6.calculNote());
        question6.backUp("text.txt",question6.displaytree());

        Views test = new Views();


    }


}

