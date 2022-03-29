package adventuregame;

import java.util.Scanner;

public class NewGame {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean running = true;
		Hero hero = new Hero();
		Game game = new Game();
		game.greetings();

		GAME: while (running) {
			game.sendEnemy();
			running = false;
		}
	}

}
