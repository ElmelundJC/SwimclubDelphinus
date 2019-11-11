public class Main {


public static void main(String[] args){



Database Medlemmer = new Database();


// String name, int age, int id, boolean active
Amateur Jakob = new Amateur("Jakob", 25, 01, true);

Medlemmer.createData(Jakob);
System.out.println(Jakob.toString());
   


}
}