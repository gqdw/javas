import java.util.Scanner;
class ScannerTest {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("input:");
		int a = scanner.nextInt();
		System.out.printf("%d\n", a*a);
	}
}