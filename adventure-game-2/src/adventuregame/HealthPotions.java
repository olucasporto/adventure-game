package adventuregame;

public class HealthPotions {
	public int HealthPotionsQuatity = 3;
	public int HealthPotionsHealAmount = 30;
	public int HealthPotionsDropChance = 50;
	
	public HealthPotions() {
		setHealthPotionsQuatity();
		setHealthPotionsHealAmount();
		setHealthPotionsDropChance();
	}
	
	public int getHealthPotionsQuatity() {
		return HealthPotionsQuatity;
	}
	public void setHealthPotionsQuatity() {
		this.HealthPotionsQuatity = 3;
	}
	public int getHealthPotionsHealAmount() {
		return HealthPotionsHealAmount;
	}
	public void setHealthPotionsHealAmount() {
		this.HealthPotionsHealAmount = 30;
	}
	public int getHealthPotionsDropChance() {
		return HealthPotionsDropChance;
	}
	public void setHealthPotionsDropChance() {
		this.HealthPotionsDropChance = 50;
	}
}
