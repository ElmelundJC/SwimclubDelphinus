import java.util.*;
import java.io.*;

public class Treasurer implements UI {
   
   Database data = new Database();
    
    
   Scanner scan = new Scanner(System.in);
   
   // read objects into arrayList  
   public Treasurer() {
      data.reader();
   }
   
   // run method
   public void run() {
      while (true){
         System.out.println("\n1. Member list " + "\n2. See debt" + "\n3. Edit debt" + "\n4. Erase member" + "\n5. Exit");
      
         switch(scan.next()){
         //see members
            case "1":
               System.out.println("Member list:");
               caseOne();
               break;
         //sort members by debt
            case"2":
               System.out.println("See debt");
               caseTwo();
               break;
         //edit debt
            case"3":
               System.out.println("Edit debt");
               caseThree();
               break;
          //delete members     
            case "4" :
               System.out.println("Erase member");
               caseFour();
               break;
          //exit     
            case "5" :
               data.write(data.getArrayList());
               System.exit(0);
               break;
         
          //main menu        
            default:
               System.out.println("Please enter number");
               run();
               break;
         
         }
      }
   }
   //see members
   public void caseOne(){ 
      data.printer(data.getArrayList());
   }
   //sort members by debt
   public void caseTwo(){ 
      data.searchDebt();
     
   }
   
   //edit debt
   public void caseThree(){ 
   
      data.searchDebt();
   
      System.out.println("Please enter an ID to edit");
   
      int input = data.checkerInt();
   
      for (int i = 0; i < data.getArrayList().size(); i++){
         if (((Member)data.getArrayList().get(i)).getId() == input){
            System.out.println("Set new Debt");
            ((Member) data.getArrayList().get(i)).setDebt(data.checkerDouble());
            System.out.println("New debt: " + ((Member) data.getArrayList().get(i)).getDebt());
         }
      }
   }
   
   //delete members  
   public void caseFour(){
      data.searchDebt();
      System.out.println("Choose Member ID to delete");
      data.removeData(data.checkerInt());
   }

}