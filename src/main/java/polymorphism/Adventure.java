package polymorphism;

public class Adventure extends Movie{
    public Adventure(String title) {
        super(title);
    }

    @Override
    public void play(){
        System.out.println("Playing an adventure movie");
    }
}
