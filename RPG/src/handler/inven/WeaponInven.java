package handler.inven;

import java.util.ArrayList;
import handler.Inventory;
import entity.Weapon;
import util.Input;

public class WeaponInven {
	
	Input input = new Input();
	ArrayList<Weapon> wList = null;
	ArrayList<Weapon> current = null;
	
	public void weaponInven(ArrayList<Weapon> wList, ArrayList<Weapon> current) {
		
		this.wList = wList;
		this.current = current;
		
		//viewing for equip and toss
		boolean equip = false;
		boolean toss = false;
		
		while(true) {
			System.out.println("1. Equip | 2. Toss | 3. Back");
			int choice = input.NumInput();
			if(choice == 0) {
				break;
			}else if(choice == 1) {
				equip = true;
				while(equip) {
					if(current.size() == 0) {
						System.out.println("Currently Equipped: Nothing");
					}else {
						System.out.println("Currently Equipped: " + current.get(0).getName());
					}
					for(int i = 0; i < wList.size(); i++) {
						System.out.println("[" + (i+1) + "] " + wList.get(i).getName() + " | " + wList.get(i).getDamage());
					}
					System.out.println("[0] Back");
					choice = input.NumInput();
					if(choice == 0) {
						equip = false;
					}else {
						if(wList.size() > 0) {
							current.add(wList.get(choice-1));
						}
					}
				}
			}else if(choice == 2) {
				toss = true;
				while(toss) {
					
				}
			}
		}
	}
}
