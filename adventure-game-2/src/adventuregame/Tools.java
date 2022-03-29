package adventuregame;

import java.util.Random;

public class Tools {

	private Random randomNumber;

	public Random getRandomNumber() {
		return randomNumber;
	}

	public int getRandomNumber(int maxNumber) {
		this.randomNumber = new Random();
		return this.randomNumber.nextInt(maxNumber);
	}

	
}
