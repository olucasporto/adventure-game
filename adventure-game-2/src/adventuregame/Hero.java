package adventuregame;

public class Hero extends Char {
	private int health = 100;
	private int maxHeroAttackDamage = 50;
	//private int damageDealt;
	//private int damageTaken;

	public int getHealth() {
		return this.health;
	}
	
	@Override
	public void run() {
		// TODO function to run
	}

	@Override
	public void drinkHealthPotion() {
		// TODO function to drink Potions
		
	}
	
	public void setAttackDamage() {
		super.attackDamage = rand.nextInt(this.maxHeroAttackDamage);
	}

	
	
}