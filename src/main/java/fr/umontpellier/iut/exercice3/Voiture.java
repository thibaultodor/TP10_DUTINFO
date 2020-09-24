package fr.umontpellier.iut.exercice3;

public class Voiture {
    private String immatriculation;
    private String couleur;

    public Voiture(String immatriculation, String couleur) {
        this.immatriculation = immatriculation;
        this.couleur = couleur;
    }

    @Override
    public String toString() {
        return "immatriculation= '" + immatriculation +
                " , couleur=" + couleur;
    }
}
