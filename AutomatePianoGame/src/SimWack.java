import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.Point;
import java.awt.MouseInfo;

public class SimWack {
    public void StartTheGame(Robot robot) throws AWTException {
        //sim laptop coordinates
        int[] x = {224, 314, 417, 528};
        int[] y = {650, 650, 650, 650};

        robot.delay(2000);
        while(true){
            for(int i = 0; i < x.length; i++){
                robot.mouseMove(x[i], y[i]);
                Point pointer = MouseInfo.getPointerInfo().getLocation();              
                
                if(robot.getPixelColor(x[i], y[i]).hashCode() == -15658735){
                    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                    robot.delay(30);
                }

                if( pointer.getY() != y[i]){
                    System.out.println("Stopping the game.");
                    System.exit(0);
                } 
            }
        }

    }

    public void mousePointerPosition(Robot robot) throws AWTException{
        long end = System.currentTimeMillis()+20000;
        while(end >= System.currentTimeMillis()){
            robot.delay(1000);
            Point p = MouseInfo.getPointerInfo().getLocation();
            System.out.println("X:" + p.x + " " + "Y:" + p.y);
            System.out.println("Pixel Color:" + robot.getPixelColor(p.x, p.y));
            System.out.println("Pixel HashCode:" + robot.getPixelColor(p.x, p.y).hashCode());
        }
    }

// if(timetoUseKeys <= System.currentTimeMillis()){
//     //a s d f
//     switch(i){
//         case 0:
//             if(robot.getPixelColor(x[i], y[i]).hashCode() == -15658735){
//                 robot.keyPress(KeyEvent.VK_A);
//                 robot.keyRelease(KeyEvent.VK_A);
//                 robot.delay(100);
//             }
//         break;
//         case 1:
//             if(robot.getPixelColor(x[i], y[i]).hashCode() == -15658735){
//                 robot.keyPress(KeyEvent.VK_S);
//                 robot.keyRelease(KeyEvent.VK_S);
//                 robot.delay(100);
//             }
//         break;
//         case 2:
//             if(robot.getPixelColor(x[i], y[i]).hashCode() == -15658735){
//                 robot.keyPress(KeyEvent.VK_D);
//                 robot.keyRelease(KeyEvent.VK_D);
//                 robot.delay(100);
//             }
//         break;
//         case 3:
//             if(robot.getPixelColor(x[i], y[i]).hashCode() == -15658735){
//                 robot.keyPress(KeyEvent.VK_F);
//                 robot.keyRelease(KeyEvent.VK_F);
//                 robot.delay(100);
//             }
//         break;
//     }
// }
}
