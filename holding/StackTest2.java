// import util.Stack;
import java.util.Stack;

public class StackTest2 {
	public static void main(String[] args){
		Stack<String> stack = new Stack<String>();

		for(String s :"my dog has fleas".split(" "))
			stack.push(s);

		while(!stack.empty())
			System.out.print(stack.pop() + " ");
	}
}