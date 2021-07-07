package handler;

import java.util.ArrayList;

import entity.Human;
import entity.Potion;
import entity.Weapon;

public class Town {
	
	static Human player = null;
	Shop s = null;
	Inventory inven = new Inventory();
	
	public Town(Human player, ArrayList<Weapon> weapons, ArrayList<Potion> potions) {
		Town.player = player;
		s = new Shop(weapons, potions);
	}
	
	public void town() {
		while(true) {
			System.out.println("Name: " + player.getName() + " | HP: " + player.getMAX_HP() + "/" 
		+ player.getHp() + " | Coins: " + player.getGp() + " | Gender: " + player.getGender());
			System.out.println("1. Battle | 2. Shop | 3. Inventory | 4. Save | 5. Quit");
			int choice = Start.input.NumInput();
			if(choice == 1) continue;
			else if(choice == 2) {
				s.mainShop();
			}
			else if(choice == 3) {
				inven.playerInventory();
			}
		}
	}
}
