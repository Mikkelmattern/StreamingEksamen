import java.util.ArrayList;
import java.util.List;

public class Series extends Media{
    private List<Season> seasons = new ArrayList<>();

    Series (String title){
        super(title);
    }
    public void addSeason(){
        seasons.add(new Season(seasons.size()+1));
    }
    public String getTitle(){
        return title;
    }
    public void addEpisode(int seasonNumber, String name, int number){
        int index = seasonNumber -1;
        while (seasons.size() <= index){
            seasons.add(new Season(seasons.size()+1));
        }

        seasons.get(index).addEpisode(new Episode(name, seasonNumber, number));
    }
 public int countEpisodes(){
        int amount = 0;
        for (Season s : seasons){
            amount += s.episodeCount();
        }
        return amount;
 }
 public Season getSeason(int i){
        return seasons.get(i-1);
 }
    @Override
    public String getType() {
        return "Series";
    }
    public String toString(){
        return "Titel: "+ title + " Sæsonner: "+ seasons.size() + " Episoder: " + countEpisodes();
    }
}
