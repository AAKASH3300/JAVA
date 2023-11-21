public class Variables {
    static int num=10; //static variable
    int display(){
        int n=100; //local variable
        return n;
    }

    public static void main(String[] args) {
        int data=50; //instance variable
        System.out.println(num);
        System.out.println(data);
    }
}

