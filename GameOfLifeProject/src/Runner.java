import java.util.ArrayList;
import java.util.List;

public class Runner
	{

		static ArrayList<Player> players = new ArrayList<Player>();	
		static ArrayList<Tile> board = new ArrayList<Tile>(); 
		static Screen screen = new Screen (35, 140, 10, 10, 23, 45, 10, 10, 10, "THE GAME OF LIFE", "Welcome To The Game Of Life.", true);
		public static void main(String[] args)
			{
			

				ReadTileData.fillBoard();
				//Screen screen = new Screen (35, 140, 10, 10, 23, 45, 10, 10, 10, "Welcome To The Game Of Life.", true);
				Introduction.greetPlayers();
				PlayingGame.play();


			}

	}
