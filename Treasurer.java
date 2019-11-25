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
   
   public void caseOne(){ // Se member list
      data.printer(data.getArrayList());
   }
   
   public void caseTwo(){ // Se gælden
      data.searchDebt();
      // her skal der laves en metode for at se gælden for et ID
   }
   
   
   public void caseThree(){ // rediger gæld
   // Metode for at finde gæld ud fra ID
      data.searchDebt();
   
      System.out.println("Please enter an ID to edit");
   
      int input = data.checkerInt();
   // 
      for (int i = 0; i < data.getArrayList().size(); i++){
         if (((Member)data.getArrayList().get(i)).getId() == input){
            System.out.println("Set new Debt");
            ((Member) data.getArrayList().get(i)).setDebt(data.checkerDouble());
            System.out.println("New debt: " + ((Member) data.getArrayList().get(i)).getDebt());
         }
      }
   }
   
   
   public void caseFour(){
      data.searchDebt();
      System.out.println("Choose Member ID to delete");
      data.removeData(data.checkerInt());
   }

}