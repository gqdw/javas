
import java.util.*;

public class IceCream {
	private static Random rand = new Random();
	static final String[] FLAVORS = {
		"Chocolate", "Strawbeery", "Vanilla Fudge Swirl",
		"Mint Chip", "Mocha Almond Fudge", "Rum Raisin",
		"Praline Cream", "mud Pie"
	};
	public static String[] flavorSet(int n){
		if ( n > FLAVORS.length) {
			throw new  IllegalArgumentException("Set too big");
		}
		String[] results = new String[n];
		boolean[] picked = new boolean[FLAVORS.length];
		for (int i = 0 ; i < n ; i++ ) {
			int t;
			do
				t = rand.nextInt(FLAVORS.length);
			while(picked[t]);
			results[i] = FLAVORS[t];
			picked[t] = true;
			
		}
		return results;
	}
	public static int[] returnTest(){
		int[] res = new int[]{1 ,2 ,3};
		return res;
	}
	public static void main(String[] args) {
		for (int i = 0; i < 7 ;i++ ) {
			System.out.println(Arrays.toString(flavorSet(3)));
		}
		int[] s = returnTest();
		System.out.println(Arrays.toString(s));
	}
}