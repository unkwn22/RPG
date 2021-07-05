package entity;

public class Human extends Unit {
	
	private int gp;

	public Human(String name, int MAX_HP, int hp, int damage) {
		super(name, MAX_HP, hp, damage);
	}

	public int getGp() {
		return gp;
	}

	public void setGp(int gp) {
		this.gp = gp;
	}
	
	

}
