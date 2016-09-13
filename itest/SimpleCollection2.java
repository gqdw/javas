import java.util.*;

public class SimpleCollection2 {
	public static void main(String[] args) {
		Set<Integer> c = new HashSet<Integer>();
		// Collection<Integer> c = new ArrayList<Integer>();
		for (int i=0; i<10; i++)
			c.add(i);
		c.add(5);
		c.add(15);
		for(Integer i :c )
			System.out.print( i + ", ");
	}
}