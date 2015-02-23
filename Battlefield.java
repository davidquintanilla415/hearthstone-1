import java.util.Random;

public class Battlefield {
	
	/////////////// Variables ///////////////
	
	public boolean playerOneTurn;		// whether or not it's player 1's turn
	public boolean playerTwoTurn;		// whether or not it's player 2's turn
	public boolean myTurn;				// whether or not it's my turn from the player's perspective
	Hero druid;
	
	/////////////// Constructors ///////////////
	
	public Battlefield() {
		playerOneTurn = true;
		playerTwoTurn = false;
		myTurn = false;
	} // zero arg constructor
	
	public Battlefield(String userInput) {
		if (userInput == "end turn") {
			endTurn();
		}
	}
	
	/////////////// Accessors ///////////////
	
	public boolean getMyTurn() {
		return myTurn;
	} // getMyTurn
	
	/////////////// Methods ///////////////
	
	public void gameInitialize() {
		String coin = "";
		Random generator = new Random();
		int randomIndex = generator.nextInt(2);
		//System.out.println(randomIndex);
		switch(randomIndex) {
			case 0:	coin = "P1";
					break;
			case 1: coin = "P2";
					break;
		}
		//System.out.println(result);
		if (coin == "P1") {	// coin flip
			playerOneTurn = true;
			playerTwoTurn = false;
		} else {
			playerOneTurn = false;
			playerTwoTurn = true;
		}
	}

	public void endTurn() {
		if (playerOneTurn) {	// switch whose turn it is
			playerOneTurn = false;
			playerTwoTurn = true;
		} else {
			playerOneTurn = true;
			playerTwoTurn = false;
		} // else
		if (myTurn) {	// if it's my turn then make it the opponents turn, else it is not my turn and make it my turn
			hasShapeshifted();
			myTurn = false;
		} else {
			myTurn = true;
		}
	} // endTurn()
	
	public void hasShapeshifted() {	// call in endTurn(), druid's hero power
		if (druid.getShapeshift()) {
			int druidAttack = druid.getAttack();
			druidAttack--;
			druid.setAttack(druidAttack);
		} // if
		druid.setShapeshift(false);
	} // hasShapeshifted()
	
	/////////////// toString ///////////////
	
	public String toString() {
		String info = "Player 1 Turn: " + playerOneTurn + "\nPlayer 2 Turn: " + playerTwoTurn + "\nMy Turn: " + myTurn + "\nHero: " + druid + "\n";
		return info;
	}
	
	//////////////////// main ////////////////////
	
	public static void main(String[] args) {
		Battlefield battlefield1 = new Battlefield();
		System.out.println(battlefield1);
		
		
		
	} // main
	
} // class
