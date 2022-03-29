package adventuregame;

public class Hero extends Char implements HeroActions {
	private int health = 100;
	private int maxHeroAttackDamage = 50;
	// private int damageDealt;
	// private int damageTaken;

	public int getHealth() {
		return this.health;
	}

	public void setAttackDamage() {
		super.attackDamage = tools.getRandomNumber(maxHeroAttackDamage);
	}

	@Override
	public void runFromEnemy() {
		// TODO function to run
	}

	@Override
	public void drinkHealthPotion() {
		// TODO function to drink Potions

	}

	@Override
	public void leaveDungeon() {
		// TODO leave dungeon

	}

	@Override
	public void continueAdventure() {
		// TODO look for trouble
		System.out.println("You decided to continue on your adventure!");
	}

}