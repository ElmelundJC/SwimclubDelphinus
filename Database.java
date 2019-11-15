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
        scanner.useLocale(Locale.ENGLISH);
        while (scanner.hasNextLine()) {
             String line = scanner.nextLine();
             System.out.println(line);
             Scanner scan = new Scanner(line);
             scan.useLocale(Locale.ENGLISH);
             System.out.println("1st");
        while (scan.hasNext()) { 
         System.out.println("2nd");  
         String temp = scan.next(); 
         
            if (temp.equals("Pro")) {
            System.out.println(temp);  
            String temp2 = scan.next();
            int temp3 = scan.nextInt();
            int temp4 = scan.nextInt();
            boolean temp5 = scan.nextBoolean();
            double temp9 = scan.nextDouble();
            double temp6 = scan.nextDouble();
            String temp7 = scan.next();
            String temp8 = scan.next();
            
            addPro(temp2, temp3, temp4, temp5, temp9, temp6, temp7, temp8);
            
            //addPro(scan.next(), scan.nextInt(), scan.nextInt(), scan.nextBoolean(), scan.nextDouble(), scan.nextDouble(), scan.next(), scan.next());    
            System.out.println("Pro");
            }

            
            if (temp.equals("Amateur")) {
                 String temp2 = scan.next();
                 int temp3 = scan.nextInt();
                 int temp4 = scan.nextInt();
                 boolean temp5 = scan.nextBoolean();
                 double temp9 = scan.nextDouble();
                 
                 addAmateur(temp2, temp3, temp4, temp5, temp9);

                //addAmateur(scan.next(), (int) scan.nextInt(), (int) scan.nextInt(), (boolean) scan.nextBoolean(), (double) scan.nextDouble());   
                System.out.println("Amateur"); 
            }
            
                }
                scan.close();
   }
   
   scanner.close();
   }
   public void addAmateur(String name, int age, int id, boolean active, double debt) {
       Amateur amateur = new Amateur(name, age, id, active, debt); 
           createData(amateur);      
   }
   // String name, int age, int id, boolean active, double time, String discipline, String coach
   public void addPro(String name, int age, int id, boolean active, double debt, double time, String discipline, String coach) {
       Pro pro = new Pro(name, age, id, active, debt, time, discipline, coach);
           createData(pro);
   } 
}