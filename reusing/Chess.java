
class Game {
	Game(int i){
		System.out.println("Game constructors");
	}
}

class BoardGame extends Game {
	BoardGame(int i){
		// 如果没有super(i)，编译会报错。constructor Game in class Game cannot be applied to given types;
		super(i);
		System.out.println("BoardGame constructors");
	}
}

public class Chess extends BoardGame{
	Chess() {
		super(11);
		System.out.println("Chess constructors");
	}

	public static void main(String[] args) {
		Chess x = new Chess();
	}
}