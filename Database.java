import java.io.*;
import java.util.*;

public class Database{

   ArrayList<Object> data = new ArrayList<Object>();
   
   ArrayList getArrayList(){
      
      return data;
   }
   
   void createData(Object obj){
      data.add(obj);
   }
   
   
   void removeData(int id){
      for (int i = 0; i < data.size(); i++){
         if (data.get(i) instanceof Member){
            if (((Member) (data.get(i))).getId() == id){
               data.remove(i);
            }
         }
      }
         
   }
   
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
   
   public void printer(ArrayList list) {
      for (Object i : list) {
         System.out.println(((Member) i).toList()); //evt instanceoff
                
      }
   }
   
   public void reader() {
      try{   // Skrives paent!!
         Scanner scanner = new Scanner(new FileReader("database.txt"));
         scanner.useLocale(Locale.ENGLISH);
         while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
            Scanner scan = new Scanner(line);
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
   public void addAmateur(String name, int age, int id, boolean active, double debt) {
      Amateur amateur = new Amateur(name, age, id, active, debt); 
      createData(amateur);      
   }
   
   public void addPro(String name, int age, int id, boolean active, double debt, double time, String discipline, String coach) {
      Pro pro = new Pro(name, age, id, active, debt, time, discipline, coach);
      createData(pro);
   } 
   
   public void addAmateur(){
      Scanner s = new Scanner(System.in);
      Random r = new Random();
   
      System.out.println("Enter first name");
   
   }
   
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
   
   public void searchTimes(String disc, int amount){
   
      ArrayList<Pro> times = new ArrayList<Pro>();
   
      for (int i = 0; i < data.size(); i++){
      
         if (data.get(i) instanceof Pro){
            if (((Pro) data.get(i)).getDiscipline().equals(disc)){
            
               times.add((Pro) data.get(i));
            
            }
         }
      
         Collections.sort(times, 
            new Comparator<Pro>() {
               @Override 
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
      
      for (int i = 0; i < amount; i++){
      
         System.out.println(times.get(i).toList());
      
      }      
       
   
   }
   
   
  
}
   
