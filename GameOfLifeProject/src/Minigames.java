import java.util.Scanner;

public class Minigames
	{

		public static void main(String[] args)
			{
				// Minigames.guessTheNumber();
//Minigames.math();
				Minigames.randomChooser();
			}

		public static void randomChooser()
			{
				int miniChooser = (int) ((Math.random() * 8) + 1);
				System.out.println("The minigame you will be playing is... Number" + " " + miniChooser);
				if (miniChooser == 1)
					{
						Minigames.guessTheNumber();
					}
				if (miniChooser == 2)
					{
						Minigames.math();
					}
				if (miniChooser == 3)
					{
						Minigames.trivia();
					}
				if (miniChooser == 4)
					{
						Minigames.trivia2();
					}
				if (miniChooser == 5)
					{
						Minigames.riddle();
					}
				if (miniChooser == 6)
					{
						Minigames.javaQuestion();
					}
				if (miniChooser == 7)
					{
						Minigames.music();
					}
				if (miniChooser == 8)
					{
						Minigames.sports();
					}
			}

		public static void guessTheNumber()
			{
				int guess = (int) ((Math.random() * 10) + 1);
				System.out.println(
						"Hello good sir! This minigame is all about guessing. Can you guess the random number? It is in-between 1-10");
				Scanner answer = new Scanner(System.in);
				System.out.println("Guess the number. Good luck!");
				int rando = answer.nextInt();
				if (rando != guess)
					{
						System.out.println("Oh No! You missed it!");

					} else
					{
						System.out.println("Wow! Beginners luck?");
						Runner.players.get(PlayingGame.currentPlayer).addMoney(100000);
					}
				// test

			}

		public static void math()
			{
				System.out.println("This minigame is all about math! Let's see how good you are at it");
				System.out.println("What is 1003*137");
				Scanner mathAnswer = new Scanner(System.in);
				System.out.println("Put your answer below");
				int correct = mathAnswer.nextInt();
				if (correct != 137411)
					{
						System.out.println("Uh oh! That is incorrect! You lose money...");

					} else
					{
						System.out.println("Holy Cow! You are good at math! You win 50K");
						Runner.players.get(PlayingGame.currentPlayer).addMoney(50000);
					}

			}

		public static void riddle()
			{
				System.out.println("This minigame is all about riddles! Can you answer it correctly?");
				System.out.println("Alright! Let's go...");
				Scanner riddler = new Scanner(System.in);
				System.out.println(
						"There's a one-story house where everything is yellow. The walls are yellow. The doors are yellow. \nEven the furniture is yellow. What color are the stairs?");
				String answer = riddler.nextLine();
				if (answer == "There are no stairs")
					{
						System.out.println("Wow! This must have been some easy money");
						Runner.players.get(PlayingGame.currentPlayer).addMoney(30000);
					} else
					{
						System.out.println("Unlucky! Maybe read the first sentence again...");
					}

			}

		public static void trivia()
			{
				System.out.println("This is all about really random trivia. Do you know your weird facts?");
				Scanner farts = new Scanner(System.in);
				System.out.println("What did Emperor Claudius legalize at banquets?");
				String answer = farts.nextLine();
				if (answer == "farts")
					{
						System.out.println("WHAT! How did you know that??");
						Runner.players.get(PlayingGame.currentPlayer).addMoney(75000);
					} else
					{
						System.out.println("Oh no, don't be sad! This question was really hard...");
					}
			}

		public static void trivia2()
			{
				System.out.println("This is a trivia minigame!");
				Scanner decath = new Scanner(System.in);
				System.out.println("When was the first IPhone released?");
				String answer = decath.nextLine();
				if (answer == "2007")
					{
						System.out.println("Good job tech wiz! You know your dates");
						Runner.players.get(PlayingGame.currentPlayer).addMoney(20000);
					} else
					{
						System.out.println("Darn, but good try though!");
					}

			}

		public static void javaQuestion()
			{
				System.out.println("Hey, what do ya know? A question about java! This should be easy money...");
				Scanner os = new Scanner(System.in);
				System.out.println("Is Java a type of OS?");
				String jav = os.nextLine();
				if (jav == "no")
					{
						System.out.println("See! I said it would be easy money!");
						Runner.players.get(PlayingGame.currentPlayer).addMoney(20000);
					} else
					{
						System.out.println("Well I guess someone needs to read up on java history...");

					}

			}

		public static void sports()
			{
				System.out.println("Let's see how well you know sports, specifically soccer");
				Scanner cup = new Scanner(System.in);
				System.out.println("Which team was the first to win the World Cup in 1930?");
				String uru = cup.nextLine();
				if (uru == "Uruguay")
					{
						System.out.println("Great! You really know your stuff!");
						Runner.players.get(PlayingGame.currentPlayer).addMoney(50000);
					} else
					{
						System.out.println("Darn, soccer is a great sport and it is the most played...");
					}
			}

		public static void music()
			{
				System.out.println("I want to rock! Let's see how well you know it!");
				Scanner led = new Scanner(System.in);
				System.out.println("What was the name of the rock band formed by Jimmy Page");
				String jim = led.nextLine();
				if (jim == "Led Zeppelin")
					{
						System.out.println("I head bang to that bro!");
						Runner.players.get(PlayingGame.currentPlayer).addMoney(50000);
					} else
					{
						System.out.println("Darn, you need to listen to some music!");
					}

			}

	}
