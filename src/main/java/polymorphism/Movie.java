package polymorphism;

public class Movie {
    String title;

    public Movie(String title) {
        this.title = title;
    }

    public void play(){
        System.out.println(title + " Playing a movie");
    }

    //Factory design pattern
    public static Movie createMovie(String genre, String title) {
        Movie m;
        if (genre.equalsIgnoreCase("A")) {
            m = new Adventure(title);
        } else if (genre.equalsIgnoreCase("C")) {
            m = new Comedy(title);
        } else if (genre.equalsIgnoreCase("S")) {
            m = new Scifi(title);
        } else {
            m = new Movie(title);
        }
        return m;
    }

}
