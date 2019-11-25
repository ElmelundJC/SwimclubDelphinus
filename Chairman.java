import java.util.*;
import java.io.*;

public class Chairman implements User {

   Database data = new Database();
   
   Scanner scan = new Scanner(System.in);
   
   public Chairman() {
       data.reader();
   }
   
   public void run() {
      while (true){
         System.out.println("Welcome!\nPress 1 to create user\nPress 2 to delete user\nPress 3 to see members\nPress 4 to edit members\nPress 5 Search function\nPress 6 to exit");
      
         switch(scan.next()){
            case "1":
               System.out.println("Create user");
               caseOne();
               break;
         
            case"2":
               System.out.println("Delete user");
               caseTwo();
               break;
         
            case"3":
               System.out.println("See members");
               data.printer(data.getArrayList());
               
               data.searchTimes("butterfly", 5);
               break;
         
            case"4":
               System.out.println("Edit members");
               
               break;
            
            case"5":
                System.out.println("Search Functions");
                caseFive(); 
                break;                
               
            case"6":
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
   public void caseOne(){ //adds member
   System.out.println("1 - Add Pro\n2 - Add Amateur\n3 - Return");
   Random r = new Random();
      while (true) {
         switch(scan.next()){
         
            case "1":
               System.out.println("Add a pro:\nString name, int age, boolean active, double debt, double time, String discipline, String coach");
               data.addPro(data.checkerString(), data.checkerInt(), r.nextInt(1000)+1, data.checkerBoolean(), data.checkerDouble(), data.checkerDouble(), data.checkerString(), data.checkerString());
               System.out.println("Memeber Added");
               run();
               break;
         
            case "2":
               System.out.println("Add an Amateur:\nString name, int age, boolean active, double debt");
               data.addAmateur(data.checkerString(), data.checkerInt(), r.nextInt(1000)+1, data.checkerBoolean(), data.checkerDouble());
               run();
               break;
         
            case "3":
               run();
               break;
         
            default:
               System.out.println("Enter correct input");
               caseOne();
               break;
         }
      
      }
   
   
   }

   public void caseTwo(){ // delete member
       switch(scan.next()) {
           case"1":
           System.out.println("Enter member to delete");
           caseTwoOne(); // Delete member
           case"2":
           System.out.println("3 to exit");
   }
   }
   
   public void caseThree(){}
   public void caseFour(){}
   public void caseFive(){}
      
   public void caseTwoOne(){}
}