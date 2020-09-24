package fr.umontpellier.iut.exercice1;

public class PersonnePriorisee implements TypePriorise {
    private Personne personne;
    private int priorite;

    public PersonnePriorisee(int priorite,Personne personne) {
        this.personne = personne;
        this.priorite = priorite;
    }

    @Override
    public int getIndicePriorite() {
        return priorite;
    }

    @Override
    public String toString() {
        return  "personne=" + personne.toString() +
                ", priorite=" + this.getIndicePriorite();
    }
}
