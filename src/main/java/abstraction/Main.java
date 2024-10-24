package abstraction;

public class Main {
    public static void main(String[] args) {
//       Animal a = new Animal():
        Animal dog = new Dog("Lab", "Big", 100, "Rex");
        Animal wolfDog = new Dog("wolf", "Big", 100, "Wolf");
        Main.doWhatAnimalDoes(dog);
        Main.doWhatAnimalDoes(wolfDog);
    }

    public static void doWhatAnimalDoes(Animal a){
        a.makeNoise();
        a.move("fast");
    }
}
