public enum TypeVaisseau {
    CHASSEUR("Chasseur"), FREGATE("Frégate"), CROISEUR("Croiseur"), CARGO("Cargo"), VAISSEAUMONDE("Vaisseau-monde");

    final String nom;

    TypeVaisseau(String nom){
        this.nom=nom;
    }
}
