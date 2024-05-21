import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

public class IteratorsInCollection {

	public static void main(String... args) {
		
		List<Integer> li = new ArrayList<>();
		
		li.add(10);
		li.add(12);
		li.add(3);
		li.add(43);
		li.add(41);
		
		Iterator<Integer> itr = li.iterator();
		
		System.out.println("Items in the List : ");
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		HashMap<Integer, String> map = new HashMap<>();
		
		map.put(10, "Ronaldhino");
		map.put(11, "Pele");
		
		Iterator<Map.Entry<Integer, String>> itr1 = map.entrySet().iterator();
		
		System.out.println("Entrys in the map : ");
		
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		
		ListIterator<Integer> liItr = li.listIterator();
		
		System.out.print("Navigating from forward : ");
		
		while(liItr.hasNext()) {
			int num = liItr.next();
			if(num == 43) {
				liItr.remove();
			}
			System.out.print(num + " ");
		}
		
		System.out.print("\nnavigating from end : ");
		
		while(liItr.hasPrevious()) {
			System.out.print(liItr.previous() + " ");
			
		}
		
		
	}
	
}
