public class Pro extends Member {

   double time;
   String discipline;
   String coach;

   //Contructor
   public Pro(String name, int age, int id, boolean active, double debt, double time, String discipline, String coach) {
      super(name, age, id, active, debt);
      this.time = time;
      this.discipline = discipline;
      this.coach = coach;
   }
   //toString method
   public String toString(){
      return this.getClass() + " " + name + " " + age + " " + id + " " + active + " "  + debt + " " + time + " " + discipline + " " + coach;
   }
   
   public String toList(){
   
      return "Name: " + name + "\tAge: " + age + "\tID: " + id + "\tActive: " + active + "\tDebt: "  + debt + "\tTime: " + time + "\tDiscipline: " + discipline + "\tCoach: " + coach +"\tMemberPrice: " +price +" Dkk";
   
   }
   //getDiscipline method
   public String getDiscipline(){
   
      return this.discipline;
   }
   
   //setTime method
   public void setTime(double value){
      this.time = value;
   
   }
   //getTime method
   public double getTime(){
      return this.time;
   }


}