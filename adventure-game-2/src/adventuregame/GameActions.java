package adventuregame;

public abstract interface GameActions {

	public abstract void notifyNoEnergyLeft();

	public abstract void clearScreen(); // System.out.print("\033[H\033[2J");

	public abstract void greetings();
	
	public abstract void sendEnemy();
	
	public abstract void finalScreen();

}
