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

        while(true) {
            System.out.println("'add', 'view', 'remove'");
            String input = scanner.next();
            if(input.equals("view")){
                System.out.println("enter which artist of " +list.size()+" you want to see.");
                input = scanner.next();
                int intInput = Integer.parseInt(input);
                System.out.println(intInput);
                if (0 < intInput && intInput < (list.size()+1) ) {
                    System.out.println(list.get(intInput-1));
                }
            } else if(input.equals("remove")){
                System.out.println("which of "+list.size()+" you want to remove.");
                input = scanner.next();
                int intInput = Integer.parseInt(input);
                Artist rmved= list.remove(intInput-1);
                /// show the element that's been removed
                System.out.println(rmved);
                //show the list now that the element's gone
                System.out.println(list);
            } else if(!input.equals("add")){
                break;
            }

            Artist artist = new Artist();
            System.out.println("Artist: ");
            input = scanner.next();
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

            System.out.println("'add', 'view', 'remove'");
            input = scanner.next();
            if(input.equals("view")){
                System.out.println("enter which artist of " +list.size()+" you want to see.");
                input = scanner.next();
                int intInput = Integer.parseInt(input);
                System.out.println(intInput);
                if (0 < intInput && intInput < (list.size()+1) ) {
                    System.out.println(list.get(intInput-1));
                }
            } else if(input.equals("remove")){
                System.out.println("which of "+list.size()+" you want to remove.");
                input = scanner.next();
                int intInput = Integer.parseInt(input);
                Artist rmved= list.remove(intInput-1);
                /// show the element that's been removed
                System.out.println(rmved);
                //show the list now that the element's gone
                System.out.println(list);
            } else if(!input.equals("add")){
                break;
            }
        }
        for (Object i:list){
            System.out.println(i);
        }
    }
}
