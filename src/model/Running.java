package model;

public class Running extends Training{
    private double distance;

    public Running(int averageНeartRate, int trainingDurationMinute, double weightAthletKilograms, double distance) {
        super(averageНeartRate, trainingDurationMinute, weightAthletKilograms);
        this.distance = distance;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    @Override
    public void getTrainingLog(){
        System.out.println("Беговая тренировка! Длительность: " + this.getTrainingDurationMinute() + " минут. Дистанция: "
                + this.distance + " км. Килокалорий: " + this.getCaloriesBurned());
    }
}
