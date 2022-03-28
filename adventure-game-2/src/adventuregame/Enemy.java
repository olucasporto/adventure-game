package adventuregame;

import java.util.Random;

public class Enemy extends Char {
	private String[] listOfEnemies = { "Skeleton", "Zombie", "Warrior", "Assassin" };
	private int maxEnemyHealth = 75;
	private int maxEnemyAttackDamage = 25;

	public String getName() {
		return name;
	}
	
	private String setEnemyName() {
		return "1"; //listOfEnemies[rand.nextInt(listOfEnemies.length)];
	}

	public void setName() {
		super.name = this.setEnemyName();
	}

	public void setHealth() {
	//	super.health = tools.setRandomNumber(maxEnemyHealth);
	}

	public void setAttackDamage() {
	//	super.attackDamage = rand.nextInt(this.maxEnemyAttackDamage);
	}

	@Override
	public void drinkHealthPotion() {	
		System.out.println(this.getName() + "can't drink potions!");
	}

	@Override
	public void run() {	
		System.out.println(this.getName() + "can't run!");
	}

}
