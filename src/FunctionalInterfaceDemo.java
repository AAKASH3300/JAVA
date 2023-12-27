@FunctionalInterface
interface functional{ //functional interface
    void function();
}
public class FunctionalInterfaceDemo{

    public static void main(String[] args) {
        functional f =()-> { //lambda expression
            System.out.println("Implementing Functional Interface");
        };
        f.function();
    }
}
