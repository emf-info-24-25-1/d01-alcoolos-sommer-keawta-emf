package app;

public class Ami {
    private String nom;
    private int nb_bieres_max;

    public Ami(String nom, int nb_bieres_max) {
        this.nom = nom;
        this.nb_bieres_max = nb_bieres_max;
    }

    public String getNom() {
        return nom;
    }

    public int getNb_max_bieres() {
        return nb_bieres_max;
    }

    public void setNb_bieres_max(int nb_bieres_max) {
        this.nb_bieres_max = nb_bieres_max;
    }

    public void boitUneBiere() {
        System.out.println(nom + " boit une bière...");
        nb_bieres_max--;
        if (nb_bieres_max <= 0) {
            System.out.println("Aie... " + nom + " ne peut plus boire pour des raisons de sécurité.");
        } else {
            System.out.println("Yeppee ! " + nom + " peut encore boire " + nb_bieres_max + " bières.");
        }
    }

    public void montreAmi() {
        System.out.println("Nom: " + nom + ", Nombre de bières max: " + nb_bieres_max);
    }
}
