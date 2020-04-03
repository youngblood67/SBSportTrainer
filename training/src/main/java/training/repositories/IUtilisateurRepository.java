package training.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import training.model.UtilisateurModel;

public interface IUtilisateurRepository extends JpaRepository<UtilisateurModel,Integer> {
    UtilisateurModel findByPseudo(String pseudo);
}
