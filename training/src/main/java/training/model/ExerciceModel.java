package training.model;


import javax.persistence.*;

@Entity
@Table(name = "exercice")
public class ExerciceModel {

    @Id
    @GeneratedValue
    private int id;
    private String ref;
    private int nbRepet;

    @ManyToOne
    @JoinColumn(name = "utilisateur_id", nullable = false)
    private UtilisateurModel utilisateur;

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

    public int getNbRepet() {
        return nbRepet;
    }

    public void setNbRepet(int nbRepet) {
        this.nbRepet = nbRepet;
    }

    public UtilisateurModel getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(UtilisateurModel utilisateur) {
        this.utilisateur = utilisateur;
    }

    public ExerciceModel() {
    }

    public ExerciceModel(int id, String ref, int nbRepet) {
        this.id = id;
        this.ref = ref;
        this.nbRepet = nbRepet;
    }
}
