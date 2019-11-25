import java.util.*;


public class Input{

   Database data = new Database();

   Scanner sc = new Scanner(System.in);
   
   ArrayList<String>Users= new ArrayList <String>();
   ArrayList<String>Password= new ArrayList <String>();
   ArrayList<String>Function= new ArrayList <String>();
   
   
   
   
   public Input(){
      data.reader();
   }

      

   
   public void initiateUsers(){
      Users.add("kurt");
      Password.add("1234");
      Function.add("Trainer");
      Users.add("john");
      Password.add("1234");
      Function.add("Treasurer");
      Users.add("Preben");
      Password.add("1234");
      Function.add("chairman");

   
   }
   
   public void login(){
      initiateUsers();
      while(true){
         System.out.println("Please enter credentials");
         String credentials = sc.next();
         System.out.println("Please enter password");
         String password = sc.next();
         for (int i =0; i < Users.size(); i++){
            if (Users.get(i).equals(credentials)&&Password.get(i).equals(password)){
               System.out.println("succes");
               switch (Function.get(i)){ 
                  case ("Chairman"):
                     Chairman chairman = new Chairman();
                     chairman.run();
                  case ("Treasurer"):
                     Treasurer treasurer = new Treasurer();
                     treasurer.run();
                  case ("Trainer"):
                     Trainer trainer = new Trainer();
                     trainer.run();
                  default:
                     System.out.println("login failed");
                     login();
               
               }
            }
         
         
         }
         System.out.println("please try again");
      }
   
   
   }
-   
   


}