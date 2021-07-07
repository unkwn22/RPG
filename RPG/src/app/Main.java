package app;

import java.util.ArrayList;

import constructor.ItemConstructor;
import entity.Human;
import entity.Potion;
import entity.Weapon;
import handler.Start;
import handler.Town;

public class Main {
	Start s = new Start();
	Human player = null;
	ItemConstructor i = new ItemConstructor();
	ArrayList<Weapon> weapon = null;
	ArrayList<Potion> potion = null;
	
	public Main() {
		player = s.characterSettings();
		weapon = i.initWeapons();
		potion = i.initPotions();
		Town t = new Town(player, weapon, potion);
		t.town();
	}

	public static void main(String[] args) {
		new Main();
	}
}
