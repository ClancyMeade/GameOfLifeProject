import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Introduction
	{
		static Scanner userInput = new Scanner(System.in);
		static Scanner intInput = new Scanner(System.in);
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

				
				String[] s1 = {"Hello, welcome to the Game Of Life. How many players will be playing today?", "", "(2)", "(3)", "(4)"};
				Runner.screen.updateMessage(s1);
				String numberOfPlayers = userInput.next();


				if (numberOfPlayers.contentEquals("2"))
					{
						
						String[] s2 = {"Great!", "Player 1, what is your name?"};
						Runner.screen.updateMessage(s2);
						playerOneName = userInput.next();
						Runner.screen.updateMessage("Hello " + playerOneName);

						Runner.players.add(new Player(playerOneName, playerOneJobChoice, 10000, 0, 0,
								playerOneLifeTiles, playerOneCards));
						

						Runner.screen.updateMessage("Player 2, what is your name?");
						playerTwoName = userInput.next();
						Runner.screen.updateMessage("Hello " + playerTwoName);

						Runner.players.add(new Player(playerTwoName, playerTwoJobChoice, 10000, 0, 0,
								playerTwoLifeTiles, playerTwoCards));

						Runner.screen.updateBoard();
						

						Runner.screen.updateMessage("Okay, it's time to play...");

						Runner.screen.updateMessage("The player with the most money at the end of the game wins");
						Runner.screen.updateMessage("Both players start with $10,000");

						


						String[] s3 = {"To begin the game, " + playerOneName + ", would you like to...", "(1) Start your career", "(2) Go to college"};
						Runner.screen.updateMessage(s3);
						
					
						int playerOneChoice = intInput.nextInt();


						if (playerOneChoice == 1)
							{
							
								String[] s4 = {"You have chosen to start your career!", "Your board position will be set at 10"};
								Runner.screen.updateMessage(s4);
								Runner.players.get(0).setPlaceOnBoard(10);
								
								
								

								String[] s5 = {"Now pick a job you will like to have to start your career...", "None of these jobs require a degree",  "Your choices are:","(1) Artist", "(2) Salesperson" , "(3) Athlete", "(4) Accountant", "(5) Entertainer", "(6) Police Officer", "", "Please type in the number of the job you would like"};
								Runner.screen.updateMessage(s5);
								
								String jobChoice = userInput.next();
								playerOneJobChoice = jobChoice;

								switch (playerOneJobChoice)
									{
									case "1":
										{
											String[] s6 = {"You have chosen to become an Artist!", "Your starting salary will be: $50,000"};
											Runner.screen.updateMessage(s6);
											Runner.players.get(0).setJobTitle("Artist");
											break;
										}
									case "2":
										{
											String[] s7 = {"You have chosen to become an Salesperson!", "Your starting salary will be: $70,000"};
											Runner.screen.updateMessage(s7);
											
											Runner.players.get(0).setJobTitle("Salesperson");

										
											break;

										}
									case "3":
										{
											
											String[] s8 = {"You have chosen to become an Athlete!", "Your starting salary will be: $100,000"};
											Runner.screen.updateMessage(s8);
											
											
											Runner.players.get(0).setJobTitle("Athlete");

											
											break;
										}
									case "4":
										{
											
											String[] s9 = {"You have chosen to become an Accountant!", "Your starting salary will be: $90,000"};
											Runner.screen.updateMessage(s9);
											
											Runner.players.get(0).setJobTitle("Accountant");

											
											break;

										}
									case "5":
										{
											
											String[] s10 = {"You have chosen to become an Entertainer!", "Your starting salary will be: $80,000"};
											Runner.screen.updateMessage(s10);
											
											Runner.players.get(0).setJobTitle("Entertainer");

											
											break;

										}
									case "6":
										{
											
											String[] s11 = {"You have chosen to become an Police Officer!", "Your starting salary will be: $70,000"};
											Runner.screen.updateMessage(s11);
											
											
											Runner.players.get(0).setJobTitle("Police Officer");

											break;

										}
									}

							} else if (playerOneChoice == 2)
							{
								Runner.screen.updateMessage("You have chosen to go to college!");

							}


						String[] s12 = {"Now, " + playerTwoName + ", would you like to...", "(1) Start your career", "(2) Go to college"};
						Runner.screen.updateMessage(s12);
						
						int playerTwoChoice = userInput.nextInt();
						
						
						if (playerTwoChoice == 1)
							{
							String[] s13 = {"You have chosen to start your career!", "Your board position will be set at 10"};
							Runner.screen.updateMessage(s13);
							Runner.players.get(1).setPlaceOnBoard(10);
							
							
							

							String[] s5 = {"Now pick a job you will like to have to start your career...", "None of these jobs require a degree",  "Your choices are:","(1) Artist", "(2) Salesperson" , "(3) Athlete", "(4) Accountant", "(5) Entertainer", "(6) Police Officer", "", "Please type in the number of the job you would like"};
							Runner.screen.updateMessage(s5);
							
							String jobChoice2 = userInput.next();
							playerTwoJobChoice = jobChoice2;

							switch (playerTwoJobChoice)
								{
								case "1":

									{
										String[] s6 = {"You have chosen to become an Artist!", "Your starting salary will be: $50,000"};
										Runner.screen.updateMessage(s6);
										Runner.players.get(1).setJobTitle("Artist");
										break;
									}
								case "2":
									{
										String[] s7 = {"You have chosen to become an Salesperson!", "Your starting salary will be: $70,000"};
										Runner.screen.updateMessage(s7);
										
										Runner.players.get(1).setJobTitle("Salesperson");

									
										break;

									}
								case "3":
									{
										
										String[] s8 = {"You have chosen to become an Athlete!", "Your starting salary will be: $100,000"};
										Runner.screen.updateMessage(s8);
										
										
										Runner.players.get(1).setJobTitle("Athlete");

										
										break;
									}
								case "4":
									{
										
										String[] s9 = {"You have chosen to become an Accountant!", "Your starting salary will be: $90,000"};
										Runner.screen.updateMessage(s9);
										
										Runner.players.get(1).setJobTitle("Accountant");

										
										break;

									}
								case "5":
									{
										
										String[] s10 = {"You have chosen to become an Entertainer!", "Your starting salary will be: $80,000"};
										Runner.screen.updateMessage(s10);
										
										Runner.players.get(1).setJobTitle("Entertainer");

										
										break;

									}
								case "6":
									{
										
										String[] s11 = {"You have chosen to become an Police Officer!", "Your starting salary will be: $70,000"};
										Runner.screen.updateMessage(s11);
										
										
										Runner.players.get(1).setJobTitle("Police Officer");

										break;

									}
								}

						} else if (playerTwoChoice == 2)
						{
							Runner.screen.updateMessage("You have chosen to go to college!");

						}
					}

			}

		public static void playGame()
			{
				while (stillPlaying)
					{
						Runner.screen.updateMessage(playerOneName + ", press enter to spin for your turn!");
						String playerOneSpin = userInput.nextLine();
						int spin = Spinner.spinSpinner();
						Runner.screen.updateMessage("You spun for a total of " + spin);
						
						Runner.players.get(0).setPlaceOnBoard(Runner.players.get(0).getPlaceOnBoard() + spin);

						if (Runner.players.get(0).getTotalMoney() >= 500000
								|| Runner.players.get(1).getTotalMoney() >= 500000)
							{
							Runner.screen.updateMessage(
										"You win the game of life! Now you can retire and live a happy, rich life");
								stillPlaying = false;
							}

						if (Runner.players.get(0).getPlaceOnBoard() % 2 == 0)
							{

								Runner.screen.updateMessage("You landed on a Money Tile! Now you will get paid for your job");
								Runner.players.get(0).setTotalMoney(Runner.players.get(0).getTotalMoney() + 50000);


							}

					}

			}

		// test

	}
