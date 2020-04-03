package training.dto;

public class ExerciceDTO {
    public String ref;
    public String titre;
    public int pointsUnitaires;

    public ExerciceDTO(){
        ref= "";
        titre = "";
        pointsUnitaires = 0;
    }

    public ExerciceDTO(String ref, String titre, int pointsUnitaires) {
        this.ref = ref;
        this.titre = titre;
        this.pointsUnitaires = pointsUnitaires;
    }
}
