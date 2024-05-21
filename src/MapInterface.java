import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class MapInterface {
private  static final Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(1,"Aakash");
        map.put(7,"Hari");
        map.put(3,"Vicky");

        System.out.println(map);

        LOGGER.info(""+map.size());

        System.out.println(map.containsKey(101));

        System.out.println(map.containsValue("Hari"));

        System.out.println(map.get(1));

        map.replace(3,"Glad");
        System.out.println(map);

        map.put(4,"Pradeep");
        System.out.println(map);

        map.remove(3);

        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(n-> System.out.println(n.getKey() + " " + n.getValue()));

    }

}
