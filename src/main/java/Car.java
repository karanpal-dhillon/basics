public class Car {
    private String make;
    private String model;
    private String color;
    private int doors;
    private boolean convertible;

    public Car(){
        System.out.println("Default constructor called");
    }

    public Car(String make, String model, int doors, boolean convertible) {
        this(make, model,"Black", doors,convertible);
        System.out.println("Constructor with 4 args called");
    }

    public Car(String make, String model, String color, int doors, boolean convertible) {
        this();
        this.make = make;
        this.model = model;
        this.color = color;
        this.doors = doors;
        this.convertible = convertible;
    }

    public void describeCar() {
        System.out.println("Make " + make + "; Model " + model + "; color " + color + "; Doors " + doors + "; Convertible " + convertible);
    }

    public String getMake(){
        return make;
    }

    public void setMake(String make){
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }
}
