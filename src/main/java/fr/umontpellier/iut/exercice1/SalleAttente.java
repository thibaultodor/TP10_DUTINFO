package fr.umontpellier.iut.exercice1;

public class SalleAttente {
    private FilePriorite filePriorite;

    public SalleAttente() {
        filePriorite = new FilePriorite();
    }

    public void entrer(Personne p, int priorite){
        PersonnePriorisee personnePriorisee = new PersonnePriorisee(priorite,p);
        filePriorite.ajouter(personnePriorisee);
    }

    public String sortir(){
        return filePriorite.enlever().toString();
    }
}