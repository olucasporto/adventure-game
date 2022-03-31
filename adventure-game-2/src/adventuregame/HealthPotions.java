package adventuregame;

public abstract class HealthPotions {
	protected int healthPotionsQuatity;
	protected int healthPotionsHealAmount;
	protected Tools tools;

	public HealthPotions() {
		setInitialHealthPotionsQuatity();
		setHealthPotionsHealAmount();
	}

	public int getHealthPotionsQuatity() {
		return healthPotionsQuatity;
	}
	
	public abstract void setInitialHealthPotionsQuatity();

	public int getHealthPotionsHealAmount() {
		return healthPotionsHealAmount;
	}

	public void setHealthPotionsHealAmount() {
		this.healthPotionsHealAmount = 30;
	}
}
