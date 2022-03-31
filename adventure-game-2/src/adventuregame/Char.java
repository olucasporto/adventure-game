package adventuregame;

public abstract class Char {

	protected String name;
	protected int health;
	protected int attackDamage;
	protected int maxAttackDamage;
	protected Tools tools;

	public Char() {
		this.tools = new Tools();
	}

	public void attack(Char target) {
		target.health -= this.attackDamage;
	}

	public String getName() {
		return this.name;
	}

	public int getHealth() {
		return this.health;
	}

	public abstract void setHealth();
	
	public int getAttackDamage() {
		return this.attackDamage;
	}

	public void setAttackDamage() {
		this.attackDamage = tools.getRandomNumber(maxAttackDamage);
	}
	
	public abstract void setMaxAttackDamage();

	
}
