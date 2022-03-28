package adventuregame;

public abstract class Char implements Actions {

	protected String name;
	protected int health;
	protected int attackDamage;
	protected Tools tools;
	
	public Char() {
		this.tools = new Tools();
	}
	
	public void attack(Char target) {
		target.health -= this.attackDamage;

	}
}
