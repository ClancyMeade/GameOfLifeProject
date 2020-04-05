import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Introduction
	{
		static Scanner userInput = new Scanner(System.in);

		public static void greetPlayers()
			{
				System.out.println(
						"Hello, welcome to the Game Of Life. How many players will be playing today? \n(2)\n(3)\n(4)");
				String numberOfPlayers = userInput.next();

				if (numberOfPlayers.contentEquals("2"))
					{
						System.out.println("Great!\nPlayer 1, what is your name?");
						String playerOneName = userInput.next();
						System.out.println("Hello " + playerOneName);
						ArrayList<LifeTile> playerOneLifeTiles = new ArrayList<LifeTile>();
						ArrayList<Card> playerOneCards = new ArrayList<Card>();
						Runner.players.add(new Player(playerOneName, 10000, 0, 0, playerOneLifeTiles, playerOneCards));
						System.out.println();

						System.out.println("Player 2, what is your name?");
						String playerTwoName = userInput.next();
						System.out.println("Hello " + playerTwoName);
						ArrayList<LifeTile> playerTwoLifeTiles = new ArrayList<LifeTile>();
						ArrayList<Card> playerTwoCards = new ArrayList<Card>();
						Runner.players.add(new Player(playerOneName, 10000, 0, 0, playerTwoLifeTiles, playerTwoCards));
						System.out.println();
						System.out.println(); 

						System.out.println("Okay, it's time to play...");

					}

			}

	}
