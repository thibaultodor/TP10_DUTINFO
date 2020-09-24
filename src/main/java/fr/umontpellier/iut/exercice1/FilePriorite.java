package fr.umontpellier.iut.exercice1;

import java.util.ArrayList;

public class FilePriorite {
    private ArrayList<TypePriorise> listeTypePriorise;

    public FilePriorite() {
        listeTypePriorise = new ArrayList<TypePriorise>();
    }

    public void ajouter(TypePriorise d){
        listeTypePriorise.add(d);
    }

    public TypePriorise enlever(){
        if(listeTypePriorise.isEmpty())
            throw new ArrayIndexOutOfBoundsException("La liste est vide");
        TypePriorise elementpluspetit = listeTypePriorise.get(0);
        for(int i=1; i< listeTypePriorise.size(); i++){
            if(elementpluspetit.getIndicePriorite()>listeTypePriorise.get(i).getIndicePriorite()){ elementpluspetit = listeTypePriorise.get(i); }
        }
        listeTypePriorise.remove(elementpluspetit);
        return elementpluspetit;
    }
}
