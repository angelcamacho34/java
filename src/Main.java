import animals.Animal;
import animals.Mammal;
import animals.Marsupial;

public class Main {
    public static void main(String []args){
        Animal animal1 = new Animal();
        animal1.makeSound();

        Mammal mamifero1 = new Mammal();
        mamifero1.makeSound();

        Marsupial marsupial = new Marsupial();
        marsupial.makeSound();
    }
}
