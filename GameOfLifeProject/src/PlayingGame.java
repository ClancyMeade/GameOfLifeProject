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
			 
			
			

			Runner.screen.updateMessage(Runner.players.get(currentPlayer).getName() + ", press enter to spin for your turn...");
			int currentPlayerSpin = Spinner.spinSpinner(); 
			userInput.nextLine(); 
			Runner.screen.updateMessage(Runner.players.get(currentPlayer).getName() + ", you spun a total of " + currentPlayerSpin + ".");
			int currentPlace = Runner.players.get(currentPlayer).getPlaceOnBoard();
			Runner.players.get(currentPlayer).moveForward(currentPlayerSpin);
			//you landed on: get place on board 
			//call land on space method and execute what happens when you land on that type of space
			
			
		

			
			
			
		}
	}

}
