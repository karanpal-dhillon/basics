package interfaces;

public class Main {
    public static void main(String[] args) {
//       Animal a = new Animal():
        Animal dog = new Dog("Lab", "Big", 100, "Rex");
        Animal wolfDog = new Dog("wolf", "Big", 100, "Wolf");
        Main.doWhatAnimalDoes(dog);
        Main.doWhatAnimalDoes(wolfDog);

        Bird b = new Bird("Parrot", "Small", 30);
        FlightEnabled f = b;

        Ostriche o = new Ostriche("Ostriche", "Big", 150);

        if(b instanceof FlightEnabled){
            doBirdStuff(b);
        }

//        if(o instanceof FlightEnabled){
//            doBirdStuff(o);
//        }
//
    }

    public static void doWhatAnimalDoes(Animal a){
        a.makeNoise();
        a.move("fast");
    }

    public static void doBirdStuff(FlightEnabled f){
       f.fly();
    }
}
