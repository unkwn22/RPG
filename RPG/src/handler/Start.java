package handler;

import entity.Human;
import util.Input;

public class Start {
	
	static Input input = new Input();
	
	public Human CharacterSettings() {
		
		boolean start = true;
		boolean settings = false;
		
		while(start) {
			System.out.println("1. New Game | 2. Exit");
			int choice = input.NumInput();
			if(choice == 1) {
				start = false;
				settings = true;
			}else if(choice == 2) {
				start = false;
			}
		}
		
		while(settings) {
			System.out.println("Enter you name");
			String name = input.LetterInput();
			System.out.println("1. Male | 2. Female");
			System.out.println("Your gender");
			int gender = input.NumInput();
			Human player = new Human(name, 10, 10, 3, 20, gender);
			return player;
		}
		
		return null;
	}
}
