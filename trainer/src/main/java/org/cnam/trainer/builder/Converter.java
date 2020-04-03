package org.cnam.trainer.builder;

import org.cnam.trainer.domain.Exercice;
import org.cnam.trainer.model.ExerciceModel;

public class Converter {
    public static Exercice modelToDomain(ExerciceModel exerciceModel) {
        return new Exercice(exerciceModel.getRef(), exerciceModel.getTitre(), exerciceModel.getPointsUnitaires());
    }
}
