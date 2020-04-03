package org.cnam.trainer.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "exercice")
public class ExerciceModel {

    @Id
    @GeneratedValue
    private int id;
    private String ref;
    private String titre;
    private int pointsUnitaires;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public ExerciceModel() {
    }

    public ExerciceModel(int id, String ref, String titre, int pointsUnitaires) {
        this.id = id;
        this.ref = ref;
        this.titre = titre;
        this.pointsUnitaires = pointsUnitaires;
    }
}
