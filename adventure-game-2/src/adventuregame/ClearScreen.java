package adventuregame;

public class ClearScreen {
	public void clearScreen() {
		System.out.print("\033[H\033[2J");
	}
}
