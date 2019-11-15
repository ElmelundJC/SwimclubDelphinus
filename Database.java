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
   
   public void write(ArrayList list) throws IOException {
        PrintWriter pwriter = new PrintWriter(new FileWriter("database.txt")); // husk at lave try/catch
        for (Object i : list) {
            pwriter.println(i.toString());
                
        }
        pwriter.close();
   }
    public void reader() throws IOException {   // Skrives pænt!!
        Scanner scanner = new Scanner(new FileReader("database.txt"));
        while (scanner.hasNextLine()) {
             String line = scanner.nextLine();
             System.out.println(line);
             Scanner scan = new Scanner(line);
             System.out.println("1st");
        while (scan.hasNext()) { 
         System.out.println("2nd");  
         System.out.println(scan.next()); 
            if (scan.hasNext() && scan.next() == "Pro") {
              
            addPro(scan.next(), (int) scan.nextInt(), (int) scan.nextInt(), (boolean) scan.nextBoolean(), (double) scan.nextDouble(), scan.next(), scan.next());    
            System.out.println("Pro");
            }

            
            if (scan.hasNext() && scan.next() == "Amateur") {
                addAmateur(scan.next(), (int) scan.nextInt(), (int) scan.nextInt(), (boolean) scan.nextBoolean());   
                System.out.println("Amateur"); 
            }
            
                }
                scan.close();
   }
   
   scanner.close();
   }
   public void addAmateur(String name, int age, int id, boolean active) {
       Amateur amateur = new Amateur(name, age, id, active); 
           createData(amateur);      
   }
   // String name, int age, int id, boolean active, double time, String discipline, String coach
   public void addPro(String name, int age, int id, boolean active, double time, String discipline, String coach) {
       Pro pro = new Pro(name, age, id, active, time, discipline, coach);
           createData(pro);
   } 
}