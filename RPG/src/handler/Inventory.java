package handler;

import java.util.ArrayList;

import handler.inven.PotionInven;
import handler.inven.WeaponInven;

public class Inventory {
	
	static WeaponInven w = new WeaponInven();
	static PotionInven p = new PotionInven();
	
	public void playerInventory() {
		while(true) {
			System.out.println("1. Equipments | 2. Potions | 0. Exit");
			int choice = Start.input.NumInput();
			if(choice == 0) {
				break;
			}else if(choice == 1) {
				w.weaponInven();
			}else if(choice == 2) {
				p.potionInven();
			}
		}
	}
}
