
class Candy{
	static { System.out.println("Loading Candy"); }
}

class Gum {
	static {System.out.println("Loading Gum"); }
}

class Cookie{
	static {System.out.println("Loading Cookie");}
}
public class SweetShop{
	public static void main(String[] args) {
		System.out.println("inside main");
		new Candy();
		System.out.println("after create Candy");
		try{
			Class.forName("Gum");
		} catch(ClassNotFoundException e){
			System.out.println("could not find Gum");
		}

		System.out.println("after class.forName(\"Gum\")");
		new Cookie();
		System.out.println("after creating Cookie");
	}
}