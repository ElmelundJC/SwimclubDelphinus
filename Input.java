import java.util.*;


public class Input{

   Database data = new Database();

   Scanner sc = new Scanner(System.in);
   
   public Input(){
   data.reader();
   }

   public void run(){
      
      while (true){
         System.out.println("Welcome!\n Press 1 to create user\nPress 2 to delete user\nPress 3 to see members\nPress 4 to edit members\nPress 5 to exit");
      
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
               //data.printer(data.getArrayList());
               
               data.searchTimes("butterfly", 5);
               break;
         
            case"4":
               System.out.println("Edit members");
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
   
   public void addMember(){
   System.out.println("1 - Add Pro\n2 - Add Amateur\n3 - Return");
   Random r = new Random();
      while (true) {
         switch(sc.next()){
         
            case "1":
               System.out.println("Add a pro:\nString name, int age, int id, boolean active, double debt, double time, String discipline, String coach");
               data.addPro(data.checkerString(), data.checkerInt(), r.nextInt(1000)+1, data.checkerBoolean(), data.checkerDouble(), data.checkerDouble(), data.checkerString(), data.checkerString());
               System.out.println("Memeber Added");
               run();
               break;
         
            case "2":
               System.out.println("Add an Amateur:\nString name, int age, int id, boolean active, double debt");
               data.addAmateur(data.checkerString(), data.checkerInt(), r.nextInt(1000)+1, data.checkerBoolean(), data.checkerDouble());
               run();
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