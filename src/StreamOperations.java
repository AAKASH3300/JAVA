import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperations {
    public static void main(String[] args) {

        List <Integer> l = Arrays.asList(8,5,4,11,6);
       // l.forEach(n-> System.out.println(n));

        //filter() method
        List <Integer> filter =
                l.stream()
                        .filter(n->n%2==1)
                        .collect(Collectors.toList());
        System.out.println(filter);

        List<String> name= Arrays.asList("Zayn","Justin","Shawn","Akon");

        // sorted() method and collect() method
        List<String> sort =
                name.stream()
                        .sorted()
                        .collect(Collectors.toList());
        System.out.println(sort);

        //map() method and forEach() method
        l.stream()
                        .map(n->n*2)
                        .forEach(n-> System.out.println(n));

        //reduce() method
        int reduce =
                l.stream()
                        .reduce(0,(a,b)->a+b);
        System.out.println(reduce);

    }
}
