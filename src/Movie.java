import java.util.List;

public class Movie extends Media implements Playable {
    private String director;

    Movie(String name, String director) {
        super(name);
        this.director = director;
    }

    @Override
    public void play() {
    System.out.println("Afspiller nu " + super.title);
    }

    @Override
    public String toString() {
        return "Titel: " + super.title + "\nDirektør: " + director;
    }

    @Override
    public String getType() {
        return "Movie";
    }
}
