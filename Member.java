abstract class Member{

String name;
int age;
int id;
boolean active;
double price;
double debt;



public Member(String name, int age, int id, boolean active){ // fjern id og opret id-funktion
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

//Skriv toString Metode!
public String toString(){
return this.getClass() + " " + name + " " + age + " " + id + " " + active + " "  + debt;
}


}