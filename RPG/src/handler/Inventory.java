package handler;

import java.util.ArrayList;

import handler.inven.Potion;
import handler.inven.Weapon;

public class Inventory {
	Weapon w = new Weapon();
	Potion p = new Potion();
	
	public void playerInventory() {
		while(true) {
			System.out.println("1. Equipments | 2. Potions | 3. Exit");
			int choice = Start.input.NumInput();
			if(choice == 1) {
				w.weaponInven();
			}else if(choice == 2) {
				p.potionInven();
			}else if(choice == 3) {
				break;
			}
		}
	}
}
