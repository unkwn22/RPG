package constructor;

import entity.Human;

public class UnitConstructor {
	
	public UnitConstructor(String name, int gender) {
		Human player = new Human(name, 10, 10, 3, 100, gender);
	}
}
