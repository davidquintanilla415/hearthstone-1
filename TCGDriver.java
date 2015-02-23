import java.util.Scanner;


public class TCGDriver {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String userInput = new String();
		
		Battlefield bf1 = new Battlefield();
		bf1.gameInitialize();
		
		while(true) {
			System.out.println("Enter Action: "); // print a prompt
			userInput = keyboard.nextLine(); // read in user's response, store in userInput
			
			if (userInput.equals("exit")) { // see if user typed "exit" using .equals => userInput.equals("exit");
				keyboard.close(); // close keyboard resource before exiting
				System.exit(0); // exit
			}
			// create a new credit card, give it the userInput String
			//Battlefield bf1 = new Battlefield(userInput);
			System.out.println(bf1);			
		}
	} 
	
}
