import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(5,1,4,9,2);

        Stream<Integer> data = nums.stream(); //creating a stream
        int result = data
                .filter(n->n%2==1)//tp filter odd and even numbers
                .sorted()  // sorting the values
                .map(n->n*2)
//              .forEach(n-> System.out.println(n));  doubling the values using stream
                .reduce(0,(a,b)->a+b);
        System.out.println(result);
//        for (int n:nums) {
//            System.out.println(n*2);
//        }
    }
}
