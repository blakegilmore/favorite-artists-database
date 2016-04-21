import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by blakegilmore on 4/20/16.
 */
public class Main {

    public static void main(String[] args){
        ArrayList<Artist> list = new ArrayList<Artist>();
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        int x = 0;


        while(x<2) {
            Artist artist = new Artist();
            System.out.println("Artist: ");
            String input = scanner.next();
            artist.name=input;
            System.out.println(artist.name);

            System.out.println("Age: ");
            int newinput = scanner.nextInt();
            artist.age=newinput;
            System.out.println(artist.age);

            System.out.println("Instrument 1: ");
            input = scanner.next();
            artist.instruments.add(input);
            System.out.println(artist.instruments);

            System.out.println("Instrument 2: ");
            input = scanner.next();
            artist.instruments.add(input);
            System.out.println(artist.instruments);

            System.out.println("Genre: ");
            input = scanner.next();
            artist.genre = input;
            System.out.println(artist.genre);

            System.out.println("Ethnicity: ");
            input = scanner.next();
            artist.ethnicity=input;
            System.out.println(artist.ethnicity);

            System.out.println("Most famous work: ");
            input = scanner.next();
            artist.mostFamousWork=input;
            System.out.println(artist.mostFamousWork);

            list.add(artist);
            x=x+1;
        }
        for (Object i:list){
            System.out.println(i);
        }
    }
}
