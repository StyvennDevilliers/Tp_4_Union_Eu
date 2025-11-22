package fr.btsciel;

public class Pays {
    private  String nom;
    private  String capitale;
    private  int nombreHabitant;
    private  int superficie;
    private  double densite;
    private  int anneeAdhesions;

    public Pays(int superficie, int nombreHabitant, String capitale, String nom, int anneeAdhesions) {
        this.anneeAdhesions = anneeAdhesions;
        this.densite = (double) nombreHabitant / superficie;
        this.superficie = superficie;
        this.nombreHabitant = nombreHabitant;
        this.capitale = capitale;
        this.nom = nom;
    }

    public int getAnneeAdhesions() {
        return anneeAdhesions;
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


    public int getSuperficie() {
        return superficie;
    }

    public double getDensite() {
        return densite;
    }
}

