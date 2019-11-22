public class Pro extends Member {

   double time;
   String discipline;
   String coach;

   public Pro(String name, int age, int id, boolean active, double debt, double time, String discipline, String coach) {
      super(name, age, id, active, debt);
      this.time = time;
      this.discipline = discipline;
      this.coach = coach;
   }
   
   public String toString(){
      return this.getClass() + " " + name + " " + age + " " + id + " " + active + " "  + debt + " " + time + " " + discipline + " " + coach;
   }
   
   public String toList(){
   
   return "Name: " + name + "\tAge: " + age + "\tID: " + id + "\tActive: " + active + "\tDebt: "  + debt + "\tTime: " + time + "\tDiscipline: " + discipline + "\tCoach: " + coach;
   
   }
   
   public String getDiscipline(){
   
   return this.discipline;
   }
   
   public double getTime(){
   return this.time;
   }


}