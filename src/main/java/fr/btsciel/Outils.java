package fr.btsciel;

import java.text.DecimalFormat;

public class Outils {
    static DecimalFormat df = new DecimalFormat("0.00");
    static DecimalFormat df2 = new DecimalFormat("00000000");
    static DecimalFormat df3 = new DecimalFormat("000000");
    static DecimalFormat df4 = new DecimalFormat("0000");

    /**
     * Methode permettant de trier/afficher les pays appartenant a l'UE graçe a un tableau
     *
     * @param menu Valeur pour choisir l'action à faire
     * @param pays Tableau de type Pays que on recupere
     */
    public static String menu(int menu, Pays [] pays) {
        switch (menu) {
            case 1:
                sortNomCroissant(pays);
                break;
            case 2:
                sortCapitalCroissant(pays);
                break;
            case 3:
                sortNombreHabitantCroissant(pays);
                break;
            case 4:
                sortSuperficieCroissant(pays);
                break;
            case 5:
                sortDencite(pays);
                break;
            case 6:
                return getPaysPlusPeuple(pays);
            case 7:
                return getPaysPlusSuperficie(pays);
            case 8:
                return String.valueOf(getSuperficieTotal(pays));
            case 9:
                return String.valueOf(getNombreHabitantTotal(pays));
            case 10:
                return getDensiteTotal(pays);
            case 11:
                sortAdhesionsAnneeCroissante(pays);
                break;
        }
        return null;
    }

    /**
     * Methode permettant d'afficher les pays appartenant a l'UE trier par densité graçe a un tableau
     *
     * @param menu Valeur pour choisir l'action à faire dans le menu
     * @param pays Tableau de type Pays d'ou on recupere la densite et les noms
     */
    public static void affichageDensiteCroissant(int menu, Pays [] pays){
        Outils.menu(menu,pays);
        for (Pays p : pays) {
            System.out.print(df4.format(p.getDensite()) + " Habitant/km^2\t");
            System.out.println(p.getNom());
        }
    }

    /**
     * Methode permettant d'afficher les pays appartenant a l'UE trier par leur nom graçe a un tableau
     *
     * @param pays Tableau de type Pays d'ou on recupere les noms
     */
    public static void affichageNomCroissant(int menu,Pays [] pays) {
        Outils.menu(menu,pays);
        for (Pays p : pays) {
            System.out.println(p.getNom());
        }
    }

    /**
     * Methode permettant d'afficher les pays appartenant a l'UE trier par leur capitale graçe a un tableau
     *
     * @param pays Tableau de type Pays d'ou on recupere la capitale et les noms
     */
    public static void affichageCapitaleCroissant(int menu,Pays [] pays) {
        Outils.menu(menu,pays);
        for (Pays p : pays) {
            System.out.print(p.getCapitale() + "\t");
            System.out.println(p.getNom());
        }
    }

    /**
     * Methode permettant d'afficher les pays appartenant a l'UE trier par leur superficie graçe a un tableau
     *
     * @param pays Tableau de type Pays d'ou on recupere la supercifie et les noms
     */
    public static void affichageSuperficieCroissant(int menu,Pays [] pays){
        Outils.menu(menu,pays);
        for (Pays p : pays) {
            System.out.print(df3.format(p.getSuperficie()) + " km^2\t");
            System.out.println(p.getNom());
        }
    }

    /**
     * Methode permettant d'afficher les pays appartenant a l'UE trier par leur nombre d'habitant graçe a un tableau
     *
     * @param pays Tableau de type Pays d'ou on recupere le nombre d'habitant et les noms
     */
    public static void affichageNombreHabitantCroissant(int menu,Pays [] pays){
        Outils.menu(menu,pays);
        for (Pays p : pays) {
            System.out.print(df2.format(p.getNombreHabitant()) + "\t");
            System.out.println(p.getNom());
        }
    }

    /**
     * Methode permettant d'afficher la superficie totale de l'UE graçe a une méthode
     *
     * @param pays Tableau de type Pays d'ou on recupere les données
     */
    public static void affichageSuperficieTotal(int menu, Pays [] pays){
        System.out.println(Outils.menu(menu,pays) + " km^2");
    }

    /**
     * Methode permettant d'afficher le nombre d'habitant de l'UE graçe a une méthode
     *
     * @param pays Tableau de type Pays d'ou on recupere les données
     */
    public static void affichageNombreHabitantsTotal(int menu, Pays [] pays){
        System.out.println(Outils.menu(menu,pays) + "Habitants");
    }

    /**
     * Methode permettant d'afficher la densité de l'UE graçe à une méthode
     *
     * @param pays Tableau de type Pays d'ou on recupere les données
     */
    public static void affichageDensiteTotal(int menu, Pays [] pays){
        System.out.println(Outils.menu(menu,pays) + " Habitants/km^2");
    }

    /**
     * Methode permettant d'afficher les pays appartenant a l'UE trier par année d'ahdésion graçe a un tableau
     *
     * @param pays Tableau de type Pays d'ou on recupere l'année d'adhésion et les noms
     */
    public static void affichageAdhesionsAnneeCroissante(int menu , Pays[] pays){
        Outils.menu(menu,pays);
        for (Pays p : pays) {
            System.out.print(df4.format(p.getAnneeAdhesions()) + "\t");
            System.out.println(p.getNom());
        }
    }


    /**
     * Methode permettant le calcul de la densité de l'UE graçe a un tableau
     *
     * @param pays Tableau de type Pays d'ou on recupere les habitants de chaque pays
     * @return densiteTotal Valeur de la densité total
     */
    private static String getDensiteTotal(Pays[] pays) {
        double densiteTotal = getNombreHabitantTotal(pays)/getSuperficieTotal(pays);
        return df.format(densiteTotal);
    }

    /**
     * Methode permettant le calcul du nombre total d'habitant de l'UE graçe a un tableau
     *
     * @param pays Tableau de type Pays d'ou on recupere les habitants de chaque pays
     * @return habitantTotal Valeur du nombre d'habitant total
     */
    private static int getNombreHabitantTotal(Pays[] pays) {
        int habitantTotal = 0;
        for (int i = 0; i < pays.length; i++) {
            habitantTotal += pays[i].getNombreHabitant();
        }
        return habitantTotal;
    }

    /**
     * Methode permettant le calcul de la superficie total graçe a un tableau
     *
     * @param pays Tableau de type Pays d'ou on recupere la supercifie
     * @return superficieTotal Valeur total de la superficie
     */
    private static int getSuperficieTotal(Pays[] pays) {
        int superficieTotal = 0;
        for (int i = 0; i < pays.length; i++) {
            superficieTotal += pays[i].getSuperficie();
        }
        return superficieTotal;
    }

    /**
     * Methode permettant le recuperer le pays appartenant a l'UE ayant la superficie la plus élévé graçe a un tableau
     *
     * @param pays Tableau de type Pays d'ou on recupere la supercifie
     * @return nomPays Chaine de caractère contenant le nom du pays
     */
    private static String getPaysPlusSuperficie(Pays[] pays) {
        sortSuperficieCroissant(pays);
        String nomPays = pays[0].getNom();
        return nomPays;
    }

    /**
     * Methode permettant le recuperer le pays appartenant a l'UE ayant le nombre d'habitants le plus élévé graçe a un tableau
     *
     * @param pays Tableau de type Pays d'ou on recupere la supercifie
     * @return nomPays Chaine de caractère contenant le nom du pays
     */
    private static String getPaysPlusPeuple(Pays[] pays) {
        sortNombreHabitantCroissant(pays);
        String nomPays = pays[0].getNom();
        return nomPays;
    }

    /**
     * Methode permettant de trier les pays appartenant a l'UE par leur année d'adhésion graçe a un tableau
     *
     * @param pays Tableau de type Pays d'ou on recupere la supercifie
     */
    private static void sortAdhesionsAnneeCroissante(Pays[] pays) {
        for (int i = 0; i < pays.length - 1; i++) {
            for (int j = 0; j < pays.length - i - 1; j++) {
                int anneeAdhesion1 = pays[j].getAnneeAdhesions();
                int anneeAdhesion2 = pays[j + 1].getAnneeAdhesions();
                if (anneeAdhesion1 < anneeAdhesion2) {
                    Pays temp = pays[j];
                    pays[j] = pays[j + 1];
                    pays[j + 1] = temp;
                }
            }
        }
    }

    /**
     * Methode permettant de trier les pays appartenant a l'UE par leur dencité graçe a un tableau
     *
     * @param pays Tableau de type Pays d'ou on recupere la supercifie
     */
    private static void sortDencite(Pays[] pays) {
        for (int i = 0; i < pays.length - 1; i++) {
            for (int j = 0; j < pays.length - i - 1; j++) {
                double dencite1 = pays[j].getDensite();
                double dencite2 = pays[j + 1].getDensite();
                if (dencite1 < dencite2) {
                    Pays temp = pays[j];
                    pays[j] = pays[j + 1];
                    pays[j + 1] = temp;
                }
            }
        }
    }

    /**
     * Methode permettant de trier les pays appartenant a l'UE par leur superficie graçe a un tableau
     *
     * @param pays Tableau de type Pays d'ou on recupere la supercifie
     */
    private static void sortSuperficieCroissant(Pays[] pays) {
        for (int i = 0; i < pays.length - 1; i++) {
            for (int j = 0; j < pays.length - i - 1; j++) {
                double superficie1 = pays[j].getSuperficie();
                double superficie2 = pays[j + 1].getSuperficie();
                if (superficie1 < superficie2) {
                    Pays temp = pays[j];
                    pays[j] = pays[j + 1];
                    pays[j + 1] = temp;
                }
            }
        }
    }

    /**
     * Methode permettant de trier les pays appartenant a l'UE par leur nombre d'habitant graçe a un tableau
     *
     * @param pays Tableau de type Pays d'ou on recupere la supercifie
     */
    private static void sortNombreHabitantCroissant(Pays[] pays) {
        for (int i = 0; i < pays.length - 1; i++) {
            for (int j = 0; j < pays.length - i - 1; j++) {
                int nombre1 = pays[j].getNombreHabitant();
                int nombre2 = pays[j + 1].getNombreHabitant();
                if (nombre1 > nombre2) {
                    Pays temp = pays[j];
                    pays[j] = pays[j + 1];
                    pays[j + 1] = temp;
                }
            }
        }
    }

    /**
     * Methode permettant de trier les pays appartenant a l'UE par leur nom graçe a un tableau
     *
     * @param pays Tableau de type Pays d'ou on recupere la supercifie
     */
    private static void sortNomCroissant(Pays[] pays) {
        for (int i = 0; i < pays.length - 1; i++) {
            for (int j = 0; j < pays.length - i - 1; j++) {
                String nom1 = pays[j].getNom();
                String nom2 = pays[j + 1].getNom();
                if (nom1.compareTo(nom2) > 0) {
                    Pays temp = pays[j];
                    pays[j] = pays[j + 1];
                    pays[j + 1] = temp;
                }
            }
        }
    }

    /**
     * Methode permettant de trier les pays appartenant a l'UE par leur capital graçe a un tableau
     *
     * @param pays Tableau de type Pays d'ou on recupere la supercifie
     */
    private static void sortCapitalCroissant(Pays[] pays) {
        for (int i = 0; i < pays.length - 1; i++) {
            for (int j = 0; j < pays.length - i - 1; j++) {
                String capitale1 = pays[j].getCapitale();
                String capitale2 = pays[j + 1].getCapitale();
                if (capitale1.compareTo(capitale2) > 0) {
                    Pays temp = pays[j];
                    pays[j] = pays[j + 1];
                    pays[j + 1] = temp;
                }
            }
        }
    }
}
