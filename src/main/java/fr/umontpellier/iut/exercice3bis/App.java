package fr.umontpellier.iut.exercice3bis;

import fr.umontpellier.iut.exercice1.Personne;
import fr.umontpellier.iut.exercice3.Voiture;

public class App {
    public static void main(String[] args) {
        SalleAttenteGenerique<Object> salleAttenteGenerique = new SalleAttenteGenerique<>();
        Personne p1 = new Personne("Jorge");
        Personne p2 = new Personne("Fabrice");
        Voiture v = new Voiture("FSF1245", "Bleu");
        salleAttenteGenerique.entrer(p1,4);
        salleAttenteGenerique.entrer(p2,3);
        salleAttenteGenerique.entrer(v,5);
        System.out.println(salleAttenteGenerique.sortir());
        System.out.println(salleAttenteGenerique.sortir());
        System.out.println(salleAttenteGenerique.sortir());
    }
}
