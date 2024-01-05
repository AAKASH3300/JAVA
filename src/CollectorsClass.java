import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsClass {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(10, 2, 3, 5, 6);

                Set<Integer> s =
                        l.stream()
                                .map(n->n*2)
                                .collect(Collectors.toSet()); //converting from stream to Set collection
        System.out.println(s);

        //Map
        List<Integer> l1 = Arrays.asList(12,10,13,1);
        Map<Integer,Integer> m=
                l1.stream()
                        .filter(n->n>10)
                        .collect(Collectors.toMap(n->n%10,n->n)); //converting from stream to Map collection
                m.entrySet().stream().forEach(n-> System.out.println(n.getKey()+" "+n.getValue()));
    }
}
