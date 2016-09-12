
interface CanFight{
	void fight();
}

interface CanSwim {
	void swim();
}

interface CanFly{
	void fly();
}

class ActionCharacter {
	public void fight(){}
}

class Hero extends ActionCharacter
	implements CanFly, CanSwim, CanFight {
		public void swim(){};
		public void fly(){};
	}

public class Adventure{
	public static void t(CanFight x) { x.fight(); }
	public static void main(String[] args) {
		Hero h = new Hero();
		t(h);
	}	
}