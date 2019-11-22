import java.util.*;
import java.io.*;

public class Trainer implements User {

   String team;


   double getTime(){
   
      return 0;
   }

   void setTime(){
   }

   String swimList(){
   
   
      return "test";
   }
   
   
    Database data = new Database();
    
    Input input = new Input();
    
    Scanner scan = new Scanner(System.in);
    
    public void user() {
    data.reader();
   }
   
   public void run() {
       while (true){
         System.out.println("\nSe medlemmer " + "\nSe restancer" + "\nSlet medlemmer");
      
         switch(scan.next()){
            case "1":
               System.out.println("See member");
               data.printer(data.getArrayList());
               break;
         
            case"2":
               System.out.println("See debt");
               break;
         
            case"3":
               System.out.println("Erase member");
               break;
         
                    
            default:
               System.out.println("Please enter number");
               run();
               break;
         
         }
     }
   }
   public void caseOne(){}
   public void caseTwo(){}
   public void caseThree(){}
   public void caseFour(){}
}