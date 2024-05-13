package tekwillacademy1.zooclubservice;

public class Cat extends Animal implements AnimalInterface {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("The cat is saying Meaw, Meaw, Meaw");
    }

    @Override
    public void eat() {
        System.out.println("The cat eats fish");
    }
}



