package handler;

import java.util.ArrayList;

import entity.Potion;
import entity.Weapon;

public class Shop {
	
	static ArrayList<Weapon> weapons = null;
	static ArrayList<Potion> potions = null;
	
	public Shop(ArrayList<Weapon> weapons, ArrayList<Potion> potions) {
		Shop.weapons = weapons;
		Shop.potions = potions;
	}
	
	public void mainShop() {
		while(true) {
			System.out.println("1. Buy | 2. Sell | 0. Exit");
			int choice = Start.input.NumInput();
			if(choice == 0) {
				break;
			}else if(choice == 1) {
				buyShop();
			}else if(choice == 2) {
				sellShop();
			}
		}
	}
	
	public void buyShop() {
		while(true) {
			for(int i = 0; i < weapons.size(); i++) {
				System.out.println("[" + (i+1) + "]" + weapons.get(i).getName() + " | " + weapons.get(i).getCost() + " | " + weapons.get(i).getDamage());
			}
			System.out.println("[0] Exit");
			int choice = Start.input.NumInput();
			if(choice == 0) {
				break;
			}
		}
	}
	
	public void sellShop() {
		while(true) {
			for(int i = 0; i < potions.size(); i++) {
				
			}
		}
	}

}
