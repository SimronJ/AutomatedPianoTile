import java.awt.Robot;

public class App {
    public static void main(String[] args) throws Exception {
        Robot robot = new Robot();

        //sim implementation
        SimWack simWack = new SimWack();
        simWack.StartTheGame(robot);

    }

}