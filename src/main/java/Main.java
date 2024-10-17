public class Main {
    public static void main(String[] args) {
        Car c = new Car("Tesla","Model X", "Black", 2, true);
        Car modelS = new Car("Tesla","Model S", 2, true);
        c.describeCar();
        modelS.describeCar();

        Car modelY = new Car();
        modelY.setModel("model y");
        modelY.setMake("Tesla");
        modelY.setConvertible(true);
        modelY.setColor("Red");
        modelY.setDoors(4);
        modelY.describeCar();
    }
}
