package animals;

public class Marsupial extends Mammal {
    public  Marsupial(){
        super.offAvg = 4;
        super.setName("Canguro");
    }
    public void makeSound(){
        System.out.println("Canguro chilla");
    }
}
