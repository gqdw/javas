import java.util.Date;
public class ShowProperties{
	public static void main(String[] args) {
		System.getProperties().list(System.out);
		System.out.println(System.getProperty("user.name"));
		System.out.println(
			System.getProperty("java.libary.path"));
		System.out.println(new Date());
	}
}