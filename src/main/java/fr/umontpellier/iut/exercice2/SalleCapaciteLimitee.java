package fr.umontpellier.iut.exercice2;

import fr.umontpellier.iut.exercice1.Personne;
import fr.umontpellier.iut.exercice1.SalleAttente;
import fr.umontpellier.iut.exercice2.exceptions.CapaciteMaximaleAtteinteException;
import fr.umontpellier.iut.exercice2.exceptions.SalleVideException;

public class SalleCapaciteLimitee {
    private SalleAttente salleAttente;
    private int capacite;
    private int nbPersonnesPresentes;

    SalleCapaciteLimitee(int capacitemax){
        salleAttente = new SalleAttente();
        capacite = capacitemax;
    }

    public void entrer(Personne p, int priorite) throws CapaciteMaximaleAtteinteException {
        if(nbPersonnesPresentes>=capacite){ throw new CapaciteMaximaleAtteinteException(capacite); }
        else{
            salleAttente.entrer(p, priorite);
            nbPersonnesPresentes++;
        }
    }

    public String personneSuivante() throws SalleVideException {
        try {
            return salleAttente.sortir();
        }
        catch (ArrayIndexOutOfBoundsException e) {
            throw new SalleVideException();
        }
    }
}
