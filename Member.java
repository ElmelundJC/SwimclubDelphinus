abstract class Member{

   String name;
   int age;
   int id;
   boolean active;
   double price;
   double debt;



   public Member(String name, int age, int id, boolean active, double debt){ // fjern id og opret id-funktion
      this.name = name;
      this.age = age;
      this.id = id;
      this.active = active;
      this.debt = debt;
   }


   double calculatePrice(){
   
      return 1;
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