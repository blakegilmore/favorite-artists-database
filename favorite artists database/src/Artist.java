import java.util.ArrayList;

/**
 * Created by blakegilmore on 4/20/16.
 */
public class Artist {
    String name;
    int age;
    ArrayList instruments = new ArrayList();
    String genre;
    String ethnicity;
    String mostFamousWork;

    public String toString() {
        return "Artist{" +
                "name=" + name +
                ", age=" + age +
                ", instruments=" + instruments +
                ", genre=" + genre +
                ", ethnicity=" + ethnicity +
                ", mostFamousWork=" + mostFamousWork +
                '\'' +
                '}';
    }
}


