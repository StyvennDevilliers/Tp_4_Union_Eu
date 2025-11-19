package fr.btsciel;

import clavier.*;

public class Ihm {
    public static void main(String[] args) {
        int menu;
        Pays [] pays = new Pays[27];
        pays = pays(pays);
        for (Pays p : pays) {
            System.out.println(p.getNom());
        }
        System.out.println("""
                
                1 pour lister les pays par ordre croissant du nom
                2 pour lister les pays par ordre croissant de la capitale
                3 pour lister les pays par ordre croissant du nombre d’habitants
                4 pour lister les pays par ordre croissant de la superficie
                5 pour lister les pays par ordre croissant de la densite
                6 le pays le plus peuple
                7 le pays ayant la plus grande superficie
                8 pour afficher la superficie totale de l'Union Europeenne
                9 pour afficher le nombre d'habitants de l'Union Europeenne
                10 pour afficher le nombre d'habitants au metre carre de l'Union Europeenne
                11 pour lister les adhesions par annee
                """);
        menu = In.readInteger();
        switch (menu) {
            case 1:
                Outils.affichageNomCroissant(menu, pays);
                break;
            case 2:
                Outils.affichageCapitaleCroissant(menu,pays);
                break;
            case 3:
                Outils.affichageNombreHabitantCroissant(menu,pays);
                break;
            case 4:
                Outils.affichageSuperficieCroissant(menu,pays);
                break;
            case 5:
                Outils.affichageDensiteCroissant(menu,pays);
                break;
            case 6,7:
                System.out.println(Outils.menu(menu,pays));
                break;
            case 8:
                Outils.affichageSuperficieTotal(menu,pays);
                break;
            case 9:
                Outils.affichageNombreHabitantsTotal(menu,pays);
                break;
            case 10:
                Outils.affichageDensiteTotal(menu,pays);
                break;
            case 11:
                Outils.affichageAdhesionsAnneeCroissante(menu,pays);
                break;
        }

    }

    public static Pays[] pays(Pays [] pays) {
        pays[26] = new Pays(357569,83445000,"Berlin","Allemagne",1958);
        pays[1] = new Pays(83882,9158750,"Vienne","Autriche",1995);
        pays[2] = new Pays(30667,11832049,"Bruxelles","Belgique",1958);
        pays[3] = new Pays(110996,6445481,"Sofia","Bulgarie",2007);
        pays[4] = new Pays(9253,933505,"Nicosie","Chypre",2004);
        pays[5] = new Pays(56594,3861967,"Zagreb","Croatie",2013);
        pays[6] = new Pays(42925,5961249,"Copenhague","Danemark",1973);
        pays[7] = new Pays(505983,48610458,"Madrid","Espagne",1986);
        pays[8] = new Pays(45336,1374687,"Tallin","Estonie",2004);
        pays[9] = new Pays(338363,5603851,"Helsinki","Finlande",1995);
        pays[10] = new Pays(638475,68401997,"Paris","France",1958);
        pays[11] = new Pays(131694,10397193,"Athenes","Grece",1981);
        pays[12] = new Pays(93012,9584627,"Budapest","Hongrie",2004);
        pays[13] = new Pays(69947,5343805,"Dublin","Irlande",1973);
        pays[14] = new Pays(302073,58989749,"Rome","Italie", 1958);
        pays[15] = new Pays(64594,1871882,"Riga","Lettonie",2004);
        pays[16] = new Pays(65284,2885891,"Vilnius","Lituanie",2004);
        pays[17] = new Pays(2595,672050,"Luxembourg","Luxembourg",1958);
        pays[18] = new Pays(316,563443,"La Valette","Malte",2004);
        pays[19] = new Pays(37391,17942942,"Amsterdam","Pays-Bas",1958);
        pays[20] = new Pays(311928,36620970,"Varsovie","Pologne",2004);
        pays[21] = new Pays(92226,10639726,"Lisbonne","Portugal",1986);
        pays[22] = new Pays(238398,19064409,"Bucarest","Roumanie",2007);
        pays[23] = new Pays(49035,5424687,"Bratislava","Slovaquie",2004);
        pays[24] = new Pays(20273,2123949,"Ljubljana","Slovenie",2004);
        pays[25] = new Pays(447424,10551707,"Stockholm","Suede",1995);
        pays[0] = new Pays(78871,10900555,"Prague","Tchequie",2004);
        return pays;
    }

}
