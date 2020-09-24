package fr.umontpellier.iut.exercice3bis;
import fr.umontpellier.iut.exercice3.ObjetPriorise;

public class SalleAttenteGenerique<T> {
    private FilePriorite filePriorite;
    public SalleAttenteGenerique(){ filePriorite = new FilePriorite(); }
    public void entrer(T p, int priorite){ filePriorite.ajouter(new ObjetPriorise<T>(priorite, p)); }
    public String sortir(){
        return filePriorite.enlever().toString();
    }
}