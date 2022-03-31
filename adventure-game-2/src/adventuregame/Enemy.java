package adventuregame;

public class Enemy extends Char implements EnemyActions {

	protected String name;
	private String[] listOfEnemies = { "Skeleton", "Zombie", "Warrior", "Assassin" };
	private int maxHealth;

	public Enemy() {
		this.setName();
		this.setMaxAttackDamage();
	}

	// ###### name ######
	@Override
	public String getEnemyType() {
		return listOfEnemies[tools.getRandomNumber(listOfEnemies.length)];
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void setName() {
		this.name = getEnemyType();
	}

	// ###### health ######
	@Override
	public int getMaxHealth() {
		setMaxHealth();
		return maxHealth;
	}

	@Override
	public void setMaxHealth() {
		this.maxHealth = 75;
	}

	@Override
	public void setInitialHealth() {
		this.health = tools.getRandomNumber(getMaxHealth());
	}

	// ###### attack ######
	@Override
	public void setMaxAttackDamage() {
		this.maxAttackDamage = 25;
	}

	// ###### healthPotion ######
	
	// ###### gameOptions ######

}
