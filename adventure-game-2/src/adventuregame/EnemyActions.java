package adventuregame;

public abstract interface EnemyActions {
	// ###### name ######
	public abstract String getEnemyType();

	public abstract String getName();

	public abstract void setName();

	// ###### health ######
	public abstract int getMaxHealth();

	public abstract void setMaxHealth();

	// ###### attack ######
	public abstract void attack(Char target);

	// ###### healthPotion ######
	// ###### gameOptions ######

}
