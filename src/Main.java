import model.Boxing;
import model.Crossfit;
import model.Running;
import model.Training;


public class Main {
    public static void main(String[] args) {
        Training[] trainingArray = new Training[4];
        trainingArray[0] = new Running(107, 60, 80, 8);
        trainingArray[1] = new Running(88, 35, 80, 4);
        trainingArray[2] = new Crossfit(80, 25, 80, 90);
        trainingArray[3] = new Boxing(120, 40, 80);
        for(Training training:trainingArray){
            training.getTrainingLog();
        }
    }
}