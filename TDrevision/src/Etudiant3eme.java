public class Etudiant3eme extends Etudiant {
    private String branche;
    public Etudiant3eme(int identifant, String nom, String prenom, double moyenne,String branche) {
        super(identifant, nom, prenom, moyenne);
        this.branche=branche ;
    }

    public String getBranche() {
        return branche;
    }

    public void setBranche(String branche) {
        this.branche = branche;
    }

    @Override
    public void ajouterUneAbsence() {
     this.moyenne-=0.5 ;
    }
}
