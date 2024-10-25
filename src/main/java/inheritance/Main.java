package inheritance;

import abstraction.Animal;
import abstraction.Dog;

public class Main {
    public static void main(String[] args) {
//       Animal a = new Animal():
        abstraction.Animal dog = new abstraction.Dog("Lab", "Big", 100, "Rex");
        abstraction.Animal wolfDog = new Dog("wolf", "Big", 100, "Wolf");
        Main.doWhatAnimalDoes(dog);
        Main.doWhatAnimalDoes(wolfDog);
    }

    public static void doWhatAnimalDoes(Animal a){
        a.makeNoise();
        a.move("fast");
    }
}
