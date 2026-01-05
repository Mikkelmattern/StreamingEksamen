public class Episode implements Playable {
    private String name;
    private int episode;

    Episode(String name, int episode) {
        this.name = name;
        this.episode = episode;

    }
    public String getName(){return name;};

    @Override
    public void play() {

    }

}
