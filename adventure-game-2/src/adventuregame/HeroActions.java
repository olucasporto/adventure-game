package adventuregame;

public abstract interface HeroActions {

	public abstract void attack(Char target);

	public abstract void drinkHealthPotion();

	public abstract void runFromEnemy();

	public abstract void leaveDungeon();

	public abstract void continueAdventure();

}
