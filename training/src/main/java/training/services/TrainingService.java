package training.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import training.builder.Converter;
import training.domain.Exercice;
import training.domain.Utilisateur;
import training.model.ExerciceModel;
import training.model.UtilisateurModel;
import training.repositories.IExerciceRepository;
import training.repositories.IUtilisateurRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class TrainingService {
    @Autowired
    private IUtilisateurRepository utilisateurRepository;
    @Autowired
    private IExerciceRepository exerciceRepository;

    public List<Utilisateur> findAllUtilisateurs() {
        List<UtilisateurModel> utilisateurModels = utilisateurRepository.findAll();
        List<Utilisateur> utilisateurs = new ArrayList<>();
        for (UtilisateurModel utilisateurModel : utilisateurModels) {
            utilisateurs.add(Converter.modelToDomain(utilisateurModel));
        }
        return utilisateurs;
    }

    public List<Exercice> findExercicesByUser(String pseudo) {
        List<ExerciceModel> exerciceModels = exerciceRepository.findByUtilisateur(utilisateurRepository.findByPseudo(pseudo));
        List<Exercice> exercices = new ArrayList<>();
        for (ExerciceModel exerciceModel : exerciceModels) {
            exercices.add(Converter.modelToDomain(exerciceModel));
        }
        return exercices;
    }
}
