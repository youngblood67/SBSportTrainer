package training.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import training.TrainingSBApplication;
import training.domain.Exercice;
import training.domain.Utilisateur;
import training.dto.ExerciceDTO;
import training.dto.ExerciceResponse;
import training.dto.UtilisateurResponse;
import training.services.TrainingService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/training")
public class TrainingController {

    private static final Logger log = LoggerFactory.getLogger(TrainingSBApplication.class);

    private static final String TOPIC = "topictrainer";
    private static final String API_EXERCICES = "http://localhost:1111/api/trainer/exercices/";

    @Autowired
    private TrainingService trainingService;


    @GetMapping("/exercices/{utilisateur}")
    public List<ExerciceResponse> listExercicesByUser(@PathVariable("utilisateur") final String utilisateur) {
        RestTemplateBuilder builder = new RestTemplateBuilder();
        RestTemplate restTemplate = builder.build();

        List<ExerciceResponse> exerciceResponses = new ArrayList<>();
        List<Exercice> exercices = trainingService.findExercicesByUser(utilisateur);
        for (Exercice exercice : exercices) {
            ExerciceDTO exerciceDTO = restTemplate.getForObject(API_EXERCICES+exercice.getRef(),ExerciceDTO.class);
            exerciceResponses.add(new ExerciceResponse(exercice.getRef(), exerciceDTO.titre, exerciceDTO.pointsUnitaires, exercice.getNbRepets()));
        }
        return exerciceResponses;
    }

    @GetMapping("/utilisateurs")
    public List<UtilisateurResponse> listAllUtilisateurs() {
        List<UtilisateurResponse> utilisateurResponses = new ArrayList<>();
        List<Utilisateur> utilisateurs = trainingService.findAllUtilisateurs();
        for(Utilisateur utilisateur : utilisateurs){
            utilisateurResponses.add(new UtilisateurResponse(utilisateur.getPseudo(), utilisateur.getEmail(), 0));
        }
        return utilisateurResponses;
    }

}
