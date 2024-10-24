package inheritance;

public class Dog extends Animal{
    String color;
    Dog(String name, String type, String color){
        super(name, type);
        this.color = color;
    }

    @Override
    public void makeSound() {
        System.out.println("Bark");
    }

    @Override
    public String toString() {
        String animal = super.toString();
        return animal + "Dog{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
