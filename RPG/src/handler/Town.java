package handler;

import entity.Human;

public class Town {
	
	static Human player = null;
	Inventory inven = new Inventory();
	
	public Town(Human player) {
		Town.player = player;
	}
	
	public void town() {
		while(true) {
			System.out.println("Name: " + player.getName() + " | HP: " + player.getMAX_HP() + "/" 
		+ player.getHp() + " | Coins: " + player.getGp() + " | Gender: " + player.getGender());
			System.out.println("1. Battle | 2. Shop | 3. Inventory | 4. Save | 5. Quit");
			int choice = Start.input.NumInput();
			if(choice == 1) continue;
			else if(choice == 2) continue;
			else if(choice == 3) {
				inven.playerInventory();
			}
		}
	}
}
