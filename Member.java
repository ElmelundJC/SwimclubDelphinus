abstract class Member{

String name;
int age;
int id;
boolean active;
double price;
double debt;



public Member(String name, int age, int id, boolean active){
   this.name = name;
   this.age = age;
   this.id = id;
   this.active = active;
}


double calculatePrice(){

return 1;
}



public int getId(){

   return id;
}

//Skriv toStringe Metode!
public String toString(){
return "name: " + name + "\nAge: " + age + "\nID:" + id + "\nIs active: " + active + "\nPrice: " + price + "\nDebt: " + debt;
}


}