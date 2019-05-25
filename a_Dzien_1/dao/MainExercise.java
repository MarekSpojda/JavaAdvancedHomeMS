package a_Dzien_1.dao;

import java.util.List;

public class MainExercise {
    public static void main(String[] args) {
        // create exercise
        ExerciseDao exerciseDao = new ExerciseDao();
        Exercise exercise = new Exercise("Testowanie ćwiczeń", "Wykonywanie zadań domowych");
        //save exercise to database
        exerciseDao.save(exercise);

        //get all groups
        List<Model> exercises = exerciseDao.loadAll();
        for (Model model : exercises) {
            Exercise myExercise = (Exercise) model;
            System.out.println(myExercise);
        }
    }
}
