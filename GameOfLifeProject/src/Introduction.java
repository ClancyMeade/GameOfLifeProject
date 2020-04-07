import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Introduction
	{
		static Scanner userInput = new Scanner(System.in);
		static String playerOneName;
		static String playerTwoName;
		static ArrayList<LifeTile> playerOneLifeTiles = new ArrayList<LifeTile>();
		static ArrayList<Card> playerOneCards = new ArrayList<Card>();
		static ArrayList<LifeTile> playerTwoLifeTiles = new ArrayList<LifeTile>();
		static ArrayList<Card> playerTwoCards = new ArrayList<Card>();
		static boolean stillPlaying = true;
		static String playerOneJobChoice;
		static String playerTwoJobChoice;

		public static void greetPlayers()
			{
				System.out.println(
						"Hello, welcome to the Game Of Life. How many players will be playing today? \n(2)\n(3)\n(4)");
				String numberOfPlayers = userInput.next();

				if (numberOfPlayers.contentEquals("2"))
					{
						System.out.println("Great!\nPlayer 1, what is your name?");
						playerOneName = userInput.next();
						System.out.println("Hello " + playerOneName);

						Runner.players.add(new Player(playerOneName, playerOneJobChoice, 10000, 0, 0,
								playerOneLifeTiles, playerOneCards));
						System.out.println();

						System.out.println("Player 2, what is your name?");
						playerTwoName = userInput.next();
						System.out.println("Hello " + playerTwoName);

						Runner.players.add(new Player(playerTwoName, playerTwoJobChoice, 10000, 0, 0,
								playerTwoLifeTiles, playerTwoCards));
						System.out.println();
						System.out.println();

						System.out.println("Okay, it's time to play...");

						System.out.println("The player with the most money at the end of the game wins");
						System.out.println("Both players start with $10,000");

						System.out.println("To begin the game, " + playerOneName + ", would you like to...");

						System.out.println("(1) Start your career");
						System.out.println("(2) Go to college");

						int playerOneChoice = userInput.nextInt();

						if (playerOneChoice == 1)
							{
								System.out.println("You have chosen to start your career!");
								System.out.println("Your board position will be set at 10");
								Runner.players.get(0).setPlaceOnBoard(10);
								System.out.println("Now pick a job you will like to have to start your career...");
								System.out.println("None of these jobs require a degree");
								System.out.println("Your choices are:");
								System.out.println("(1) Artist");
								System.out.println("(2) Salesperson");
								System.out.println("(3) Athlete");
								System.out.println("(4) Accountant");
								System.out.println("(5) Entertainer");
								System.out.println("(6) Police Officer");

								System.out.println("Please type in the name of the job you would like");

								playerOneJobChoice = userInput.nextLine();

								switch (playerOneJobChoice)
									{
									case "Artist":
										{
											System.out.println("You have chosen to become an Artist!");
											Runner.players.get(0).setJobTitle("Artist");
											System.out.println("Your starting salary will be: $50,000");
											break;
										}
									case "Salesperson":
										{
											System.out.println("You have chosen to become a Salesperson!");
											Runner.players.get(0).setJobTitle("Salesperson");

											System.out.println("Your starting salary will be: $70,000");
											break;

										}
									case "Athlete":
										{
											System.out.println("You have chosen to become an Athlete!");
											Runner.players.get(0).setJobTitle("Athlete");

											System.out.println("Your starting salary will be: $100,000");
											break;
										}
									case "Accountant":
										{
											System.out.println("You have chosen to become an Accountant!");
											Runner.players.get(0).setJobTitle("Accountant");

											System.out.println("Your starting salary will be: $90,000");
											break;

										}
									case "Entertainer":
										{
											System.out.println("You have chosen to become an Entertainer!");
											Runner.players.get(0).setJobTitle("Entertainer");

											System.out.println("Your starting salary will be: $80,000");
											break;

										}
									case "Police Officer":
										{
											System.out.println("You have chosen to become a Police Officer!");
											Runner.players.get(0).setJobTitle("Police Officer");

											System.out.println("Your starting salary will be: $70,000");
											break;

										}
									}

							} else if (playerOneChoice == 2)
							{
								System.out.println("You have chosen to go to college!");

							}

						System.out.println("Now, " + playerTwoName + ", would you like to...");
						System.out.println("(1) Start your career");
						System.out.println("(2) Go to college");
						int playerTwoChoice = userInput.nextInt();
						if (playerTwoChoice == 1)
							{
								System.out.println("You have chosen to start your career!");
								System.out.println("Your board position will be set at 10");
								Runner.players.get(1).setPlaceOnBoard(10);
								System.out.println("Now pick a job you will like to have to start your career...");
								System.out.println("None of these jobs require a degree");
								System.out.println("Your choices are:");
								System.out.println("(1) Artist");
								System.out.println("(2) Salesperson");
								System.out.println("(3) Athlete");
								System.out.println("(4) Accountant");
								System.out.println("(5) Entertainer");
								System.out.println("(6) Police Officer");

								playerTwoJobChoice = userInput.nextLine();

								switch (playerTwoJobChoice)
									{
									case "Artist":
										{
											System.out.println("You have chosen to become an Artist!");
											Runner.players.get(1).setJobTitle("Artist");

											System.out.println("Your starting salary will be: $50,000");
											break;
										}
									case "Salesperson":
										{
											System.out.println("You have chosen to become a Salesperson!");
											Runner.players.get(1).setJobTitle("Salesperson");

											System.out.println("Your starting salary will be: $70,000");
											break;

										}
									case "Athlete":
										{
											System.out.println("You have chosen to become an Athlete!");
											Runner.players.get(1).setJobTitle("Athlete");

											System.out.println("Your starting salary will be: $100,000");
											break;
										}
									case "Accountant":
										{
											System.out.println("You have chosen to become an Accountant!");
											Runner.players.get(1).setJobTitle("Accountant");

											System.out.println("Your starting salary will be: $90,000");
											break;

										}
									case "Entertainer":
										{
											System.out.println("You have chosen to become an Entertainer!");
											Runner.players.get(1).setJobTitle("Entertainer");

											System.out.println("Your starting salary will be: $80,000");
											break;

										}
									case "Police Officer":
										{
											System.out.println("You have chosen to become a Police Officer!");
											Runner.players.get(1).setJobTitle("Police Officer");

											System.out.println("Your starting salary will be: $70,000");
											break;

										}
									}

							} else if (playerTwoChoice == 2)
							{
								System.out.println("You have chosen to go to college!");

							}
					}

			}

		public static void playGame()
			{
				while (stillPlaying)
					{
						System.out.println(playerOneName + ", press enter to spin for your turn!");
						String playerOneSpin = userInput.nextLine();
						System.out.println("You spun for a total of " + Spinner.spinSpinner());
						Runner.players.get(0)
								.setPlaceOnBoard(Runner.players.get(0).getPlaceOnBoard() + Spinner.spinSpinner());

						if (Runner.players.get(0).getTotalMoney() == 500000
								|| Runner.players.get(0).getTotalMoney() == 500000)
							{
								System.out.println(
										"You win the game of life! Now you can retire and live a happy, rich life");
								stillPlaying = false;
							}

						if (Runner.players.get(0).getPlaceOnBoard() % 2 == 0)
							{
								System.out.println("You landed on a Money Tile! Now you will get paid for your job");

							}

					}

			}

		// test

	}
