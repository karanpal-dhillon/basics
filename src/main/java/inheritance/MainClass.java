package inheritance;

public class MainClass {
    public static void main(String[] args) {
        MainClass main = new MainClass();
        Animal dog = new Dog("Jack", "Lab", "Brown");
        Animal cat = new Cat("Jill","Country" );
        System.out.println(dog);
        System.out.println(cat);
        main.doStuff(dog);
        main.doStuff(cat);
    }

    public void doStuff(Animal animal){
        animal.makeSound();
    }

}

