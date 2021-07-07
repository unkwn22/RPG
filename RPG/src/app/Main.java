package app;

import entity.Human;
import handler.Start;
import handler.Town;

public class Main {
	
	Start s = new Start();
	Human player = null;
	
	public Main() {
		player = s.CharacterSettings();
		Town t = new Town(player);
		t.town();
	}

	public static void main(String[] args) {
		new Main();
	}

}
