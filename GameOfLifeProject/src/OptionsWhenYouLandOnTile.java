import java.util.Scanner; 

public class OptionsWhenYouLandOnTile 
{
	static Scanner userInputString = new Scanner(System.in); 
	static int place = Runner.players.get(PlayingGame.currentPlayer).getPlaceOnBoard(); 
	//still have to create board and add places, player place on board is just zero right now 
	
	
	public static void landOnTile()
	{ 
		if(Runner.board.get(place).getType().equals("MiniGameTile"))
		{
			 landOnMiniGameTile(); 
		}
		
		else if(Runner.board.get(place).getType().equals("LifeTile"))
		{ 
			landOnLifeTile(); 
		}
		
		else if(Runner.board.get(place).getType().equals("NotOptionalTile"))
		{ 
			landOnNotOptionalTile(); 
		}
		
		else if(Runner.board.get(place).getType().equals("OptionalTile"))
		{ 
			landOnOptionalTile(); 
		}
		
		else if(Runner.board.get(place).getType().equals("GetMarriedTile"))
		{ 
			landOnGetMarriedTile(); 
		}
		
		else if(Runner.board.get(place).getType().equals("HouseDeedTile"))
		{ 
			landOnHouseDeedTile(); 
			
		}
		
		else if(Runner.board.get(place).getType().equals("MoneyTile"))
		{ 
			landOnMoneyTile(); 
		}
	}
	
	
	public static void landOnMiniGameTile()
	{ 
		Minigames.randomChooser();
	}
	
	public static void landOnLifeTile()
	{ 
		Runner.screen.updateMessage("You landed on a Life Tile! You get 1 life card.");
	}
	
	public static void landOnNotOptionalTile()
	{ 
		Runner.screen.updateMessage("You landed on an Not Optional Tile!");
	}
	
	public static void landOnOptionalTile()
	{ 
		Runner.screen.updateMessage("You landed on an Optional Tile!");
	}
	
	public static void landOnGetMarriedTile() 
	{ 
		Runner.screen.updateMessage("You landed on the Get Married Tile! Time to get Married!");
		
	}
	
	public static void landOnHouseDeedTile()
	{ 
		Runner.screen.updateMessage("You landed on the House Tile! You get to buy a house, now drawing a card...");
		
	}
	
	public static void landOnMoneyTile()
	{ 
		Runner.screen.updateMessage("You landed on a Pay Day Tile! Time to get paid!");
	}
}
