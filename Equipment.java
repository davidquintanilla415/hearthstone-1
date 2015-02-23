
public class Equipment extends Card{

	/////////////// Variables ///////////////
	
	private int attack;		// attack value
	private int durability;	// durability value
	
	/////////////// Constructors ///////////////
	
	public Equipment() {
		super();
		attack = 0;
		durability = 0;
	} // zero arg constructor
	
	public Equipment(String cName, int cManaCost, int cAttack, int cDurability) {
		super(cName, cManaCost);
		attack = cAttack;
		durability = cDurability;
	} // 4 arg constructor
	
	/////////////// toString ///////////////
	
	public String toString() {
		// (String name, int manaCost, int attack, int durability)
		return super.toString() + "\nAttack: " + attack + "\nDurability: " + durability;
	} // toString
	
	//////////////////// main ////////////////////
	
	public static void main(String[] args) {
		// (String name, int manaCost, int attack, int durability)
		Equipment excalibur = new Equipment("Excalibur", 2, 2, 1);
		System.out.println(excalibur);
	} // main

} // class
