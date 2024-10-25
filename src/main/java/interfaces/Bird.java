package interfaces;

import abstraction.Animal;

public class Bird extends Animal implements FlightEnabled {
    public Bird(String type, String size, int weight) {
        super(type, size, weight);
    }

    @Override
    public void makeNoise() {
        System.out.println("Making parrot noises");
    }

    @Override
    public void move(String speed) {
        if(speed == "slow"){
            System.out.println(getDescription() + "is flying slowly");
        }
        else if(speed == "fast"){
            System.out.println(getDescription() + "is flying fast");
        }
    }

    public void fly(){
        System.out.println(getDescription() + "is flying");
    }
}
