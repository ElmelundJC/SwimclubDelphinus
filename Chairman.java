import java.util.*;
import java.io.*;

public class Chairman implements UI {

   Database data = new Database();
   
   Scanner scan = new Scanner(System.in);
   
   public Chairman() {
       data.reader();
   }
   
   public void run() {
      while (true){
         System.out.println("Welcome!\nPress 1 to create user\nPress 2 to delete user\nPress 3 to see members\nPress 4 to edit members \nPress 5 to exit");
      
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
               caseThree();
               break;
         
            case"4":
               System.out.println("Edit members");
               // add edit member function
               // printer databasen
               // input id
               
               caseFour();
               break;
                          
               
            case"5":
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
               System.out.println("Add a pro:\nType: Name, Age, Active(true/false), Debt, Time, Discipline, Coach-name");
               data.addPro(data.checkerString(), data.checkerInt(), r.nextInt(1000)+1, data.checkerBoolean(), data.checkerDouble(), data.checkerDouble(), data.checkerString(), data.checkerString());
               System.out.println("Memeber Added");
               run();
               break;
         
            case "2":
               System.out.println("Add an Amateur:\nType: Name, Age, Active(true/false), debt");
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
   data.printer(data.getArrayList());
   System.out.println("Choose Member ID to delete");
      data.removeData(data.checkerInt());
   }
   
   public void caseThree(){
   data.printer(data.getArrayList());
   }
   public void caseFour(){ // edit member
      // add edit member function
      // printer databasen
      // input id
      
      data.printer(data.getArrayList());
      System.out.println("");
      
      // Vælg ved id hvilket medlem der skal rettes
      System.out.println("Please enter an ID to edit");
      int input = data.checkerInt();
   
      for (int i = 0; i < data.getArrayList().size(); i++){
         if (((Member)data.getArrayList().get(i)).getId() == input){
      
         System.out.println("1. Edit name\n2. Edit age\n3. Edit ID\n4. Edit Activity \n5. Return to previous menu");
         while (true) {
            switch(scan.next()){
               case "1":
                  System.out.println("Enter new name");
                  ((Member) data.getArrayList().get(i)).setName(data.checkerString());
                  System.out.println("New Name: " + ((Member) data.getArrayList().get(i)).getName());
                  System.out.println("");
                  System.out.println("Name editted succesfully");
                  System.out.println("");
                  System.out.println("1. Edit name\n2. Edit age\n3. Edit ID\n4. Edit Activity \n5. Return to previous menu");
                  break;
            
               case "2":
                  System.out.println("Enter new age");
                  ((Member) data.getArrayList().get(i)).setAge(data.checkerInt());
                  System.out.println("New age: " + ((Member) data.getArrayList().get(i)).getAge());
                  System.out.println("");
                  System.out.println("Age editted succesfully");
                  System.out.println("");
                  System.out.println("1. Edit name\n2. Edit age\n3. Edit ID\n4. Edit Activity \n5. Return to previous menu");
                  break;
               
               case "3":
                  System.out.println("Enter new ID");
                  ((Member) data.getArrayList().get(i)).setId(data.checkerInt());
                  System.out.println("New ID: " + ((Member) data.getArrayList().get(i)).getId());
                  System.out.println("");
                  System.out.println("ID editted succesfully");
                  System.out.println("");
                  System.out.println("1. Edit name\n2. Edit age\n3. Edit ID\n4. Edit Activity \n5. Return to previous menu");
                  break;
               
               case "4":
                  System.out.println("Enter activity (true/false)");
                  ((Member) data.getArrayList().get(i)).setActive(data.checkerBoolean());
                  System.out.println("New ID: " + ((Member) data.getArrayList().get(i)).getActive());
                  System.out.println("");
                  System.out.println("Activity editted succesfully");
                  System.out.println("");
                  System.out.println("1. Edit name\n2. Edit age\n3. Edit ID\n4. Edit Activity \n5. Return to previous menu");
                  break;
            
               case "5":
                  run();
               
               default:
                  System.out.println("Enter correct input");
                  caseFour();
                  break;
               
         
            }
      
         }
      
   
         }
   
   }
   }
      
}