package fr.umontpellier.iut.exercice3;
import fr.umontpellier.iut.exercice1.TypePriorise;

public class ObjetPriorise<T> implements TypePriorise {
    private int priorite;
    private T objet;

    public ObjetPriorise(int priorite, T objet) {
        this.priorite = priorite;
        this.objet = objet;
    }

    @Override
    public int getIndicePriorite() {
        return priorite;
    }

    @Override
    public String toString() {
        return  "Objet de type " +objet.getClass().getSimpleName() + " : " + objet.toString() +
                ", priorite=" + this.getIndicePriorite();
    }
}