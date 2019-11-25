import java.util.*;
import java.io.*;

public class Treasurer implements User {
   
    Database data = new Database();
    
    
    Scanner scan = new Scanner(System.in);
    
    public Treasurer() {
    data.reader();
    }
   
     public void run() {
       while (true){
         System.out.println("\n1. Member list " + "\n2. See debt" + "\n3. Edit debt" + "\n4. Erase member" + "\n5. Exit");
      
         switch(scan.next()){
            case "1":
               System.out.println("Member list:");
               caseOne();
               break;
         
            case"2":
               System.out.println("See debt");
               caseTwo();
               //brug searchTimes template til at lave en debt search
               break;
         
            case"3":
               System.out.println("Edit debt");
               caseThree();
               break;
               
            case "4" :
               System.out.println("Erase member");
               caseFour();
               break;
               
            case "5" :
            System.exit(0);
               break;
         
                    
            default:
               System.out.println("Please enter number");
               run();
               break;
         
         }
      }
   }
   
   public void caseOne(){ // Se member list
      data.printer(data.getArrayList());
   }
   
   public void caseTwo(){ // Se gælden
      System.out.println("See debt");
      // her skal der laves en metode for at se gælden for et ID
   }
   
   
   public void caseThree(){ // rediger gæld
   // Metode for at finde gæld ud fra ID
   }
   
   
   public void caseFour(){ // slet medlem
   // metode for at slette et medlem
   }
}