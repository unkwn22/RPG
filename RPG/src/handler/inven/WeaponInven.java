package handler.inven;

import java.util.ArrayList;

import entity.Weapon;
import handler.Start;
import util.Input;

public class WeaponInven {
	
	static ArrayList<Weapon> wList = new ArrayList<>();
	Input input = new Input();

	public void weaponInven() {
		while(true) {
			for(int i = 0; i < wList.size(); i++) {
				System.out.println();
			}
			System.out.println("[0] Back");
			int choice = input.NumInput();
			if(choice == 0) {
				break;
			}
		}
	}
}
