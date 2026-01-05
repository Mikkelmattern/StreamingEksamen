import java.util.ArrayList;
import java.util.List;

public class Series extends Media{
    private List<Season> seasons;
    private String title;

    Series (String title){
        this.title = title;
        this.seasons = new ArrayList<>();
    }
    public void addSeason(Season season){
        seasons.add(season);
    }
    public String getTitle(int ssn){
        Season s = seasons.get(ssn);
        return s.getName();
    }
    /*
    public Episode getEpisode(){

        return episode;
    }*/
}
