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
		
	}
	
	public static void landOnLifeTile()
	{ 
		
	}
	
	public static void landOnNotOptionalTile()
	{ 
		
	}
	
	public static void landOnOptionalTile()
	{ 
		
	}
	
	public static void landOnGetMarriedTile() 
	{ 
		
	}
	
	public static void landOnHouseDeedTile()
	{ 
		
	}
	
	public static void landOnMoneyTile()
	{ 
		
	}
}
