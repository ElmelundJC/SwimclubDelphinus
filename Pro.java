public class Pro extends Member {

double time;
String discipline;
String coach;

    public Pro(String name, int age, int id, boolean active, double time, String discipline, String coach) {
        super(name, age, id, active);
        this.name = name;
        this.age = age;
        this.id = id;
        this.active = active;
        this.time = time;
        this.discipline = discipline;
        this.coach = coach;
    }

}