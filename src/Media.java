public abstract class Media {
    String title;
    String[] actors;

    public Media(String title, String... actors){
        this.title = title;
        this.actors = actors;
    }
    public void getInfo() {

    }
    public abstract String getType();
    public String getName(){
        return title;
    }
}
