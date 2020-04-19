import java.util.Random;
import java.io.*;

public class Race {
   public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   public static String[] obstacles = {"rock", "tree", "old lady", "animal", "road closed"};
   
   public static int ChaseObstacles() {
      int score = 0;
      
      for (String obst : obstacles){
         int check = -1;
         if (obst.equals("rock")){
            System.out.println("You have enountered a rock. Jump over (0) or go around (1)?");
            while (check != 0 && check != 1){
               try {
                  check = Integer.parseInt(br.readLine());
                  if (check == 0){
                     System.out.println("Bad decision. You have sprained your ankle.");
                     score--;
                  }
                  else if (check == 1){
                     System.out.println("Good decision. You passed this obstacle.");
                     score++;
                  }
                  else {
                     System.out.println("Please enter in either 0 (Jump Over) or 1 (Go Around)");
                  }
               }
               catch (IOException e) {
               
               }
               catch (Exception y) {
                  System.out.println("Please enter in an integer value of 0 (Jump Over) or 1 (Go Around)");
               }
            }
         }
         else if (obst.equals("tree")){
            System.out.println("You have enountered a tree. Climb over (0) or go around (1)?");
            while (check != 0 && check != 1){
               try {
                  check = Integer.parseInt(br.readLine());
                  if (check == 0){
                     System.out.println("Bad decision. You have fallen and broken a bone.");
                     score--;
                  }
                  else if (check == 1){
                     System.out.println("Good decision. You passed this obstacle.");
                     score++;
                  }
                  else {
                     System.out.println("Please enter in either 0 (Climb Over) or 1 (Go Around)");
                  }
               }
               catch (IOException e) {
               
               }
               catch (Exception y) {
                  System.out.println("Please enter in an integer value of 0 (Climb Over) or 1 (Go Around)");
               }
            }
         }
         else if (obst.equals("old lady")){
            System.out.println("You have enountered an old lady. Wait for her to cross (0) or go around (1)?");
            while (check != 0 && check != 1){
               try {
                  check = Integer.parseInt(br.readLine());
                  if (check == 0){
                     System.out.println("Bad decision. The headless horseman has caught up to you.");
                     score--;
                  }
                  else if (check == 1){
                     System.out.println("Good decision. You passed this obstacle.");
                     score++;
                  }
                  else {
                     System.out.println("Please enter in either 0 (Wait) or 1 (Go Around)");
                  }
               }
               catch (IOException e) {
               
               }
               catch (Exception y) {
                  System.out.println("Please enter in an integer value of 0 (Wait) or 1 (Go Around)");
               }
            }
         }
         else if (obst.equals("animal")){
            System.out.println("You have enountered a large animal crossing. Wait for them to cross (0) or go around (1)?");
            while (check != 0 && check != 1){
               try {
                  check = Integer.parseInt(br.readLine());
                  if (check == 0){
                     System.out.println("Bad decision. The animal has taken its time and the headless horseman has caught up to you.");
                     score--;
                  }
                  else if (check == 1){
                     System.out.println("Good decision. You passed this obstacle.");
                     score++;
                  }
                  else {
                     System.out.println("Please enter in either 0 (Wait) or 1 (Go Around)");
                  }
               }
               catch (IOException e) {
               
               }
               catch (Exception y) {
                  System.out.println("Please enter in an integer value of 0 (Wait) or 1 (Go Around)");
               }
            }
         }
         else {
            System.out.println("You have enountered a closed road. Go through anyways (0) or go around (1)?");
            while (check != 0 && check != 1){
               try {
                  check = Integer.parseInt(br.readLine());
                  if (check == 0){
                     System.out.println("Bad decision. The road was full of potholes on which you sprained an ankle.");
                     score--;
                  }
                  else if (check == 1){
                     System.out.println("Good decision. You passed this obstacle.");
                     score++;
                  }
                  else {
                     System.out.println("Please enter in either 0 (Go Through) or 1 (Go Around)");
                  }
               }
               catch (IOException e) {
               
               }
               catch (Exception y) {
                  System.out.println("Please enter in an integer value of 0 (Go Through) or 1 (Go Around)");
               }
            }

         }
       }
     return score;
   }
}