package inheritance;

public class Cat extends Animal {
    Cat(String name, String type){
        super(name, type);
    }

    @Override
    public void makeSound() {
        System.out.println("cat sound");
    }
}
