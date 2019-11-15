import java.io.*;

public class Main  {


    public static void main(String[] args) throws IOException { // husk try/catch

    

    Database database = new Database();
    
    database.reader();
     

    for (int i = 0; i < database.getArrayList().size(); i++) {
        System.out.println(database.getArrayList().get(i).toString());
    }
    
    //database.addAmateur("kidde", 24, 3, true, 11.2);
    //database.addPro("else", 44, 5, true, 0.0, 13.2, "butterfly", "klaus");
    
    database.write(database.getArrayList());
    

// String name, int age, int id, boolean active
//Amateur Jakob = new Amateur("Jakob", 25, 01, true);

//Medlemmer.addAmateur("Christian", 45, 3, true);


//Medlemmer.createData(Jakob);
//System.out.println(Jakob.toString());
   
//Medlemmer.write(Medlemmer.getArrayList());


}
}