public class JavaException {
    public static void main(String[] args) {
        int i=0;
        try{
            i=100/0;
        }
        catch(ArithmeticException e){
            System.out.println("Any number divided by Zero results in infinity");
        }
        System.out.println(i);
    }
}
