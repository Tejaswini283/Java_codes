package NewProgramme;
import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

public class CollectionDemo {
	public static void main(String[] args) {
		
		List items=new ArrayList();
		items.add("T");
		items.add(20);
		items.add(true);
		items.add(20.6);
		items.add(2,"chitti");
		for(Object item:items) {
			System.out.println(item);
			
		}
		items.remove((Object)25);
		System.out.println("after removing");
		for(Object item:items) {
			System.out.println(item);
		}
		System.out.println("size="+items.size());

	}
}
