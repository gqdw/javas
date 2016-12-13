import java.util.concurrent.atomic.*;

public class atomicEvenGenerator extends IntGenerator {
	private AtomicInteger currentValue = 
	 	new AtomicInteger(0);
	public int next(){
		return currentValue.addAndGet(2);
	}

	public static void main(String[] args) {
		EvenChecker.test(new atomicEvenGenerator());
	}
}