package adventuregame;

public class Game implements GameActions {

	@Override
	public void greetings() {
		System.out.println("#\t#\t #\t#\t#\t#");
		System.out.println("#\t\t\t\t\t#");
		System.out.println("#\t Welcome to the Dungeon! \t#");
		System.out.println("#\t\t\t\t\t#");
		System.out.println("#\t#\t #\t#\t#\t#\n");
		System.out.println("Press any key to start the game!\n");
		
	}

	@Override
	public void initialScreen() {
		System.out.println("----------------------------------------------------");
		System.out.println("\tWelcome to the Dungeon!");
		System.out.println("\tPress any key to start the game.");
		System.out.println("----------------------------------------------------");
		// clearscreen
	}

	@Override
	public void finalScreen() {
		System.out.println("#######################");
		System.out.println("# THANKS FOR PLAYING! #");
		System.out.println("#######################");
	}

	@Override
	public void noEnergyLeft() {
		// TODO Auto-generated method stub

	}

	@Override
	public void clearScreen() {
		// TODO Auto-generated method stub

	}

	@Override
	public void sendEnemy() {
		Enemy enemy = new Enemy();
		System.out.println("=========================================");
		System.out.println("\t# An " + enemy.getName() + " appeared! #");
		System.out.println("=========================================");		
	}

	// quantity of health potions

}
