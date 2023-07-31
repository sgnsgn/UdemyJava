
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

    @Override
    public void accueillirVaisseaux(Vaisseau... nouveauxVaisseaux) {

        for (int i = 0;i< nouveauxVaisseaux.length;i++) {
            if (nouveauxVaisseaux[i] instanceof VaisseauDeGuerre) {
                ((VaisseauDeGuerre) nouveauxVaisseaux[i]).desactiverArmes();
            }

            totalVisiteurs += nouveauxVaisseaux[i].nbPassagers;

            if (restePlaceDisponible()) {
                vaisseauxAccostes[compteur] = nouveauxVaisseaux[i];
                compteur += 1;

            } else {
                System.out.println("Le vaisseau ne peut pas se poser sur la planète par manque de place dans la baie.");
                for (int j = 0; j < vaisseauxAccostes.length; j++) {
                    System.out.println("Un vaisseau de type " + vaisseauxAccostes[j].type + " est déja présent");
                }
            }

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

