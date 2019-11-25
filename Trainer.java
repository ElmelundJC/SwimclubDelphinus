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
         System.out.println("\nSee best times " + "\nList of Pro members" + "\nEdit times");
      
         switch(scan.next()){
            case "1":
               System.out.println("Best Times");
               caseOne();
               break;
         
            case"2":
               System.out.println("pro members");
               caseTwo();
               break;
               
            case "3":
               System.out.println("Edit times");
               caseThree();
               break;
           
                 
            default:
               System.out.println("Please enter number");
               run();
               break;
         
         }
      }
   }
   public void caseOne(){
   } //metode til at se de 5 bedste tider
   
   public void caseTwo(){
   } // metode til at se "pro-medlemmer"

   public void caseThree(){
   }// metode til at sætte/redigerer tider
   
   public void caseFour(){
   }
 
}
