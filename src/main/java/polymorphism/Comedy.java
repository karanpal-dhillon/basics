package polymorphism;

public class Comedy extends Movie{
    public Comedy(String title) {
        super(title);
    }
    @Override
    public void play(){
        System.out.println("Playing a comedy movie");
    }

    public void showDescription(){
        System.out.println(title + " is a movie that came in year 2001");
    }

}
