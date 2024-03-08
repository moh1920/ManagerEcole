//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
Ecole esprit = new Ecole("esprit");
Ecole tekup = new Ecole("tekup");
Etudiant E1 =new Etudiant3eme(14,"mohamed","sayari",15.03,"3b10");
esprit.ajouterEdutiant(E1);
//System.out.printf(esprit.toString());
esprit.changerEcole(E1,tekup);
System.out.printf(tekup.toString());


    }
}
