import java.util.Random;
import java.io.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HeadlessHorseman {

public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

   public static void main(String[] args){
      ConsoleProgressBar x = new ConsoleProgressBar();
      Girls g = new Girls();
      Story s = new Story();
      Race r = new Race();
      
      x.Progress();
      s.Backstory();
      g.Like();
      Character c = s.Input();
      while (!c.equals('n')){ 
         g.Like();
         c = s.Input();
      }
      
      s.MoreStory();
      
      int score = r.ChaseObstacles();
      
      JFrame frame = new JFrame();

      try {
         frame.setSize(1920,1080); //sets size of JFrame to 1920x1080
   
   
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Ends the pinball game when JFrame window is closed
   
   
         Pinball panel = new Pinball();
      
   
         frame.add(panel); //adds 'panel' (contains pretty much entire pinball game) to the JFrame
   
         frame.setVisible(true);} //makes frame visible
      catch (Exception e){
         frame.setVisible(false); //if error happens close pinball game
      }
            
      try
      {
         Thread.sleep(1000); //waits for 1000 milliseconds
      }
      catch(InterruptedException ex)
      {
         Thread.currentThread().interrupt(); //prints out error messages and stops the Thread.sleep()
      }
      
      x.Progress();
      
      if (score > 0) {
         System.out.println("You escaped the headless horseman");
         System.out.println("Your final score is: " + score);
      }
      else {
         System.out.println("The headless horseman captured and killed you");
         System.out.println("Your final score is: " + score);
      }
   }      
}