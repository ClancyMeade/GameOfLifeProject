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

						System.out.println("To begin the game, " + playerOneName + ", would you like to...");

						System.out.println("(1) Start your career");
						System.out.println("(2) Go to college");

						int playerOneChoice = userInput.nextInt();

						if (playerOneChoice == 1)
							{
								System.out.println("You have chosen to start your career!");
								System.out.println("Now pick a job you will like to have to start your career...");
								System.out.println("None of these jobs require a degree");
								System.out.println("Your choices are:");
								System.out.println("(1) Artist");
								System.out.println("(2) Salesperson");
								System.out.println("(3) Athlete");
								System.out.println("(4) Accountant");
								System.out.println("(5) Entertainer");
								System.out.println("(6) Police Officer");

								int playerOneJobChoice = userInput.nextInt();

								switch (playerOneJobChoice)
									{
									case 1:
										{
											System.out.println("You have chosen to become an Artist!");
											System.out.println("Your starting salary will be: $50,000");
											break;
										}
									case 2:
										{
											System.out.println("You have chosen to become a Salesperson!");
											System.out.println("Your starting salary will be: $70,000");
											break;

										}
									case 3:
										{
											System.out.println("You have chosen to become an Athlete!");
											System.out.println("Your starting salary will be: $100,000");
											break;
										}
									case 4:
										{
											System.out.println("You have chosen to become an Accountant!");
											System.out.println("Your starting salary will be: $90,000");
											break;

										}
									case 5:
										{
											System.out.println("You have chosen to become an Entertainer!");
											System.out.println("Your starting salary will be: $80,000");
											break;

										}
									case 6:
										{
											System.out.println("You have chosen to become a Police Officer!");
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
								System.out.println(
										"Now pick a job you will like to have to start your career...none of them require a degree");
								System.out.println("Your choices are:");
								System.out.println("(1) Artist");
								System.out.println("(2) Salesperson");
								System.out.println("(3) Athlete");
								System.out.println("(4) Accountant");
								System.out.println("(5) Entertainer");
								System.out.println("(6) Police Officer");

								int playerTwoJobChoice = userInput.nextInt();

								switch (playerTwoJobChoice)
									{
									case 1:
										{
											System.out.println("You have chosen to become an Artist!");
											System.out.println("Your starting salary will be: $50,000");
											break;
										}
									case 2:
										{
											System.out.println("You have chosen to become a Salesperson!");
											System.out.println("Your starting salary will be: $70,000");
											break;

										}
									case 3:
										{
											System.out.println("You have chosen to become an Athlete!");
											System.out.println("Your starting salary will be: $100,000");
											break;
										}
									case 4:
										{
											System.out.println("You have chosen to become an Accountant!");
											System.out.println("Your starting salary will be: $90,000");
											break;

										}
									case 5:
										{
											System.out.println("You have chosen to become an Entertainer!");
											System.out.println("Your starting salary will be: $80,000");
											break;

										}
									case 6:
										{
											System.out.println("You have chosen to become a Police Officer!");
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

		// test

	}
