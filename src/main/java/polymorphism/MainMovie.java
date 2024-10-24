package polymorphism;

import java.util.Scanner;

public class MainMovie {
    public static void main(String[] args) {
        System.out.println("Enter A for adventure, S for Scifi and C for comedy.");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the title: ");
        String title =  s.nextLine();
        System.out.println("Enter the genre: ");
        String genre = s.nextLine();
        Movie m = Movie.createMovie(genre, title);
        m.play();
    }
}
