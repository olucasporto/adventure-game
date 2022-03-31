package adventuregame;

public abstract class Char {

	protected int health;
	protected int maxAttackDamage;
	protected HealthPotions healthPotions;
	protected Tools tools;

	public Char() {
		this.tools = new Tools();
		this.setInitialHealth();
		this.setMaxAttackDamage();
	}

	public void attack(Char target) {
		int damageDealt = tools.getRandomNumber(getMaxAttackDamage());
		loseHealth(target, damageDealt);
	}

	public void loseHealth(Char target, int damageTaken) {
		target.health -= damageTaken;
	}

	public int getHealth() {
		return this.health;
	}

	public abstract void setInitialHealth();

	public abstract void setMaxAttackDamage();

	public int getMaxAttackDamage() {
		return this.maxAttackDamage;
	};
}
