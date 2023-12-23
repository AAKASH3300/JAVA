import java.io.*;
class employee implements Serializable{
    int id = 110;
    double salary= 5000.00d;
}
public class SerializationExample {
    public static void main(String[] args) {
        try{
            employee e1 = new employee();
            FileOutputStream fos = new FileOutputStream("emp.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(e1); //serialization
            oos.close();
            fos.close();
            FileInputStream fis = new FileInputStream("emp.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            employee e2 = (employee)ois.readObject(); //deserialization
            System.out.println(e2.id+" "+e2.salary);
            ois.close();
            fis.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
