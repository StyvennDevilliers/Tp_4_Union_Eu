package fr.btsciel;

public class Pays {
    private static String nom;
    private static String capitale;
    private static int nombreHabitant;
    private static int superficie;
    private static double densite;
    private static int anneeAdhesions;

    public Pays(int superficie, int nombreHabitant, String capitale, String nom, int anneeAdhesions) {
        this.anneeAdhesions = anneeAdhesions;
        this.densite = (double) nombreHabitant / superficie;
        this.superficie = superficie;
        this.nombreHabitant = nombreHabitant;
        this.capitale = capitale;
        this.nom = nom;
    }

    public static int getAnneeAdhesions() {
        return anneeAdhesions;
    }

    public String getNom() {
        return nom;
    }

    public String getCapitale() {
        return capitale;
    }

    public static int getNombreHabitant() {
        return nombreHabitant;
    }


    public static int getSuperficie() {
        return superficie;
    }

    public static double getDensite() {
        return densite;
    }
}

