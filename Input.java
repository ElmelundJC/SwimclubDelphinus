import java.util.*;

public class Input{

Database data = new Database();

Scanner sc = new Scanner(System.in);

   public void run(){
   data.reader();
   while (true){
   System.out.println("Welcome!: Press 1 to create user\nPress 2 to delete user\nPress 3 to see members\nPress 4 to edit members\nPress 5 to exit");
   
   switch(sc.next()){
      case "1":
      System.out.println("Create user");
      addMember();
      break;
      
      case"2":
      System.out.println("Delete user");
      break;
      
      case"3":
      System.out.println("See members");
      break;
      
      case"4":
      System.out.println("Edit members");
      break;
      
      case"5":
      System.out.println("Exit");
      System.exit(0);
      break;
      
      default:
      System.out.println("Please enter number");
      run();
      break;
      
     }
   }
   public void addMember(){
   while (true)
      switch(sc.next()){
      
      case "1":
      data.addPro();
      break;
      
      case "2":
      data.addAmateur();
      break;
      
      case "3":
      run();
      break;
      
      default:
      System.out.println("Enter correct input");
      addMember();
      break;
      }
   
   }
   
   
   }



}