
public class Hero {

	/////////////// Variables ///////////////
	
	private String name;		// name of card
	private String heroPower;	// hero power
	private int health;			// health value
	private int attack;			// attack value
	private int armor;			// armor value
	private boolean shapeshift;	// state whether or not a shapeshift has occurred
	Battlefield bf1;			// refer to Battlefield class
	
	/////////////// Constructors ///////////////
	
	public Hero() {
		name = "";
		heroPower = "";
		health = 0;
		attack = 0;
		armor = 0;
	} // zero arg constructor
	
	public Hero(String cName, String cHeroPower, int cHealth, int cAttack, int cArmor) {
		name = cName;
		heroPower = cHeroPower;
		health = cHealth;
		attack = cAttack;
		armor = cArmor;
	} // 5 arg constructor
	
	/////////////// Accessors ///////////////
	
	public int getAttack() {
		return attack;
	} // getAttack()
	
	public boolean getShapeshift() {
		return shapeshift;
	} // getShapeshift()
	
	/////////////// Mutators //////////////
	
	public void setAttack(int newAttack) {
		attack = newAttack;
	} // setAttack()
	
	public void setShapeshift(boolean newShapeshift) {
		shapeshift = newShapeshift;
	} // setShapeshift()
	
	/////////////// Methods ///////////////
	
	public void shapeshift() {
		armor = armor + 1;
		attack = attack + 1;
		shapeshift = true;
	} // shapeshift()
	
	/////////////// toString ///////////////
	
	public String toString() {
		String properties = "Name: " + name + " Hero Power: " + heroPower + " Health: " + health + " Attack: " + attack + " Armor: " + armor;
		return properties;
	} // toString
	
	//////////////////// main ////////////////////
	
	public static void main(String[] args) {
		Hero druid = new Hero("Druid", "Shapeshift", 30, 0, 0);
		System.out.println(druid);
		druid.shapeshift();
		System.out.println(druid);
	} // main

} // class
