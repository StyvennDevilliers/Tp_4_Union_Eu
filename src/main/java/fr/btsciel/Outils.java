package fr.btsciel;

import clavier.In;

public class Outils {
    private static Pays [] pays = new Pays[26];

    public static void menu(int menu) {
        switch (menu) {
            case 1:
                Pays.sortNomCroissant(Ihm.pays(pays));
            case 2:

            case 3:

            case 4:

            case 5:

        }
    }
}
