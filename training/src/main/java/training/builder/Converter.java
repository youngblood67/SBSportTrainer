package training.builder;

import training.domain.Exercice;
import training.domain.Utilisateur;
import training.model.ExerciceModel;
import training.model.UtilisateurModel;

public class Converter {
    public static Utilisateur modelToDomain(UtilisateurModel utilisateurModel) {
        return new Utilisateur(utilisateurModel.getPseudo(), utilisateurModel.getEmail());
    }

    public static Exercice modelToDomain(ExerciceModel exerciceModel) {
        return new Exercice(exerciceModel.getRef(),exerciceModel.getNbRepet());
    }
}
