package model;

public class Boxing extends Training{

    public Boxing(int averageНeartRate, int trainingDurationMinute, double weightAthletKilograms) {
        super(averageНeartRate, trainingDurationMinute, weightAthletKilograms);
    }

    @Override
    public void getTrainingLog(){
        System.out.println("Тренировка по кикбоксингу! Длительность: " + this.getTrainingDurationMinute() +  " минут. Килокалорий: " + this.getCaloriesBurned());
    }
}
