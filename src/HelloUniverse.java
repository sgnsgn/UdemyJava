import java.util.Objects;
import java.util.Scanner;

public class HelloUniverse {

    public static void main(String... args) {

        PlaneteTellurique mercure = new PlaneteTellurique("Mercure",5);
        mercure.diametre = 4880;
        PlaneteTellurique venus = new PlaneteTellurique("Venus",2);
        venus.diametre = 12100;
        PlaneteTellurique terre = new PlaneteTellurique("Terre",20);
        terre.diametre = 12756;
        PlaneteTellurique mars = new PlaneteTellurique("Mars",5);
        mars.diametre = 6792;
        PlaneteGazeuse jupiter = new PlaneteGazeuse("Jupiter");
        jupiter.diametre = 142984;
        PlaneteGazeuse saturne = new PlaneteGazeuse("Saturne");
        saturne.diametre = 120536;
        PlaneteGazeuse uranus = new PlaneteGazeuse("Uranus");
        uranus.diametre = 51118;
        PlaneteGazeuse neptune = new PlaneteGazeuse("Neptune");
        neptune.diametre = 49532;

        Vaisseau chasseur = new VaisseauDeGuerre(TypeVaisseau.CHASSEUR);
        chasseur.nbPassagers = 2;
        Vaisseau fregate = new VaisseauDeGuerre(TypeVaisseau.FREGATE);
        fregate.nbPassagers = 12;
        Vaisseau croiseur = new VaisseauDeGuerre(TypeVaisseau.CROISEUR);
        croiseur.nbPassagers = 12;
        Vaisseau cargo = new VaisseauCivil(TypeVaisseau.CARGO);
        cargo.nbPassagers = 15;
        Vaisseau vaisseauMonde = new VaisseauCivil(TypeVaisseau.VAISSEAUMONDE);
        vaisseauMonde.nbPassagers = 79;

        Vaisseau chasseur1 = new VaisseauDeGuerre(TypeVaisseau.CHASSEUR);
        chasseur1.nbPassagers = 2;
        Vaisseau chasseur2 = new VaisseauDeGuerre(TypeVaisseau.CHASSEUR);
        chasseur2.nbPassagers = 1;
        Vaisseau cargo1 = new VaisseauCivil(TypeVaisseau.CARGO);
        cargo1.nbPassagers = 8;

        terre.accueillirVaisseaux(chasseur1, chasseur2, cargo1);

        /*
        Vaisseau nouveauVaisseau = null;


        boolean repeter = true;

        while(repeter) {
            System.out.println("Quel type de vaisseau souhaitez-vous manipuler ?");
            Scanner sc = new Scanner(System.in);

            String vaisseauSelectionne = sc.nextLine();
            TypeVaisseau typeVaisseau = TypeVaisseau.valueOf(vaisseauSelectionne);

            switch (typeVaisseau) {
                case CHASSEUR:
                    nouveauVaisseau = chasseur;
                    break;
                case FREGATE:
                    nouveauVaisseau = fregate;
                    break;
                case CROISEUR:
                    nouveauVaisseau = croiseur;
                    break;
                case CARGO:
                    nouveauVaisseau = cargo;
                    break;
                case VAISSEAUMONDE:
                    nouveauVaisseau = vaisseauMonde;
                    break;
            }

            System.out.println("Sur quelle planete souhaitez-vous atterir ?");
            switch (sc.nextLine()) {
                case "Mercure":
                    mercure.accueillirVaisseaux(nouveauVaisseau);
                    break;
                case "Venus":
                    venus.accueillirVaisseaux(nouveauVaisseau);
                    break;
                case "Terre":
                    terre.accueillirVaisseaux(nouveauVaisseau);
                    break;
                case "Mars":
                    mars.accueillirVaisseaux(nouveauVaisseau);
                    break;
                case "Jupiter":
                    System.out.println("Impossible d'accueillir des vaisseaux sur Jupiter");
                    break;
                case "Saturne":
                    System.out.println("Impossible d'accueillir des vaisseaux sur Saturne");
                    break;
                case "Uranus":
                    System.out.println("Impossible d'accueillir des vaisseaux sur Uranus");
                    break;
                case "Neptune":
                    System.out.println("Impossible d'accueillir des vaisseaux sur Neptune");
                    break;
            }

            System.out.println("Quel tonnage souhaitez-vous emporter ?");
            int tonnageChoisi = sc.nextInt();
            System.out.println("Le " + nouveauVaisseau.type + " a rejeté : " + nouveauVaisseau.emporterCargaison(tonnageChoisi) + " tonnes.");
            sc.nextLine();
            System.out.println("Voulez-vous recommencer oui/non ?");
            String reponse = sc.nextLine();
            if(reponse.equals("non")) repeter=false;
        }
        /*
        Atmosphere atmosphereUranus = new Atmosphere();
        atmosphereUranus.tauxHydrogene = new Float(83f);
        atmosphereUranus.tauxHelium = new Float(15f);
        atmosphereUranus.tauxMethane = new Float(2.5f);
        atmosphereUranus.tauxAzote = new Float(0.0f);
        uranus.atmosphere = atmosphereUranus;

        System.out.println("L'atmosphère de Uranus est composée :");

        if (uranus.atmosphere.tauxHelium != null) {
            System.out.println("A " + uranus.atmosphere.tauxHelium + "% d'Helium.");
        }
        if (uranus.atmosphere.tauxHydrogene != null) {
            System.out.println("A " + uranus.atmosphere.tauxHydrogene + "% d'Hydrogène.");
        }
        if (uranus.atmosphere.tauxAzote != null) {
            System.out.println("A " + uranus.atmosphere.tauxAzote + "% d'Azote.");
        }
        if (uranus.atmosphere.tauxArgon != null) {
            System.out.println("A " + uranus.atmosphere.tauxArgon + "% d'Argon.");
        }
        if (uranus.atmosphere.tauxDioxydeDeCarbone != null) {
            System.out.println("A " + uranus.atmosphere.tauxDioxydeDeCarbone + "% de Dioxyde de Carbone.");
        }
        if (uranus.atmosphere.tauxSodium != null) {
            System.out.println("A " + uranus.atmosphere.tauxSodium + "% de Sodium.");
        }
        if (uranus.atmosphere.tauxMethane != null) {
            System.out.println("A " + uranus.atmosphere.tauxMethane + "% de Methane.");
        }
        */
    }
}
