
public class SwitchPlayers 
{

	public static void switchCurrentPlayer()
	{ 
		if(PlayingGame.currentPlayer == 0)
		{
			PlayingGame.currentPlayer = 1;
			PlayingGame.notCurrentPlayer = 0;
		}
		
		else
		{
			
			PlayingGame.currentPlayer = 0;
			PlayingGame.notCurrentPlayer = 1;
		
		}
	}
}
