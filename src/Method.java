import java.util.*;
public class Method {
    public int sum(int a,int b){
        int result;
        result=a+b;
        return result;
    }
    public static void main(String args[]){
        Method m = new Method();
        int output;
        output=m.sum(5,6);
        System.out.println(output);
    }
}
