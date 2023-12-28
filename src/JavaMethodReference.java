interface printable{
    void say();
}
public class JavaMethodReference {
    public static void saySomething(){
        System.out.println("Hello, this is static method.");
    }
    public static void main(String[] args) {
        // Referring static method
        printable sayable = JavaMethodReference::saySomething; // passing static method reference to interface method
        // Calling interface method
        sayable.say();
    }
}

