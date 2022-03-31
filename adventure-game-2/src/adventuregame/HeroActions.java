package adventuregame;

public abstract interface HeroActions {

	// ###### name ######
	
	// ###### health ######
	public abstract void drinkHealthPotion();
	
	// ###### attack ######
	
	// ###### healthPotion ######
	public abstract void attack(Char target);

	// ###### gameOptions ######
	public abstract void runFromEnemy();

	public abstract void leaveDungeon();

	public abstract void continueAdventure();

}
