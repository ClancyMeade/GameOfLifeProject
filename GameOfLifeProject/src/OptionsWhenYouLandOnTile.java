import java.util.Scanner; 

public class OptionsWhenYouLandOnTile 
{
	static Scanner userInputString = new Scanner(System.in); 
	static int place = Runner.players.get(PlayingGame.currentPlayer).getPlaceOnBoard(); 
	//still have to create board and add places, player place on board is just zero right now 
	
	
	public static void landOnTile()
	{ 
		if(Runner.board.get(place).getType().equals("MoneyTile"))
		{
			 
		}
		
		else if(Runner.board.get(place).getType().equals("BlueTile"))
		{ 
			//still have to create other tiles that extend from tile 
			
		}
	}
	
	
	public static void landOnMoneyTile()
	{ 
		
	}
	
	public static void landOnBlueTile()
	{ 
		
	}
}
