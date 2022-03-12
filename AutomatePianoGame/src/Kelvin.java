import java.awt.MouseInfo;
import java.awt.Robot;
import java.awt.AWTException;


public class Kelvin{
    
    int time;
    

    public Kelvin(Robot robot, int time){

        this.time = time;
    }

    public void find(){
        //Point p = MouseInfo.getPointerInfo().getLocation();    
        //int x = p.x;
        //int y = p.y;
    
        while(true){
          //Thread.sleep(100);
          System.out.println("(" + MouseInfo.getPointerInfo().getLocation().x + 
                  ", " + 
                  MouseInfo.getPointerInfo().getLocation().y + ")");
        
    }
        }

    public void playGame() throws AWTException{
        
        Robot robot = new Robot();
        int rgb = 111111;


        robot.delay(1500);
        int[] x= {160, 265, 365, 465};
        int[] y= {632, 632, 632, 632};

        for(; time >= 0; time--){
            for(int i = 0; i<x.length; i++){
                if(rgb == 111111){
                   robot.mouseMove(x[i],y[i]);
                   //robot.mousePress();
            }
          }   
        }
      
    }

}

