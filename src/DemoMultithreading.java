class run extends Thread{
    public void run() {
        System.out.println("Thread Starting....");
    }
}
public class DemoMultithreading {
    public static void main(String[] args) throws InterruptedException {
        run t1 = new run();
        t1.start();

    }
}
