import java.util.Scanner; 
import java.util.ArrayList; 

public class PlayingGame
{
	static Scanner userInput = new Scanner(System.in); 
	static int currentPlayer = 1; 
	static int notCurrentPlayer = 0; 
	static boolean playing = true; 
	
	
	
	

	public static void play()
	{ 
		while(playing)
		{ 
			
			SwitchPlayers.switchCurrentPlayer();
			
			
			System.out.println(Runner.players.get(currentPlayer).getName() + ", press enter to spin for your turn...");
			int playerOneSpin = Spinner.spinSpinner(); 
			userInput.nextLine(); 
			System.out.println(Runner.players.get(currentPlayer).getName() + ", you spun a total of " + playerOneSpin + ".");
			//you landed on: get place on board 
			//call land on space method and execute what happens when you land on that type of space
			
			System.out.println();
			SwitchPlayers.switchCurrentPlayer(); 
		
			System.out.println(Runner.players.get(currentPlayer).getName() + ", press enter to spin for your turn...");
			int playerTwoSpin = Spinner.spinSpinner(); 
			userInput.nextLine(); 
			System.out.println(Runner.players.get(currentPlayer).getName() + ", you spun a total of " + playerTwoSpin + ".");
			//do same thing, check space type and call methods
			
			
		}
	}

}
