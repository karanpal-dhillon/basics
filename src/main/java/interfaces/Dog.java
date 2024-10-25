package interfaces;

public class Dog extends Animal {
    public String name;
    public Dog(String type, String size, int weight, String name) {
        super(type, size, weight);
        this.name = name;
    }

    @Override
    public void makeNoise() {
        String description = getDescription();
        if(type == "wolf") {
            System.out.println(description + " Howling");
        }
        else {
            System.out.println(description+ " Barking");
        }
    }

    @Override
    public void move(String speed) {
        if(speed == "slow"){
            System.out.println(getDescription() + "is walking");
        }
        else if(speed == "fast"){
            System.out.println(getDescription() + "is running");
        }
    }
}
