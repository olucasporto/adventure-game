package adventuregame;

public class HealthPotionsEnemy extends HealthPotions {
	private int healthPotionsDropChance;

	public HealthPotionsEnemy() {
		setHealthPotionsDropChance();
	}

	@Override
	public void setInitialHealthPotionsQuatity() {
		this.healthPotionsQuatity = 1;
	}

	public int getHealthPotionsDropChance() {
		return healthPotionsDropChance;
	}

	public void setHealthPotionsDropChance() {
		this.healthPotionsDropChance = 50;
	}

	public boolean dropHealthPotion() {
		if (tools.getRandomNumber(100) < getHealthPotionsDropChance()) { // drop health potion chance
			this.healthPotionsQuatity--;
			return true; // drop a potion
		} else {
			return false; // don't drop a potion
		}
	}

}
