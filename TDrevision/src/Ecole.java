import java.util.Arrays;

public class Ecole {
    private String nom ;
    private  Etudiant[] etudiants;

    public Ecole(String nom) {
        this.nom = nom;
        this.etudiants=new Etudiant[500];
    }
    public int rechercherEdutiant(Etudiant e){
        for (Etudiant etudiant : etudiants){
            if(etudiant == e)
                return 1;
        }
        return -1 ;
    }
    public void ajouterEdutiant (Etudiant e){
        if(rechercherEdutiant(e)==-1||etudiants.length<500){
         for(int i=0;i<etudiants.length;i++){
             if(etudiants[i]==null){
                 etudiants[i]=e ;
                 break;
             }}
            System.out.printf("add succesfull");
        }else{
            System.out.printf("add erreur");
        }
    }
    public double getMoyenneDes3A(){
        double moy_3 = 0 ;
        int nbEdutiant = 0;
        for(int i =0 ;i<etudiants.length;i++){
            if(etudiants[i] != null ){
                moy_3+=etudiants[i].moyenne ;
                nbEdutiant ++ ;
            }
        }
        return moy_3/nbEdutiant ;
    }

    @Override
    public String toString() {
        return "Ecole{" +
                "nom='" + nom + '\'' +
                ", etudiants=" + Arrays.toString(etudiants) +
                '}'+ " moyenne de la class " + getMoyenneDes3A();
    }
    public void changerEcole(Etudiant etd,Ecole e){
        int trouve = rechercherEdutiant(etd);
        int nbEtudiant =0 ;
//        for(Etudiant etudiant:etudiants){
//            nbEtudiant ++ ;
//        }
        if(trouve == 1){
            for(int i=0;i<etudiants.length;i++){
                if(etd == etudiants[i]){
                    etudiants[i]=etudiants[i+1];
                }
            }
            e.ajouterEdutiant(etd);

        } else {
            System.out.printf("student don't foind ");
        }
    }

}
