package model;

public class Crossfit extends Training{
    private double averageWeightInstrument;

    public Crossfit(int averageНeartRate, int trainingDurationMinute, double weightAthletKilograms, double averageWeightInstrument) {
        super(averageНeartRate, trainingDurationMinute, weightAthletKilograms);
        this.averageWeightInstrument = averageWeightInstrument;
    }

    public double getAverageWeightInstrument() {
        return averageWeightInstrument;
    }

    public void setAverageWeightInstrument(double averageWeightInstrument) {
        this.averageWeightInstrument = averageWeightInstrument;
    }

    @Override
    public void getTrainingLog() {
        System.out.println("Кроссфит тренировка! Длительность: " + this.getTrainingDurationMinute() + " минут. Средний вес штанги: "
                + this.averageWeightInstrument + " кг. Килокалорий: " + this.getCaloriesBurned());
    }
}
