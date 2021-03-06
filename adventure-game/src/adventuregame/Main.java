package adventuregame;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// System objects
		Scanner in = new Scanner(System.in);
		Random rand = new Random();

		// Game variables
		String[] enemies = { "Skeleton", "Zombie", "Warrior", "Assassin" };
		int maxEnemyHealth = 75;
		int enemyAttackDamage = 25;

		// Player variables
		int health = 100;
		int attackDamage = 50;
		int numHealthPotions = 3;
		int healthPotionHealAmount = 30;
		int healthPotionDropChance = 50; // Percentage

		boolean running = true;

		System.out.println("Welcome to the Dungeon!");

		GAME: while (running) { // looking for a challenge
			System.out.println("----------------------------------------------------");

			int enemyHealth = rand.nextInt(maxEnemyHealth);
			String enemy = enemies[rand.nextInt(enemies.length)];
			System.out.println("\t# " + enemy + " has appeared! #\n");

			while (enemyHealth > 0) { // while enemy is still up
				System.out.println("\tYour HP: " + health);
				System.out.println("\t" + enemy + "'s HP: " + enemyHealth);
				System.out.println("\n\tWhat would you like to do?");
				System.out.println("\t1. Attack");
				System.out.println("\t2. Drink health potion");
				System.out.println("\t3. Run!");

				String input = in.nextLine();

				if (input.equals("1")) { // attack!
					int damageDealt = rand.nextInt(attackDamage);
					int damageTaken = rand.nextInt(enemyAttackDamage);

					enemyHealth -= damageDealt;
					health -= damageTaken;

					System.out.println("\t> You strike the " + enemy + " for " + damageDealt + " damage.");
					System.out.println("\t> You receive " + damageTaken + " in retaliation!");

					if (health < 1) { // you died
						System.out.println("\t> You have taken too much damage! You are too weak to go on...");
						break;
					}

				} else if (input.equals("2")) { // heal
					if (numHealthPotions > 0) { // still have health potions left
						health += healthPotionHealAmount;
						numHealthPotions--;
						System.out.println(
								"\t> You drink a health potion, healing yourself for " + healthPotionHealAmount + ".");
						System.out.println("\t> You now have " + health + " HP.");
						System.out.println("\t> You have " + numHealthPotions + " health potions left.\n");
					} else { // health potions over
						System.out.println(
								"\t> You don't have any health potions left... Defeat enemies for a chance to get one!");
					}
				} else if (input.equals("3")) { // run baby, run
					System.out.println("\tYou run away from the " + enemy + "!");
					continue GAME;
				} else { // what was this command?
					System.out.println("\tInvalid command!");
				}
			}

			if (health < 1) { // you died
				System.out.println("You limp out of the dungeon, weak from battle...");
				break;
			} else { // you defeated the enemy
				System.out.println("----------------------------------------------------");
				System.out.println(" # " + enemy + " was defeated! # ");
				System.out.println(" # You have " + health + " HP left. # ");
				if (rand.nextInt(100) < healthPotionDropChance) { // drop health potion chance
					numHealthPotions++;
					System.out.println(" # The " + enemy + " dropped a health potion! # ");
					System.out.println(" # You now have " + numHealthPotions + " health potion(s). # ");
				}
				System.out.println("----------------------------------------------------");
				System.out.println("What would you like to do now?");
				System.out.println("1. Continue fighting!");
				System.out.println("2. Exit dungeon.");

				String input = in.nextLine();

				while (!input.equals("1") && !input.equals("2")) {
					System.out.println("Invalid command!");
					input = in.nextLine();
				}

				if (input.equals("1")) {
					System.out.println("You continue on your adventure!");
				} else if (input.equals("2")) {
					System.out.println("You exit the dungeon, sucessful from your adventures!");
					break;
				}
			}

		}

		// you died or you choose to leave the cave
		System.out.println("#######################");
		System.out.println("# THANKS FOR PLAYING! #");
		System.out.println("#######################");

	}

}
