import java.io.*;

public class Main  {


   public static void main(String[] args) throws IOException { // husk try/catch
   
    
   
   
   Database d = new Database();
   d.reader();
   int s = d.checkerInt();
   System.out.println(s);
   
   }
}