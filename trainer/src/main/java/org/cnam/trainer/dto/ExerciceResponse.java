package org.cnam.trainer.dto;

public class ExerciceResponse {
    public String ref;
    public String titre;
    public int pointsUnitaires;

    public ExerciceResponse(String ref, String titre, int pointsUnitaires) {
        this.ref = ref;
        this.titre = titre;
        this.pointsUnitaires = pointsUnitaires;
    }
}
