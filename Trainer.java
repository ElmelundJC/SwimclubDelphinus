import java.util.*;
import java.io.*;

public class Trainer implements User {
   
   
   Database data = new Database();
    
   Input input = new Input();
    
   Scanner scan = new Scanner(System.in);
    
   public Trainer() {
      data.reader();
   }
   
   public void run() {
      while (true){
         System.out.println("\n1. See best times " + "\n2. List of Pro members" + "\n3. Edit times\n4. Exit");
      
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
               
               case "4":
               System.out.println("Exit");
               data.write(data.getArrayList());
               System.exit(0);
               break;
           
                 
            default:
               System.out.println("Please enter number");
               run();
               break;
         
         }
      }
   }
   public void caseOne(){
   data.searchTimes(5);
   } 
   
   public void caseTwo(){
   } // metode til at se "pro-medlemmer"

   public void caseThree(){
   }// metode til at sætte/redigerer tider
   
   public void caseFour(){
   }
 
}
