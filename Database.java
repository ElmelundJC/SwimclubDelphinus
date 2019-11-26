import java.io.*;
import java.util.*;

public class Database{

   ArrayList<Object> data = new ArrayList<Object>();
   
   String[] discipline = {"butterfly", "crawl", "freestyle", "medley", "backstroke"};
   
   
   //Return Arraylist data
   ArrayList getArrayList(){
      return data;
   }
   
   //Add object to arraylist
   void createData(Object obj){
      data.add(obj);
   }
   
   //Get discipline
   public String getDataDiscipline(){
   
      String temp = "";
   
      for (int i = 0; i < discipline.length; i++){
      
         temp += i +": " + discipline[i] + " ";
      
      }
   
      return temp;
   
   }
   
   //Removes data object according to ID - instanceof Member
   void removeData(int id){
      boolean deleted = false;
      for (int i = 0; i < data.size(); i++){
         if (data.get(i) instanceof Member){
            if (((Member) (data.get(i))).getId() == id){
               data.remove(i);
               deleted = true;
            }
         }
      }
      if(deleted == true){
         System.out.println("Succesfully deleted Member");
      } else {
         System.out.println("No such ID/Member");
      
      }
         
   }
   
   //Prints object via toString and writes to file
   public void write(ArrayList list) {
      try {
         PrintWriter pwriter = new PrintWriter(new FileWriter("database.txt")); // husk at lave try/catch
         for (Object i : list) {
            pwriter.println(i.toString());
                
         }
         pwriter.close();
      }
      catch (IOException e) {
         System.out.println("Error: " + e);
      }
   }
   
   //print method toList
   public void printer(ArrayList list) {
      for (Object i : list) {
         System.out.println(((Member) i).toList()); 
                
      }
   }
   
   //pro printmethod toList
   public void proPrinter(ArrayList list) {
   
      for (Object i : list) {
         if (i instanceof Pro){
            System.out.println(((Pro) i).toList()); 
         }
      }
   
   
   }
   
   //crates ArrayList from databasefile
   public void reader() {
      try{   
         Scanner scanner = new Scanner(new FileReader("database.txt"));
         scanner.useLocale(Locale.ENGLISH);
         while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            Scanner scan = new Scanner(line);
            //secure notation 10.0(not 10,0)
            scan.useLocale(Locale.ENGLISH);
            
            while (scan.hasNext()) { 
                
               String temp = scan.next(); 
            
               if (temp.equals("Pro")) {
                          
                  addPro(scan.next(), scan.nextInt(), scan.nextInt(), scan.nextBoolean(), scan.nextDouble(), scan.nextDouble(), scan.next(), scan.next());    
               }
            
            
               if (temp.equals("Amateur")) {
               
                  addAmateur(scan.next(), (int) scan.nextInt(), (int) scan.nextInt(), (boolean) scan.nextBoolean(), (double) scan.nextDouble());    
               }
            
            }
            scan.close();
         }
      
         scanner.close();
      }catch(Exception e){
         System.out.println("Systemet har fundet en fejl " + e  + " systemet opretter en ny fil");
      
      }
   }
   //addAmateur method
   public void addAmateur(String name, int age, int id, boolean active, double debt) {
      Amateur amateur = new Amateur(name, age, id, active, debt); 
      createData(amateur);      
   }
   //addAmateur method
   public void addPro(String name, int age, int id, boolean active, double debt, double time, String discipline, String coach) {
      Pro pro = new Pro(name, age, id, active, debt, time, discipline, coach);
      createData(pro);
   } 
   
  
   //checks input is a String
   public String checkerString(){
      Scanner sc1 = new Scanner(System.in);
      String temp;
   
      while (!sc1.hasNext()){
         System.out.println("invalid input - not a string");
         sc1.next();
      }
   
      temp = sc1.next();
      return temp;
   }
   
   //checks input is an Int
   public int checkerInt(){
      Scanner sc1 = new Scanner(System.in);
      int temp;
   
      while (!sc1.hasNextInt()){
         System.out.println("invalid input - not an integer");
         sc1.next();
      }
      temp = sc1.nextInt();
   
      return temp;
   }
   
   //checks input is a Boolean
   public boolean checkerBoolean(){
      Scanner sc1 = new Scanner(System.in);
      boolean temp;
   
      while (!sc1.hasNextBoolean()){
         System.out.println("invalid input - either true or false");
         sc1.next();
      }
      temp = sc1.nextBoolean();
   
      return temp;
   }
   //checks input is a Double
   public double checkerDouble(){
      Scanner sc1 = new Scanner(System.in);
      double temp;
   
      while (!sc1.hasNextDouble()){
         System.out.println("invalid input - not a double");
         sc1.next();
      }
      temp = sc1.nextDouble();
   
      return temp;
   }
   
   //search times method
   public void searchTimes(int amount){
   
      Scanner sc = new Scanner(System.in);
      
      String disc;
      
      int j;
   
      System.out.println(getDataDiscipline());
      
      j = sc.nextInt();
      
      if (j > discipline.length){
         System.out.println("Value not correct, Try Again!");
      
         searchTimes(amount);
      
      } else {
      
      
         disc = discipline[j];
      
         ArrayList<Pro> times = new ArrayList<Pro>();
         
      
         for (int i = 0; i < data.size(); i++){
         
            if (data.get(i) instanceof Pro){
            
               if (((Pro) data.get(i)).getDiscipline().equals(disc)){
               
                  times.add((Pro) data.get(i));
               
               }
            }
         
            Collections.sort(times, 
               new Comparator<Pro>() {
                  public int compare(Pro p1, Pro p2) {
                     double dif = p1.getTime() - p2.getTime();
                     if (dif > 0) 
                        return 1;
                     if (dif < 0) 
                        return -1;
                     return 0; 
                  }
               });
         
         }
         if (times.size() < amount) {
            amount = times.size();
         }
         for (int i = 0; i < amount; i++){
         
            System.out.println(times.get(i).toList());
         
         }
      
         if (times.size() == 0){
            System.out.println("No one with that discipline");
         
         }    
      }
   
   }
   
   //seach debt method
   public void searchDebt(){
   
      ArrayList<Member> debt = new ArrayList<Member>();
   
      for (int i = 0; i < data.size(); i++){
      
         if (data.get(i) instanceof Member){
            if (((Member) data.get(i)).getDebt() > 0){
            
               debt.add((Member)data.get(i));
            
            }
         }
      
         Collections.sort(debt, 
            new Comparator<Member>() {
               public int compare(Member p1, Member p2) {
                  double dif = p1.getDebt() - p2.getDebt();
                  if (dif > 0) 
                     return -1;
                  if (dif < 0) 
                     return 1;
                  return 0; 
               }
            });
      
      }
      
      for (int i = 0; i < debt.size(); i++){
      
         System.out.println(debt.get(i).toList());
      
      }  
   
   }
   
   
  
}
   
