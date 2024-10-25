package interfaces;

public abstract class Animal {
    protected String type;
    private String size;
    private int weight;

    public Animal(String type, String size, int weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    public String getDescription(){
        return this.getClass().getSimpleName();
    }

    public abstract void makeNoise();
    public abstract void move(String speed);
}
