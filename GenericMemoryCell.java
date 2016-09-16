
public class GenericMemoryCell<AnyType> {
	private AnyType storedValue;
	public AnyType read(){
		return storedValue;
	}

	public void write(AnyType x){
		storedValue = x;
	}

	public static void main(String[] args) {
		GenericMemoryCell<Integer> m = new GenericMemoryCell<Integer>();
		m.write(99);
		System.out.println(m.read());
	}
}