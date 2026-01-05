import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Streaming stream = new Streaming();
        Scanner sc = new Scanner(System.in);
        stream.addMovie(new Movie("it", "Andrés Muschietti"));
        System.out.println("Søg efter film eller serie");
        String s = sc.nextLine();
        Media result = stream.search(s);
      if(result != null){
          System.out.println(result);
      } else System.out.println("Medie ikke fundet!");


    }
}
