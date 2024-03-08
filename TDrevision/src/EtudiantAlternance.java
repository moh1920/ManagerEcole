public class EtudiantAlternance extends Etudiant{
    private int salaire ;
    public EtudiantAlternance(int identifant, String nom, String prenom, double moyenne,int salaire) {
        super(identifant, nom, prenom, moyenne);
        this.salaire=salaire;
    }

    public int getSalaire() {
        return salaire;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }

    @Override
    public void ajouterUneAbsence() {
this.salaire-=50;
    }

    @Override
    public String toString() {
        return super.toString() + " salaire " + this.salaire ;
    }
}
