import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by blakegilmore on 4/20/16.
 */
public class Main {
    public ArrayList<Artist> list;
    public Main()
    {
    list = new ArrayList<Artist>();
    }

    void viewArtist() {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        System.out.println("enter which artist of " + list.size() + " you want to see.");
        String input = scanner.next();
        int intInput = Integer.parseInt(input);
        System.out.println(intInput);
        if (0 < intInput && intInput < (list.size() + 1)) {
            System.out.println(list.get(intInput - 1));
        }
    }

    void removeArtist(){
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        System.out.println("which of "+list.size()+" you want to remove.");
        String input = scanner.next();
        int intInput = Integer.parseInt(input);
        try {
            Artist rmved = list.remove(intInput - 1);
            /// show the element that's been removed
            System.out.println(rmved);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("That artist doesn't exist.");
        }
        //show the list now that the element's gone
        System.out.println(list);
    }

    void addArtist(){
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
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
    }

    public static void main(String[] args){
        int x = 0;
        Main app = new Main();
        while(true) {
            Scanner scanner = new Scanner(System.in).useDelimiter("\n");
            System.out.println("'add', 'view', 'remove'");
            String input = scanner.next();
            if(input.equals("view")){
                app.viewArtist();
            } else if(input.equals("remove")){
                app.removeArtist();
            } else if(!input.equals("add")){
                break;
            }

            app.addArtist();

            System.out.println("'add', 'view', 'remove'");
            input = scanner.next();
            if(input.equals("view")){
                app.viewArtist();
            } else if(input.equals("remove")){
                app.removeArtist();
            } else if(!input.equals("add")){
                break;
            }
        }
    }
}
