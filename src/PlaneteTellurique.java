
public class PlaneteTellurique extends Planete implements Habitable{

    Vaisseau vaisseauAccoste;
    int totalVisiteurs;

    public PlaneteTellurique(String nom) {
        super(nom);
    }

    public void accueillirVaisseau(Vaisseau nouveauVaisseau){

        if (nouveauVaisseau instanceof VaisseauDeGuerre){
            ((VaisseauDeGuerre)nouveauVaisseau).desactiverArmes();
        }

        totalVisiteurs+=nouveauVaisseau.nbPassagers;

        vaisseauAccoste=nouveauVaisseau;

    }
}
