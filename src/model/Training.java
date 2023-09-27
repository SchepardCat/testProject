package model;

public abstract class Training {
    private int averageНeartRate;
    private int trainingDurationMinute;
    private double weightAthletKilograms;

    public Training(int averageНeartRate, int trainingDurationMinute, double weightAthletKilograms) {
        this.averageНeartRate = averageНeartRate;
        this.trainingDurationMinute = trainingDurationMinute;
        this.weightAthletKilograms = weightAthletKilograms;
    }

    public int getAverageНeartRate() {
        return averageНeartRate;
    }

    public void setAverageНeartRate(int averageНeartRate) {
        this.averageНeartRate = averageНeartRate;
    }

    public int getTrainingDurationMinute() {
        return trainingDurationMinute;
    }

    public void setTrainingDurationMinute(int trainingDurationMinute) {
        this.trainingDurationMinute = trainingDurationMinute;
    }

    public double getWeightAthletKilograms() {
        return weightAthletKilograms;
    }

    public void setWeightAthletKilograms(double weightAthletKilograms) {
        this.weightAthletKilograms = weightAthletKilograms;
    }

    public double getCaloriesBurned(){
        return 0.014*this.weightAthletKilograms*this.trainingDurationMinute*(0.12*this.averageНeartRate-7);
    }

    public void getTrainingLog(){}
}
