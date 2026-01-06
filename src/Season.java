import java.util.ArrayList;
import java.util.List;

public class Season {
    private List<Episode> episodes = new ArrayList<>();
    private int season;

    Season(int season) {
        this.season = season;
    }

    public void addEpisode(Episode episode) {
        episodes.add(episode);
    }

    public int getSeasonLength() {
        return episodes.size();
    }

    public Episode getEpisode(int i) {
        return episodes.get(i-1);
    }

    public int episodeCount() {
        return episodes.size();
    }

}
