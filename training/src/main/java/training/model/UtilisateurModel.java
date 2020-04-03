package training.model;


import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "utilisateur")
public class UtilisateurModel {

    @Id
    @GeneratedValue
    private int id;
    private String pseudo;
    private String email;

    @OneToMany(mappedBy = "utilisateur")
    private Collection<ExerciceModel> exercices;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Collection<ExerciceModel> getExercices() {
        return exercices;
    }

    public void setExercices(Collection<ExerciceModel> exercices) {
        this.exercices = exercices;
    }

    public UtilisateurModel() {
    }

    public UtilisateurModel(int id, String pseudo, String email) {
        this.id = id;
        this.email = email;
        this.pseudo = pseudo;
    }

}
