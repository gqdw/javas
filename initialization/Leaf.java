public class Leaf{
	int i = 0;
	Leaf increment(){
		i++;
		return this;
	}

	Leaf(){
		System.out.println("new Leaf");
	}

	void print(){
		System.out.println("i = " + i);
	}

	public static void main(String[] args) {
		Leaf x = new Leaf();
		x.increment().increment().increment().print();
		
	}
}