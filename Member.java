abstract class Member{

   String name; // set name
   int age; // set age
   int id; // set id
   boolean active; // set active
   double price;
   double debt;
   float initialPrice = 1000;
   //gittest


   // Setter metoder:
   
   public void setName(String name){
      this.name = name;
   }
   
   public void setAge(int age){
      this.age = age;
   }
   
   public void setId(int id){
      this.id = id;
   }
   
   public void setActive(boolean active){
      this.active = active;
   }
   
   // Getter Metoder
   public String getName(){
      return name;
   }
   
   public int getAge(){
      return age;
   }
   
   public boolean getActive(){
      return active;
   }

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
   
   public void setDebt(double value){
   
   this.debt = value;
   
   
   
   }

//Skriv toString Metode!
   public String toString(){
      return this.getClass() + " " + name + " " + age + " " + id + " " + active + " "  + debt;
   }
   
   public String toList(){
   
      return "Name: " + name + "\tAge: " + age + "\tID: " + id + "\tActive: " + active + "\tDebt: "  + debt +"\tMemberPrice: " +price +" Dkk";
   
   }


}