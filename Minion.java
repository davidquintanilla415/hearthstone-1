
public class Minion extends Card{

	/////////////// Variables ///////////////
	
	private String type;	// minion type
	private int attack;		// attack value
	private int health;		// health value
	
	/////////////// Constructors ///////////////
	
	public Minion() {
		super();
		type = "";
		attack = 0;
		health = 0;
	} // zero arg constructor
	
	public Minion(String cName, int cManaCost, String cType, int cAttack, int cHealth) {
		super(cName,cManaCost);
		type = cType;
		attack = cAttack;
		health = cHealth;
	} // 5 arg constructor
	
	/////////////// toString ///////////////
	
	public String toString() {
		// (String name, int manaCost, String type, int attack, int health)
		return super.toString() + "\nAttack: " + attack + "\nHealth: " + health + "\nType: " + type;
	} // toString
	
	//////////////////// main ////////////////////
	
	public static void main(String[] args) {
		// (String name, int manaCost, String type, int attack, int health)
		Minion slinger = new Minion("Slinger", 2, "Kobald", 2, 1);
		System.out.println(slinger);
	} // main
	
} // class
