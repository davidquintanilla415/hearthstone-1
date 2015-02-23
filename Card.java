
public class Card {

	/////////////// Variables ///////////////
	
	private String name;		// name of card
	private int manaCost;		// mana cost of card to play
	
	/////////////// Constructors ///////////////
	
	public Card() {
		name = "";
		manaCost = 0;
	} // zero arg constructor
	
	public Card(String cardName, int cardManaCost) {
		this();
		name = cardName;
		manaCost = cardManaCost;
	} // two arg constructor
	
	/////////////// toString ///////////////
	
	public String toString() {
		String properties = "Name: " + name + "\nMana Cost: " + manaCost;
		return properties;
	}
}
