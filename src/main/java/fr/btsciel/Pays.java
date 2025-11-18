package fr.btsciel;

public class Pays {
    private String nom;
    private String capitale;
    private int nombreHabitant;
    private double superficie;
    private double densite;

    public Pays(double superficie, int nombreHabitant, String capitale, String nom) {
        this.densite = nombreHabitant/superficie;
        this.superficie = superficie;
        this.nombreHabitant = nombreHabitant;
        this.capitale = capitale;
        this.nom = nom;
    }

    public static Pays[] sortNomCroissant(Pays[] pays) {
        Pays temp;
        for (int i = 0; i < pays.length-1; i++) {
            for (int j = 0; j < pays.length-i-1; j++) {
                if (pays[j].getNom().charAt(j) > pays[j+1].getNom().charAt(j)) {
                    temp = pays[j];
                    pays[j] = pays[j+1];
                    pays[j+1] = temp;
                }
            }
        }
        return pays;
    }

    public String getNom() {
        return nom;
    }


    public String getCapitale() {
        return capitale;
    }

    public int getNombreHabitant() {
        return nombreHabitant;
    }

    public double getSuperficie() {
        return superficie;
    }

    public double getDensite() {
        return densite;
    }
}
