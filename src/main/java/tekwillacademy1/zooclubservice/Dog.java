package tekwillacademy1.zooclubservice;

public class Dog extends Animal implements AnimalInterface {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("The Dog makes sound Wof, Wof, w+Wof");
    }

    @Override
    public void eat() {
        System.out.println("The dog eats sweets");

    }
}


