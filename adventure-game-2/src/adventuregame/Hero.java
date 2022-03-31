package adventuregame;

public class Hero extends Char implements HeroActions {
	// private int damageDealt;
	// private int damageTaken;
	HealthPotions healthPotions;

	public Hero() {
		this.setHealth();
	}

	public int getHealth() {
		return this.health;
	}

	@Override
	public void setHealth() {
		this.health = 100;
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

	@Override
	public void setMaxAttackDamage() {
		this.maxAttackDamage = 50;
	}

}