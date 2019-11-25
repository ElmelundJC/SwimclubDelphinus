import java.util.*;
import java.io.*;

public class Trainer implements UI {
   
   
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
               caseFour();
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
      data.proPrinter(data.getArrayList());
   
   
   } // metode til at se "pro-medlemmer"

   public void caseThree(){
   
      data.proPrinter(data.getArrayList());
   
      System.out.println("Please enter an ID to edit");
   
      int input = data.checkerInt();
   // 
      for (int i = 0; i < data.getArrayList().size(); i++){
         if (((Member)data.getArrayList().get(i)).getId() == input){
            System.out.println("Set new time");
            ((Pro) data.getArrayList().get(i)).setTime(data.checkerDouble());
            System.out.println("New time: " + ((Pro) data.getArrayList().get(i)).getTime());
         }
      }
   
   
   
   }// metode til at sætte/redigerer tider
   
   
   public void caseFour(){
   
      data.write(data.getArrayList());
      System.exit(0);
   }
 
}
