package handler;

import entity.Human;

public class Town {
	
	Human player = null;
	
	public Town(Human player) {
		this.player = player;
	}
	
	public void town() {
		while(true) {
			System.out.println("Name: " + player.getName() + " | HP: " + player.getMAX_HP() + "/" 
		+ player.getHp() + " | Coins: " + player.getGp() + " | Gender: " + player.getGender());
			System.out.println("1. Battle | 2. Shop | 3. Inventory | 4. Save | 5. Quit");
			Start.input.NumInput();
		}
	}
}
