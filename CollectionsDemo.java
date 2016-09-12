import java.util.*;

public class CollectionsDemo {
	public static void main(String[] args) {
		Set s1 = new HashSet(); 
		s1.add("Zara");
		s1.add("Mahnaz");
		s1.add("Ayan");
		System.out.println();
		System.out.println(" Set Elements");
		System.out.print("\t" + s1);

		// List list = new ArrayList();
		for(Object o : s1){
			System.out.println(o);
		}
	}
}