import java.util.*;
import java.io.*;

public class Trainer implements UI {
   
   
   Database data = new Database();
    
   Input input = new Input();
    
   Scanner scan = new Scanner(System.in);
   // read objects into arrayList 
   public Trainer() {
      data.reader();
   }
   
   // run method
   public void run() {
      while (true){
         System.out.println("\n1. See best times " + "\n2. List of Pro members" + "\n3. Edit times\n4. Exit");
      
         switch(scan.next()){
         //See best times
            case "1":
               System.out.println("Best Times");
               caseOne();
               break;
         //List of Pro members
            case"2":
               System.out.println("pro members");
               caseTwo();
               break;
         //Edit times      
            case "3":
               System.out.println("Edit times");
               caseThree();
               break;
           //exit    
            case "4":
               System.out.println("Exit");
               caseFour();
               break;
           
                 
            default:
               System.out.println("Please enter number");
               run();
               break;
         
         }
      }
   }
   //See best times
   public void caseOne(){
      data.searchTimes(5);
   } 
   //List of Pro members
   public void caseTwo(){
      data.proPrinter(data.getArrayList());
   
   
   } 
   //Edit times 
   public void caseThree(){
   
      data.proPrinter(data.getArrayList());
   
      System.out.println("Please enter an ID to edit");
   
      int input = data.checkerInt();  
      for (int i = 0; i < data.getArrayList().size(); i++){
         if (((Member)data.getArrayList().get(i)).getId() == input){
            System.out.println("Set new time");
            ((Pro) data.getArrayList().get(i)).setTime(data.checkerDouble());
            System.out.println("New time: " + ((Pro) data.getArrayList().get(i)).getTime());
         }
      }
   
   
   
   }
   
   //exit method
   public void caseFour(){
   
      data.write(data.getArrayList());
      System.exit(0);
   }
 
}
