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
        chasseur.blindage=156;
        chasseur.resistanceDuBouclier=2;

        Vaisseau vaisseauMonde=new VaisseauCivil("VAISSEAU-MONDE");
        vaisseauMonde.blindage=4784;
        vaisseauMonde.resistanceDuBouclier=30;

        vaisseauMonde.activerBouclier();
        chasseur.activerBouclier();
        ((VaisseauDeGuerre)chasseur).attaque(vaisseauMonde, "laser photonique", 3);
        vaisseauMonde.desactiverBouclier();

        System.out.println("Le Vaisseau-Monde dispose encore de "+vaisseauMonde.resistanceDuBouclier+" minutes de protection grâce à son bouclier.");
        System.out.println("Le Vaisseau-Monde dispose encore d'un blindage de valeur "+vaisseauMonde.blindage+".");

        mars.accueillirVaisseau(vaisseauMonde);
        mars.accueillirVaisseau(chasseur);

        Vaisseau chasseur20=new VaisseauDeGuerre("CHASSEUR");
        terre.accueillirVaisseau(chasseur20);
        System.out.println("Le chasseur a rejeté : "+chasseur20.emporterCargaison(20)+" tonnes.");
        Vaisseau fregate57=new VaisseauDeGuerre("FREGATE");
        fregate57.nbPassagers=100;
        terre.accueillirVaisseau(fregate57);
        System.out.println("La frégate a rejeté : "+fregate57.emporterCargaison(45)+" tonnes.");
        System.out.println("La frégate a rejeté : "+fregate57.emporterCargaison(12)+" tonnes.");
        Vaisseau fregate30=new VaisseauDeGuerre("FREGATE");
        fregate30.nbPassagers=14;
        terre.accueillirVaisseau(fregate30);
        System.out.println("La frégate a rejeté : "+fregate30.emporterCargaison(30)+" tonnes.");
        Vaisseau vaisseauMonde2060=new VaisseauCivil("VAISSEAU-MONDE");

        terre.accueillirVaisseau(vaisseauMonde2060);
        System.out.println("Le Vaisseau-Monde a rejeté : "+vaisseauMonde2060.emporterCargaison(1560)+" tonnes.");
        System.out.println("Le Vaisseau-Monde a rejeté : "+vaisseauMonde2060.emporterCargaison(600)+" tonnes.");

    }

}
