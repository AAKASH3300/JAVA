import java.util.StringTokenizer;

public class TokenizerExample {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("I am a Java developer");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
