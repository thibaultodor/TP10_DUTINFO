package fr.umontpellier.iut.exercice3;
import fr.umontpellier.iut.exercice1.FilePriorite;

public class SalleAttenteGenerique<T> {
    private FilePriorite filePriorite;

    public SalleAttenteGenerique() {
        filePriorite = new FilePriorite();
    }

    public void entrer(T objet, int priorite){
        ObjetPriorise<T> objetPriorise = new ObjetPriorise<T>(priorite,objet);
        filePriorite.ajouter(objetPriorise);
    }

    public String sortir(){
        return filePriorite.enlever().toString();
    }
}