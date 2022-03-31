package adventuregame;

public class Hero extends Char implements HeroActions {
	HealthPotionsHero healthPotions;

	public Hero() {
	}

	// ###### name ######
	// ###### health ######
	@Override
	public void setInitialHealth() {
		this.health = 100;
	}

	// ###### attack ######
	@Override
	public void setMaxAttackDamage() {
		this.maxAttackDamage = 50;
	}

	// ###### healthPotion ######
	@Override
	public void drinkHealthPotion() {
		// TODO function to drink Potions

	}

	// ###### gameOptions ######
	@Override
	public void runFromEnemy() {
		// TODO function to run
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