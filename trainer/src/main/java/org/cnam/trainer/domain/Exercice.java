package org.cnam.trainer.domain;

public class Exercice {
    private String ref;
    private String titre;
    private int pointsUnitaires;

    public Exercice(String ref, String titre, int pointsUnitaires) {
        this.ref = ref;
        this.titre = titre;
        this.pointsUnitaires = pointsUnitaires;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public int getPointsUnitaires() {
        return pointsUnitaires;
    }

    public void setPointsUnitaires(int pointsUnitaires) {
        this.pointsUnitaires = pointsUnitaires;
    }
}
