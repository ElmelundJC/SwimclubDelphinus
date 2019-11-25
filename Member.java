abstract class Member{

   String name;
   int age;
   int id;
   boolean active;
   double price;
   double debt;
   float initialPrice = 1000;
   //gittest



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
      if (!this.active){
         return 500;
      }
      else if (this.age < 18){
         return 1000;
      }
      else if ((this.age >= 18 && this.age <60)){
         return standardPrice;
      }
      else 
      {
         return standardPrice*0.75;}
      
      
   
   }
  

   public int getId(){
   
      return id;
   }
   
   public double getDebt(){
   
      return debt;
   }

//Skriv toString Metode!
   public String toString(){
      return this.getClass() + " " + name + " " + age + " " + id + " " + active + " "  + debt;
   }
   
   public String toList(){
   
      return "Name: " + name + "\tAge: " + age + "\tID: " + id + "\tActive: " + active + "\tDebt: "  + debt +"\tMemberPrice: " +price +" Dkk";
   
   }


}