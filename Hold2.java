
class Automobile{}

public class Hold2{
	private Object a;
	public Hold2(Object a){ this.a = a;}
	public void set(Object a){ this.a = a;}
	public Object get() { return a;}
	public static void main(String[] args) {
		// hold Automobile
		Hold2 h2 = new Hold2(new Automobile());
		Automobile a = (Automobile)h2.get();
		// hold string	
		h2.set("not an Automobile");
		String s = (String)h2.get();
		// hold int
		h2.set(1);
		Integer i = (Integer)h2.get();

	}
}