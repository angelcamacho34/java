package animals;

public class Animal {
    private String name;
    private String color;
    private String gender;

    public Animal(){
        this.name ="Animmal";
        this.color = "cafe";
        this.gender = "Macho";
    }

    public void makeSound(){
        System.out.println("Animal making sound");
    }
    public void move (){
        System.out.println("Animal moving");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
