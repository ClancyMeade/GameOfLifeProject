import java.util.ArrayList;
import java.util.List;

public class Runner
	{

		static ArrayList<Player> players = new ArrayList<Player>();	
		static ArrayList<Tile> board = new ArrayList<Tile>(); 
		
		public static void main(String[] args)
			{
				Introduction.greetPlayers();
				PlayingGame.play();

			}

	}
