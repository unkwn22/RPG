package entity;

public class Monster extends Unit {
	
	private int drop;

	public Monster(String name, int MAX_HP, int hp, int damage) {
		super(name, MAX_HP, hp, damage);
	}

	public int getDrop() {
		return drop;
	}

	public void setDrop(int drop) {
		this.drop = drop;
	}
	
}
