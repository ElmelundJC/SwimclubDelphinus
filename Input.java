import java.util.*;


public class Input implements User{

   Database data = new Database();

   Scanner sc = new Scanner(System.in);
   
   public Input(){
   data.reader();
   }

   
   
   public void caseOne(){ //adds member
   System.out.println("1 - Add Pro\n2 - Add Amateur\n3 - Return");
   Random r = new Random();
      while (true) {
         switch(sc.next()){
         
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
   
   
   public void caseTwo(){}
   public void caseThree(){}
   public void caseFour(){}


}