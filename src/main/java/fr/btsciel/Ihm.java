package fr.btsciel;

import clavier.In;

public class Ihm {
    public static void main(String[] args) {
        int menu;
        Pays [] pays = new Pays[27];
        for (Pays p : pays(pays)) {
            System.out.println(p.getNom());
        }
        System.out.println("""
                1 pour lister les pays par ordre croissant du nom
                2 pour lister les pays par ordre croissant de la capitale
                3 pour lister les pays par ordre croissant du nombre d’habitants
                4 pour lister les pays par ordre croissant de la superficie
                5 pour lister les pays par ordre croissant de la densité
                """);
        menu = In.readInteger();
        System.out.println(Outils.menu(menu,pays(pays)));
        for (Pays p : pays(pays)) {
            System.out.println(p.getNom());
        }
    }

    public static Pays[] pays(Pays [] pays) {
        pays[26] = new Pays(357569000,83445000,"Berlin","Allemagne");
        pays[1] = new Pays(83882000,9158750,"Vienne","Autriche");
        pays[2] = new Pays(30667000,11832049,"Bruxelles","Belgique");
        pays[3] = new Pays(110996000,6445481,"Sofia","Bulgarie");
        pays[4] = new Pays(9253000,933505,"Nicosie","Chypre");
        pays[5] = new Pays(56594000,3861967,"Zagreb","Croatie");
        pays[6] = new Pays(42925000,5961249,"Copenhague","Danemark");
        pays[7] = new Pays(505983000,48610458,"Madrid","Espagne");
        pays[8] = new Pays(45336000,1374687,"Tallin","Estonie");
        pays[9] = new Pays(338363000,5603851,"Helsinki","Finlande");
        pays[10] = new Pays(638475000,68401997,"Paris","France");
        pays[11] = new Pays(131694000,10397193,"Athenes","Grece");
        pays[12] = new Pays(93012000,9584627,"Budapest","Hongrie");
        pays[13] = new Pays(69947000,5343805,"Dublin","Irlande");
        pays[14] = new Pays(302073000,58989749,"Rome","Italie");
        pays[15] = new Pays(64594000,1871882,"Riga","Lettonie");
        pays[16] = new Pays(65284000,2885891,"Vilnius","Lituanie");
        pays[17] = new Pays(2595000,672050,"Luxembourg","Luxembourg");
        pays[18] = new Pays(316000,563443,"La Valette","Malte");
        pays[19] = new Pays(37391000,17942942,"Amsterdam","Pays-Bas");
        pays[20] = new Pays(311928000,36620970,"Varsovie","Pologne");
        pays[21] = new Pays(92226000,10639726,"Lisbonne","Portugal");
        pays[22] = new Pays(238398000,19064409,"Bucarest","Roumanie");
        pays[23] = new Pays(49035000,5424687,"Bratislava","Slovaquie");
        pays[24] = new Pays(20273000,2123949,"Ljubljana","Slovenie");
        pays[25] = new Pays(447424000,10551707,"Stockholm","Suede");
        pays[0] = new Pays(78871000,10900555,"Prague","Tchequie");
        return pays;
    }

}
