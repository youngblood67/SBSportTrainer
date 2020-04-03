package org.cnam.trainer.controllers;

import org.cnam.trainer.domain.Exercice;
import org.cnam.trainer.dto.ExerciceResponse;
import org.cnam.trainer.services.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/trainer")
public class TrainerController {
    private static final String TOPIC = "topictrainer";

    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    @Autowired
    private TrainerService trainerService;

    @GetMapping("/exercices")
    public List<ExerciceResponse> listAllExercices() {
        List<ExerciceResponse> exercicesResponses = new ArrayList<>();
        List<Exercice> exercices = trainerService.findAll();
        for (Exercice exercice : exercices) {
            ExerciceResponse exerciceResponse = new ExerciceResponse(exercice.getRef(), exercice.getTitre(), exercice.getPointsUnitaires());
            exercicesResponses.add(exerciceResponse);
        }
        kafkaTemplate.send(TOPIC,exercicesResponses);
        return exercicesResponses;
    }

    @GetMapping("/exercices/{reference}")
    public ExerciceResponse getExerciceByReference(@PathVariable("reference") final String reference) {
        Exercice exercice = trainerService.findByRef(reference);
        ExerciceResponse exerciceResponse = new ExerciceResponse(exercice.getRef(),exercice.getTitre(), exercice.getPointsUnitaires());
        kafkaTemplate.send(TOPIC,exerciceResponse);
        return exerciceResponse;
    }



}
