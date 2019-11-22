abstract class Member{

   String name;
   int age;
   int id;
   boolean active;
   double price;
   double debt;
   float initialPrice = 1000;



   public Member(String name, int age, int id, boolean active, double debt){ // fjern id og opret id-funktion
      this.name = name;
      this.age = age;
      this.id = id;
      this.active = active;
      this.debt = debt;

   
}

   double calculatePrice(){
   

      //if !active do - 500kr...
      
      //else if (this.age) 18+ - do
      //return initialPrice;
      
      //else if 18- - do
      return 0;
      //else if 65+ - do

   }



   public int getId(){
   
      return id;
   }

//Skriv toString Metode!
   public String toString(){
      return this.getClass() + " " + name + " " + age + " " + id + " " + active + " "  + debt;
   }
   
   public String toList(){
   
   return "Name: " + name + "\tAge: " + age + "\tID: " + id + "\tActive: " + active + "\tDebt: "  + debt;
   
   }


}