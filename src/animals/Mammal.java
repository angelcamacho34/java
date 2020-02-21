package animals;

public class Mammal extends Animal{
    protected int offAvg;

    public Mammal(){
        super.setName("Caballo");
    }

    public void makeSound(){
        System.out.println("Caballo relincha");
    }
}
