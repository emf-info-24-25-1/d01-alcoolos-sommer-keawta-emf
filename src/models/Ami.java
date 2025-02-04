package models;

public class Ami {
    private final String nom;
    private int nbBieresMax;

    public Ami(String nom, int nbBieresMax) {
        this.nom = nom;
        this.nbBieresMax = nbBieresMax;
    }

    public void boitUneBiere() {
        System.out.println(nom + " boit une bière...");
        nbBieresMax--;
        if (nbBieresMax < 0) {
            System.out.println("Aie... " + nom + " ne peut plus boire pour des raisons de sécurité.");
        } else {
            System.out.println("Yeppee ! " + nom + " peut encore boire " + nbBieresMax + " bières.");
        }
    }

    public String getNom() {
        return nom;
    }

    public int getNbBieresMax() {
        return nbBieresMax;
    }

    public void setNbBieresMax(int nbBieresMax) {
        this.nbBieresMax = nbBieresMax;
    }

    public void montreAmi() {
        System.out.println("Nom: " + nom + ", Nombre de bières max: " + nbBieresMax);
    }
}