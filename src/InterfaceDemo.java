interface driveable{
    void drive();
}
interface runnable {
    void run();
}
public class InterfaceDemo implements driveable,runnable{
    public void drive(){

        System.out.println("Started Driving");
    }
    public void run() {
        System.out.println("Running...");
    }

    public static void main(String[] args) {
        InterfaceDemo c= new InterfaceDemo();
        c.drive();
        c.run();

    }
}
// Multiple Inheritance in java is possible using interface,
// because implementation is provided by the implementation class so there is no ambiguity