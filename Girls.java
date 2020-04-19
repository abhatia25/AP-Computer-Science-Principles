import java.util.Random;

public class Girls {
   public static String[] girls = {
   "Emma",
   "Olivia",
   "Ava",
   "Isabella",
   "Sophia",
   "Charlotte",
   "Mia",
   "Amelia"};
   
   
   public static void Like(){
      Random random = new Random();
      int girlIndex = random.nextInt(7);
      String physical = GirlPhysical(girls[girlIndex]);
      System.out.println("You see " + physical + " Do you like her or would you like to pick someone else?");
   }
   
   public static String GirlPhysical(String name) {
      Random random = new Random();
      String physical = name + " who has ";
      int hairColor = random.nextInt(4);
      switch (hairColor){
         case 0:
            physical += "brown hair, ";
            break;
         case 1:
            physical += "red hair, ";
            break;
         case 2:
            physical += "gray hair, ";
            break;
         case 3:
            physical += "black hair, ";
            break;
         default:
            physical += "blonde hair, ";
            break;
      }
      
      int eyeColor = random.nextInt(3);
      switch (eyeColor){
         case 0:
            physical += "brown eyes, ";
            break;
         case 1:
            physical += "hazel eyes, ";
            break;
         case 2:
            physical += "green eyes, ";
            break;
         default:
            physical += "blue eyes, ";
            break;
      }
      
      physical += "and is ";
      
      int height = random.nextInt(2);
      switch (height){
         case 0:
            physical += "tall";
            break;
         case 1:
            physical += "short";
            break;
         default:
            physical += "average height";
            break;
      }
      
      physical += ".";
      
      return physical;
   }
}