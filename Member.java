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
      this.price = calculatePrice();
   
   }

   double calculatePrice(){
      double standardPrice = 1600;
      if (this.active&&this.age < 18){
         return 1000;
      }
      if (this.active && (this.age >= 18 && this.age <60)){
         return standardPrice;
      }
      if (this.active&&this.age>=60)
      {
         return standardPrice*0.75;}
      
      
      return 500;
   
}


  

   public int getId(){
   
      return id;
   }

//Skriv toString Metode!
   public String toString(){
      return this.getClass() + " " + name + " " + age + " " + id + " " + active + " "  + debt;
   }
   
   public String toList(){
   
      return "Name: " + name + "\tAge: " + age + "\tID: " + id + "\tActive: " + active + "\tDebt: "  + debt +"\tMemberPrice: " +price +" Dkk";
   
   }


}