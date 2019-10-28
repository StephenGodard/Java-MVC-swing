package com.company;
import java.util.Collections;
import java.lang.ref.Reference;
import java.util.Collections;
import java.util.Objects;
import java.util.ArrayList;

public class Critere {
    Critere parent;
    String inutile;
    String texte;
    ArrayList<References>  references;
    ArrayList<Critere> Enfants;
    Double note;
    Double coefficient;
    Critere(){
        this.parent=null;
        this.inutile=new String();
        this.texte=new String();
        this.Enfants=new ArrayList<Critere>();
        this.note=0.0;
        this.references=new ArrayList<References>();

        this.coefficient=0.0;
    }

    public Critere getParent() {
        return parent;
    }

    public void setParent(Critere parent) {
        this.parent = parent;
    }

    public String getInutile() {
        return inutile;
    }

    public void setInutile(String inutile) {
        this.inutile = inutile;
    }

    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public ArrayList getReferences() {
        return references;
    }


    public Double getNote() {
        return note;
    }

    public void setNote(Double note) {
        this.note = note;
    }

    public Double getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(Double coefficient) {
        this.coefficient = coefficient;
    }

    public void setReferences(ArrayList<References> references) {
        this.references = references;
    }

    public ArrayList<Critere> getEnfants() {
        return Enfants;
    }

    public void setEnfants(ArrayList<Critere> enfants) {
        Enfants = enfants;
    }
    public void addEnfants(Critere a){
        Enfants.add(a);
    }
    public String toString(){
        return this.inutile;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Critere critere = (Critere) o;
        return Objects.equals(parent, critere.parent) &&
                Objects.equals(inutile, critere.inutile) &&
                Objects.equals(texte, critere.texte) &&
                Objects.equals(references, critere.references) &&
                Objects.equals(note, critere.note) &&
                Objects.equals(coefficient, critere.coefficient);
    }

    public String getArbo(){
        String azer = this.inutile + "\n";

        if(this.Enfants.size()!=0){


            for(Critere critere:this.Enfants){
                azer+= critere.getArbo();

            }

        }
        return azer;
    }
    public Double getMoy(){
        Double moy=this.getNote();


        if(this.Enfants.size()!=0) {
            for (int i = 0; i < Enfants.size(); i++) {
                moy += Enfants.get(i).getMoy();

            }
        }

        return moy;
    }
}
