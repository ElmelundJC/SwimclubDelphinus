import java.util.*;
import java.io.*;

public class Treasurer implements User {
   
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
               
               // caseOne();
               break;
         
            case"2":
               System.out.println("See debt");
               // caseTwo();
               //brug searchTimes template til at lave en debt search
               break;
         
            case"3":
               // caseThree();
               System.out.println("Erase member");
               break;
               
               case "4" :
               System.out.println("Edit Debt");
               // caseFour();
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