import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
        Streaming stream = new Streaming();
        Scanner sc = new Scanner(System.in);
        stream.addMedia(new Movie("it", "Andrés Muschietti"));
        Series s1 = new Series("Stranger things");
        stream.addMedia(s1);
        s1.addSeason();
        s1.addEpisode(1, "Pilot", 1);

        System.out.println(stream.getLibrary());

        System.out.println("Søg efter film eller serie");
        String s = sc.nextLine();
        Media result = stream.search(s);
        if (result.getType().equalsIgnoreCase("Series")) {
            int i = stream.countSeasons(s);
            Media se = stream.library.get(i);
            System.out.println("Vælg sæson:");
            String seas = sc.nextLine();
            int seasInt = parseInt(seas);
           Season ser = ((Series) se).getSeason(seasInt);
            System.out.println("Vælg episode:");
            String ep = sc.nextLine();
            int epInt = parseInt(ep);
            Episode eps = ser.getEpisode(epInt);
            System.out.println("Afspiller nu " + result.getName() + " Sæson " + seasInt + " Episode " + epInt);



        }
        if (result != null) {
            System.out.println(result);
        } else System.out.println("Medie ikke fundet!");


    }
}
