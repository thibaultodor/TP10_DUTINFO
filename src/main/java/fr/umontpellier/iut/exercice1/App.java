package fr.umontpellier.iut.exercice1;

public class App {
    public static void main(String[] args) {
        SalleAttente salleAttente = new SalleAttente();
        Personne p1 = new Personne("Jorge");
        Personne p2 = new Personne("Fabrice");
        salleAttente.entrer(p1,4);
        salleAttente.entrer(p2,3);
        System.out.println(salleAttente.sortir());
        System.out.println(salleAttente.sortir());
    }
}
