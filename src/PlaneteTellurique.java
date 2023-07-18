
public class PlaneteTellurique extends Planete implements Habitable {

    int totalVisiteurs;
    int tailleBaieAccostage;
    Vaisseau[] vaisseauxAccostes;
    int compteur=0;

    public PlaneteTellurique(String nom, int tailleBaieAccostage) {
        super(nom);
        this.tailleBaieAccostage = tailleBaieAccostage;
        this.vaisseauxAccostes = new Vaisseau[tailleBaieAccostage];
    }

    public Vaisseau accueillirVaisseau(Vaisseau nouveauVaisseau) {

        if (nouveauVaisseau instanceof VaisseauDeGuerre) {
            ((VaisseauDeGuerre) nouveauVaisseau).desactiverArmes();
        }

        totalVisiteurs += nouveauVaisseau.nbPassagers;

        if(restePlaceDisponible()){
            vaisseauxAccostes[compteur] = nouveauVaisseau;
            compteur+=1;
            return nouveauVaisseau;

        }
        else {
            System.out.println("Le vaisseau ne peut pas se poser sur la planète par manque de place dans la baie.");
            for (int i=0; i < vaisseauxAccostes.length;i++)
            {
                System.out.println("Un vaisseau de type " + vaisseauxAccostes[i].type + " est déja présent");
            }
            return null;
        }

    }

    boolean restePlaceDisponible() {
        for (int i = 0; i < tailleBaieAccostage; i++) {
            if (vaisseauxAccostes[i] == null) {
                return true;
            }
        }
        return false;
    }
}

