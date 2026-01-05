import java.util.ArrayList;
import java.util.List;

public class Streaming {
    List<Media> library = new ArrayList<>();

    public Movie getMovie(Movie movie) {
        return movie;
    }

    public void addMedia(Media media) {
        library.add(media);
    }

    public Media search(String searchFor) {
        Media m1 = null;
        for (Media m : library) {
            String mediaName = m.getName();
            if (searchFor.equalsIgnoreCase(mediaName)) {
                m1 = m;
                break;

            }
        }
        return m1;
    }

}
