package fr.umontpellier.iut.exercice2;

import fr.umontpellier.iut.exercice1.Personne;
import fr.umontpellier.iut.exercice2.exceptions.SalleCapaciteLimiteeException;

public class App {
    public static void main(String[] args) {
        Personne p1 = new Personne("Jorge");
        Personne p2 = new Personne("Fabrice");
        SalleCapaciteLimitee salleCapaciteLimitee = new SalleCapaciteLimitee(1);
        try{
            salleCapaciteLimitee.entrer(p1,3);
            salleCapaciteLimitee.entrer(p2,2);
        }
        catch (SalleCapaciteLimiteeException e){
            System.err.println(e.getMessage());
        }

        try{
            System.out.println(salleCapaciteLimitee.personneSuivante());
            System.out.println(salleCapaciteLimitee.personneSuivante());
        }
        catch (SalleCapaciteLimiteeException e){
            System.err.println(e.getMessage());
        }
    }
}