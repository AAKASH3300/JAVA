interface sayable{ //interface in JAVA 8
    void run(); //abstract method
    default void start(){ //default method
        System.out.println("Started..");
    }
    static void drive(){ //static method
        System.out.println("Driving...");
    }
}
public class InterfaceMethods implements sayable{
    public void run() {
        System.out.println("Running....");
    }

    public static void main(String[] args) {
        InterfaceMethods d= new InterfaceMethods();
        d.run();
        sayable.drive();
        d.start();
    }
}
