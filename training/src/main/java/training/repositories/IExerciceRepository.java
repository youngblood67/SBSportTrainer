package training.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import training.domain.Utilisateur;
import training.model.ExerciceModel;
import training.model.UtilisateurModel;

import java.util.List;

public interface IExerciceRepository extends JpaRepository<ExerciceModel, Integer> {
    List<ExerciceModel> findByUtilisateur(UtilisateurModel utilisateur);

}
