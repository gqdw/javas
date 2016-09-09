public class SimpleThread extends Thread {
	private int countDown = 5;
	private int threadNumber;
	private static int threadCount = 0;
	
	public void SimpletThread() {
		threadNumber = ++threadCount;
		System.out.println("making " + threadNumber);
	}

	public void run() {
		while(true) {
			System.out.println("Thead " +
				threadNumber + "(" + countDown + ")");
			if(--countDown == 0) return;
		}
	}
	public static void main(String[] args){
		for(int i = 0; i<5; i++)
			new SimpleThread().start();
		System.out.println("all threads started");
	}
}
