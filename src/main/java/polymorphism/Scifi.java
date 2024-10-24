package polymorphism;

public class Scifi extends Movie{
    public Scifi(String title) {
        super(title);
    }

    @Override
    public void play() {
        System.out.println("Playing a scifi movie");
    }
}
