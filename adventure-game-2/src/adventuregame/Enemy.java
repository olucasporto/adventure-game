package adventuregame;

public class Enemy extends Char implements EnemiesActions {
	private String[] listOfEnemies = { "Skeleton", "Zombie", "Warrior", "Assassin" };
	private String name = listOfEnemies[tools.getRandomNumber(listOfEnemies.length)];
	private int maxEnemyHealth = 75;
	private int maxEnemyAttackDamage = 25;
	private int health = tools.getRandomNumber(maxEnemyHealth);
	private int attackDamage = tools.getRandomNumber(maxEnemyAttackDamage);
	

	public String getName() {
		return this.name;
	}

	public void setHealth() {
		super.health = tools.getRandomNumber(maxEnemyHealth);
	}

	public void setAttackDamage() {
		super.attackDamage = tools.getRandomNumber(maxEnemyAttackDamage);
	}

}
