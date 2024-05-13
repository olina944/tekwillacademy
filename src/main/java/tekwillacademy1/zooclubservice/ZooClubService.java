package tekwillacademy1.zooclubservice;

public class ZooClubService {
    public static void main(String[] args) {
        Dog bimdog = new Dog("Bark");
        Cat lucyCat = new Cat("name: Lucy");
        Animal mouseMickey = new Mouse( "Mickey Mouse");

        lucyCat.eat();
        lucyCat.makeSound();

        bimdog.eat();
        bimdog.makeSound();


    }
}
