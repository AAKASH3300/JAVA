import java.util.ArrayList;
import java.util.Iterator;
public class IteratorInterface {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<String>();

        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Kolkata");
        cities.add("Chandigarh");
        cities.add("Noida");

        // Iterator to iterate the cities
        Iterator iterator = cities.iterator();

        System.out.println("Cities elements : ");

        while (iterator.hasNext())
            System.out.print(iterator.next() + " ");

        System.out.println();
    }

}


