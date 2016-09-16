class automobile{}
public class Hold3<T>{
	private T a;
	public Hold3(T a){ this.a = a;}
	public void set(T a){ this.a = a;}
	public T get() { return a;}
	public static void main(String[] args) {
		Hold3<automobile> h3 = new Hold3<automobile>(new automobile());
		automobile a = h3.get();
		// h3.set(1);

	}
}