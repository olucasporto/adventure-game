package adventuregame;

public class Game implements GameActions {

	@Override
	public void greetings() {
		System.out.println("#\t#\t #\t#\t#\t#");
		System.out.println("#\t\t\t\t\t#");
		System.out.println("#\t Welcome to the Dungeon! \t#");
		System.out.println("#\t\t\t\t\t#");
		System.out.println("#\t#\t #\t#\t#\t#\n");
		System.out.println("Press any key to start the game!\n");

	}

	@Override
	public void finalScreen() {
		System.out.println("#\t#\t #\t#\t#\t#");
		System.out.println("#\t\t\t\t\t#");
		System.out.println("#\t THANKS FOR PLAYING! \t#");
		System.out.println("#\t\t\t\t\t#");
		System.out.println("#\t#\t #\t#\t#\t#\n");
	}

	@Override
	public void notifyNoEnergyLeft() {
		System.out.println("\t> You have taken too much damage! You are too weak to go on...");
		System.out.println("You limp out of the dungeon, weak from battle...");
	}

	@Override
	public void clearScreen() {
		// TODO Auto-generated method stub
	}

	@Override
	public void sendEnemy() {
		Enemy enemy = new Enemy();
	}

	public void notifyEnemyArriving(Enemy enemy) {
		System.out.println("=========================================");
		System.out.println("#\t An " + enemy.getName() + " appeared! \t#");
		System.out.println("=========================================");
	}

	public void showHeroHealthStatus(Hero hero) {
		System.out.println("\tYour HP: " + hero.getHealth());
	}

	public void showEnemyHealthStatus(Enemy enemy) {
		System.out.println("\t" + enemy.getName() + "'s HP: " + enemy.getHealth());
	}

	public void showHeroOptions(Hero hero) {
		System.out.println("\n\tWhat would you like to do?");
		System.out.println("\t1. Attack");
		System.out.println("\t2. Drink health potion");
		System.out.println("\t3. Run!");
	}

	public void showFightLog(Hero hero, Enemy enemy) {
		System.out.println("\t> You strike the " + enemy.getName() + " for " + "enemy.damageTaken" + " damage.");
		System.out.println("\t> You receive " + "hero.damageTaken" + " in retaliation!");
	}

	public void showUseOfHealthPotionLog(HealthPotions potions, Hero hero) {
		System.out.println(
				"\t> You drink a health potion, healing yourself for " + potions.healthPotionsHealAmount + ".");
		System.out.println("\t> You now have " + hero.getHealth() + " HP.");
		System.out.println("\t> You have " + potions.getHealthPotionsQuatity() + " health potions left.\n");
	}

	public void notifyNoPotionsLeft() {
		System.out.println("\t> You don't have any health potions left... Defeat enemies for a chance to get one!");
	}

	public void showRunLog(Enemy enemy) {
		System.out.println("\tYou run away from the " + enemy.getName() + "!");
	}

	public void defeatingEnemyLog(Enemy enemy, Hero hero) {
		System.out.println("----------------------------------------------------");
		System.out.println(" # " + enemy.getName() + " was defeated! # ");
		System.out.println(" # You have " + hero.getHealth() + " HP left. # ");
		
	}
	
	public void dropPotionLog(Enemy enemy, Hero hero) {
		System.out.println(" # The " + enemy.getName() + " dropped a health potion! # ");
		System.out.println(" # You now have " + "hero.getnumHealthPotions" + " health potion(s). # ");
	}
	
	public void showOptionsPostBattle() {
		System.out.println("----------------------------------------------------");
		System.out.println("What would you like to do now?");
		System.out.println("1. Continue fighting!");
		System.out.println("2. Exit dungeon.");
	}
	
	public void showContinueMessage() {
		System.out.println("You continue on your adventure!");		
	}
	
	public void showQuitDungeonMessage() {
		System.out.println("You exit the dungeon, sucessful from your adventures!");
	}
}
