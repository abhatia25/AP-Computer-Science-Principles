import java.util.Random;
import java.io.*;

public class Story {
   public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
   public static String name = "";
   
   public static void Backstory(){ 
      
      try {
         System.out.println("What is your name?");
         name = br.readLine();
      }
      catch (IOException e){
      
      }
      
      name = name.substring(0,1).toUpperCase() + name.substring(1,name.length());
   
      System.out.println("Once upon a time, a guy named " + name + "(you) lived in a little town called Sleepy Hollow.");
      System.out.println("You are a very important man and hold some prestigious positions in the town.");
      System.out.println("While walking around you see a bunch of pretty girls.");
      
   }
   
   public static char Input(){
      String s = "";
      try {
         s = br.readLine();
      }
      catch (IOException e){
      
      }
      
      s = s.trim();
      s = s.toLowerCase();
      Character c = s.charAt(0);
      return c;
   }
   
   public static void MoreStory(){
      System.out.println("You then go and talk to her.");
      System.out.println("You both have a great time, but it wasn't meant to last. At the end of the night she dumps you.");
      System.out.println("You leave for home, in tears. Along the path, you meet the headless horseman.");
      System.out.println("In fear, you run away, trying to get home safely.");
   }

}