package adventuregame;

import java.util.Random;

public class Tools {

	private Random randomNumber;

	public Random getRandomNumber() {
		return randomNumber;
	}

	public void setRandomNumber(int maxNumber) {
		this.randomNumber = new Random();
		randomNumber.nextInt(maxNumber);
	}

	
}
