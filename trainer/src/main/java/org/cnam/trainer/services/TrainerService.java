package org.cnam.trainer.services;

import org.cnam.trainer.builder.Converter;
import org.cnam.trainer.domain.Exercice;
import org.cnam.trainer.model.ExerciceModel;
import org.cnam.trainer.repositories.IExerciceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TrainerService {
    @Autowired
    private IExerciceRepository repository;

    public List<Exercice> findAll(){
        List<ExerciceModel> exerciceModels = repository.findAll();
        List<Exercice> exercices = new ArrayList<>();
        for(ExerciceModel exerciceModel : exerciceModels){
            exercices.add(Converter.modelToDomain(exerciceModel));
        }
        return exercices;
    }

    public Exercice findByRef(String reference){
        reference = reference.toUpperCase();
        return (Converter.modelToDomain(repository.findByRef(reference)));
    }
}
