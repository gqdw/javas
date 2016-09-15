import java.util.*;

public class ArrayNew {
	public static void main(String[] args) {
		int[] a;
		Random rand = new Random(47);
		a = new int[rand.nextInt(20)];
		System.out.println(a.length);
		System.out.println(Arrays.toString(a));
		// cannot println(a)
		// System.out.println(a);
	}
}