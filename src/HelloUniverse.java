import java.util.Objects;
import java.util.Scanner;

public class HelloUniverse {

    public static void main(String... args) {

        PlaneteTellurique mercure = new PlaneteTellurique("Mercure");
        mercure.diametre = 4880;
        PlaneteTellurique venus = new PlaneteTellurique("Venus");
        venus.diametre = 12100;
        PlaneteTellurique terre = new PlaneteTellurique("Terre");
        terre.diametre = 12756;
        PlaneteTellurique mars = new PlaneteTellurique("Mars");
        mars.diametre = 6792;
        PlaneteGazeuse jupiter = new PlaneteGazeuse("Jupiter");
        jupiter.diametre = 142984;
        PlaneteGazeuse saturne = new PlaneteGazeuse("Saturne");
        saturne.diametre = 120536;
        PlaneteGazeuse uranus = new PlaneteGazeuse("Uranus");
        uranus.diametre = 51118;
        PlaneteGazeuse neptune = new PlaneteGazeuse("Neptune");
        neptune.diametre = 49532;

        Vaisseau chasseur=new VaisseauDeGuerre("CHASSEUR");
        chasseur.nbPassagers=2;
        Vaisseau fregate=new VaisseauDeGuerre("FREGATE");
        fregate.nbPassagers=12;
        Vaisseau croiseur=new VaisseauDeGuerre("CROISEUR");
        croiseur.nbPassagers=12;
        Vaisseau cargo=new VaisseauCivil("CARGO");
        cargo.nbPassagers=15;
        Vaisseau vaisseauMonde=new VaisseauCivil("VAISSEAU-MONDE");
        vaisseauMonde.nbPassagers=79;
        Vaisseau nouveauVaisseau = null;

        System.out.println("Quel type de vaisseau souhaitez-vous manipuler ?");
        Scanner sc = new Scanner(System.in);
         switch(sc.nextLine()) {
             case "CHASSEUR":
                 nouveauVaisseau = chasseur;
                 break;
             case "FREGATE":
                 nouveauVaisseau = fregate;
                 break;
             case "CROISEUR":
                 nouveauVaisseau = croiseur;
                 break;
             case "CARGO":
                 nouveauVaisseau = cargo;
                 break;
             case "VAISSEAU-MONDE":
                 nouveauVaisseau = vaisseauMonde;
                 break;
         }

        System.out.println("Sur quelle planete souhaitez-vous atterir ?");
        switch (sc.nextLine()) {
            case "Mercure" -> mercure.accueillirVaisseau(nouveauVaisseau);
            case "Venus" -> venus.accueillirVaisseau(nouveauVaisseau);
            case "Terre" -> terre.accueillirVaisseau(nouveauVaisseau);
            case "Mars" -> mars.accueillirVaisseau(nouveauVaisseau);
            case "Jupiter" -> System.out.println("Impossible d'accueillir des vaisseaux sur Jupiter");
            case "Saturne" -> System.out.println("Impossible d'accueillir des vaisseaux sur Saturne");
            case "Uranus" -> System.out.println("Impossible d'accueillir des vaisseaux sur Uranus");
            case "Neptune" -> System.out.println("Impossible d'accueillir des vaisseaux sur Neptune");
        }

        System.out.println("Quel tonnage souhaitez-vous emporter ?");
        int tonnageChoisi = sc.nextInt();
        System.out.println("Le " + Objects.requireNonNull(nouveauVaisseau).type + " a rejeté : "+nouveauVaisseau.emporterCargaison(tonnageChoisi)+" tonnes.");
    }
}
