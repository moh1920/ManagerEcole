import java.util.Objects;

public abstract class Etudiant {
    protected int identifant ;
    protected String nom ;
    protected String prenom;
    protected double moyenne ;

    public Etudiant(int identifant, String nom, String prenom, double moyenne) {
        this.identifant = identifant;
        this.nom = nom;
        this.prenom = prenom;
        this.moyenne = moyenne;
    }

    public int getIdentifant() {
        return identifant;
    }

    public void setIdentifant(int identifant) {
        this.identifant = identifant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public double getMoyenne() {
        return moyenne;
    }

    public void setMoyenne(double moyenne) {
        this.moyenne = moyenne;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Etudiant etudiant = (Etudiant) o;
        return identifant == etudiant.identifant && Objects.equals(nom, etudiant.nom);
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "identifant=" + identifant +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", moyenne=" + moyenne +
                '}';
    }
   public abstract void ajouterUneAbsence();
}
