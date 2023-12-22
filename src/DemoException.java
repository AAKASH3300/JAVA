import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class DemoException {
    public static void main(String[] args) {
        int i,j,k=0;
        i=10;
        try{
            System.out.println("Enter divisor");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            j=Integer.parseInt(br.readLine()); //IOException,NumberFormatException
            k=i/j; //ArithmeticException
            System.out.println("Output:"+k);
        }
        catch(ArithmeticException | IOException e){
            System.out.println("Divide by zero not possible");
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("Finally BYE");
        }
    }

}
