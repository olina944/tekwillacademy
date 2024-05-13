package tekwillacademy1.zooclubservice;

public class Mouse extends Animal implements AnimalInterface {
    public Mouse (String name1){
        super(name1);
    }
    public void makeSound(){
        System.out.println("the mouse is making kits kits");
    }

    @Override
    public void eat() {

    }
}
