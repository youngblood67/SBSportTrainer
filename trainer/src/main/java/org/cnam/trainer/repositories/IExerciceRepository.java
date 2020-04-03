package org.cnam.trainer.repositories;

import org.cnam.trainer.model.ExerciceModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IExerciceRepository extends JpaRepository<ExerciceModel,Integer> {
    ExerciceModel findByRef(String ref);
}
