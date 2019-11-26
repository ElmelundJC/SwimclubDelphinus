abstract class Member{

   String name; 
   int age; 
   int id; 
   boolean active; 
   double price;
   double debt;
   float initialPrice = 1000;

   //setname mehod
   public void setName(String name){
      this.name = name;
   }
   //setAge method
   public void setAge(int age){
      this.age = age;
   }
   //setID method
   public void setId(int id){
      this.id = id;
   }
   //setActive method
   public void setActive(boolean active){
      this.active = active;
   }
   
   //getName method
   public String getName(){
      return name;
   }
   //getAge method
   public int getAge(){
      return age;
   }
   //getActive method
   public boolean getActive(){
      return active;
   }
   
   //constructor
   public Member(String name, int age, int id, boolean active, double debt){ // fjern id og opret id-funktion
      this.name = name;
      this.age = age;
      this.id = id;
      this.active = active;
      this.debt = debt;
      this.price = calculatePrice();
   
   }
   
   //calculatePrice method
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
  
   //getID method
   public int getId(){
   
      return id;
   }
   
   //getDebt method
   public double getDebt(){
   
      return debt;
   }
   
   //setDebt method
   public void setDebt(double value){
   
   this.debt = value;
   
   
   
   }

   //toString method
   public String toString(){
      return this.getClass() + " " + name + " " + age + " " + id + " " + active + " "  + debt;
   }
   
   //toList method
   public String toList(){
   
      return "Name: " + name + "\tAge: " + age + "\tID: " + id + "\tActive: " + active + "\tDebt: "  + debt +"\tMemberPrice: " +price +" Dkk";
   
   }


}