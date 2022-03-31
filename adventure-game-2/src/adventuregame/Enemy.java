package adventuregame;

public class Enemy extends Char implements EnemyActions {
	private String[] listOfEnemies = { "Skeleton", "Zombie", "Warrior", "Assassin" };
	private int maxEnemyHealth;

	public Enemy() {
		this.setName();
		this.setHealth();
	}

	public void setMaxEnemyHealth() {
		this.maxEnemyHealth = 75;
	}
	
	public void setName() {
		this.name = listOfEnemies[tools.getRandomNumber(listOfEnemies.length)];
	}

	public void setHealth() {
		this.setMaxEnemyHealth();
		this.health = tools.getRandomNumber(maxEnemyHealth);
	}
	
	@Override
	public void setMaxAttackDamage() {
		this.maxAttackDamage = 25;
	}
	
	

}
