public class SimpleFormat {

	public static void main(String[] args) {
		int x = 5;
		double y =5.5234;
		System.out.println("Row 1: [" + x + " " + y + "]");
		System.out.format("Row 2: [%d %f]\n", x ,y);
		System.out.printf("Row 3: [%d %f]\n", x ,y);

	}
}