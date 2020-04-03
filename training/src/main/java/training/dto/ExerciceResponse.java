package training.dto;

public class ExerciceResponse {
    public String ref;
    public String titre;
    public int pointsUnitaires;
    public int nbRepets;

    public ExerciceResponse(String ref, String titre, int pointsUnitaires, int nbRepets) {
        this.ref = ref;
        this.titre = titre;
        this.pointsUnitaires = pointsUnitaires;
        this.nbRepets = nbRepets;
    }
}
