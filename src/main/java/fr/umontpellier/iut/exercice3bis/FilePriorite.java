package fr.umontpellier.iut.exercice3bis;
import fr.umontpellier.iut.exercice1.TypePriorise;

import java.util.ArrayList;

public class FilePriorite<T extends TypePriorise> {
    private final ArrayList<T> filePriorite;

    public FilePriorite() { filePriorite = new ArrayList<>(); }

    public void ajouter(T objetPriorise) { filePriorite.add(objetPriorise); }

    public T enlever() {
        if (filePriorite.isEmpty()) {
            throw new ArrayIndexOutOfBoundsException("La liste est vide");
        } else {
            int min = filePriorite.get(0).getIndicePriorite();
            int indiceMin = 0;
            for (int i = 0; i < filePriorite.size(); i++) {
                int indicePriorite = filePriorite.get(i).getIndicePriorite();
                if (indicePriorite < min) {
                    indiceMin = i;
                    min = indicePriorite;
                }
            }
            return filePriorite.remove(indiceMin);
        }
    }
}