import java.util.List;
import java.util.ArrayList;

public class InfiniteRecursion{
	public String toString(){
		// error :
		// return " InfiniteRecursion address: " + this + "\n";
		return super.toString();
	}

	public static void main(String[] args) {
		// List<InfiniteRecursion> v = new ArrayList<InfiniteRecursion>();
		// for (int i = 0; i < 10 ; i++) {
		// 	v.add(new InfiniteRecursion());
		// }

		InfiniteRecursion i = new InfiniteRecursion();
		System.out.println(i);
	
	}
}
