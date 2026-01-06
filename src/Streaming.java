import java.util.ArrayList;
import java.util.List;

public class Streaming {
    List<Media> library = new ArrayList<>();
    Series series;
    Movie movie;
    public Movie getMovie(Movie movie) {
        return movie;
    }

    public void addMedia(Media media) {
        if (media.getType().equals("Movie")) {
            library.add(media);
        } else if (media.getType().equals("Series")) {
            library.add(media);
        }
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
    public int countSeasons(String searchFor){
        int i = 0;
        for (Media m : library){
            String mediaName = m.getName();
            if (searchFor.equalsIgnoreCase(mediaName)){
                break;
            }
            i++;
        }
        return i;
    }

    public List<Media> getLibrary(){
        return library;
    }

}
