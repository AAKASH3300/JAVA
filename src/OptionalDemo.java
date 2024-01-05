import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        String[] arr = new String[5];
        arr[3]="fly";
        // System.out.println(arr[3].toLowerCase()); //Exception in thread "main" java.lang.NullPointerException: "arr[3]" is null
        Optional<String> o = Optional.ofNullable(arr[3]); // We use Optional Class to avoid NullPointerException
        if(o.isPresent()){
            System.out.println(arr[3].toLowerCase());
        }
        else{
            System.out.println("No values is present");
        }
    }
}
