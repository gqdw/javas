import java.util.*;
class StaticTest{
	static int i = 47;
}

public class HelloDate{
	public static void main(String[] args){
		System.out.println("hello, it's: ");
		System.out.println(new Date());
		StaticTest st1 = new StaticTest();
		StaticTest st2 = new StaticTest();
		System.out.println(st1.i);
		System.out.println(st2.i);
}
}

