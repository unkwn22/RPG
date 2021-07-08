package handler;

import java.util.ArrayList;

import entity.Potion;
import entity.Weapon;
import handler.inven.PotionInven;
import handler.inven.WeaponInven;

public class Inventory {
	
	static ArrayList<Weapon> wList = new ArrayList<>();
	static ArrayList<Potion> pList = new ArrayList<>();
	static ArrayList<Weapon> current = new ArrayList<>();
	
	WeaponInven w = new WeaponInven();
	PotionInven p = new PotionInven();
	
	public void playerInventory() {
		while(true) {
			System.out.println("1. Weapons | 2. Potions | 0. Exit");
			int choice = Start.input.NumInput();
			if(choice == 0) {
				break;
			}else if(choice == 1) {
				
			}else if(choice == 2) {
				
			}
		}
	}
}
