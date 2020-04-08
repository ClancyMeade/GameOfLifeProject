import java.util.ArrayList;
import java.util.List;

public class Runner
	{

		static ArrayList<Player> players = new ArrayList<Player>();	
		static ArrayList<Tile> board = new ArrayList<Tile>(); 
		
		public static void main(String[] args)
			{
			
				Introduction.greetPlayers();
				// Screen screen = new Screen (35, 140, 10, 10, 23, 45, 10, 10, 10, "Welcome To The Game Of life.", false);
				PlayingGame.play();

			}

	}
