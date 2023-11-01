public class JavaString {
    public static void main(String[] args) {
        String txt1 = "Welcome";
        String txt2 = "BIT";
        System.out.println("The length of the txt string is: " + txt1.length());

        System.out.println(txt1.toUpperCase());//Uppercase

        System.out.println(txt2.toLowerCase());//Lowercase

        System.out.println(txt2.indexOf("I"));//locate string by index number

        System.out.println(txt1 + " " + txt2);//Concatenation using + operator

        System.out.println(txt1.concat(txt2));// concat method
    }
}


