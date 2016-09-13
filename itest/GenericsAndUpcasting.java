import java.util.*;

class Apple {}

class GrannySmith extends Apple {
	public String toString(){
		return "GrannySmith abc";
	}
}

class Gala extends Apple {}

class Fuji extends Apple{}

class Braeburn extends Apple {}

public class GenericsAndUpcasting {
	public static void main(String[] args) {
		List<Apple> apples = new ArrayList<Apple>();
		// ArrayList<Apple> apples = new ArrayList<Apple>();
		apples.add(new GrannySmith());
		apples.add(new Gala());
		apples.add(new Fuji());
		apples.add(new Braeburn());
		for (Apple a: apples)
			System.out.println(a);
	}
}