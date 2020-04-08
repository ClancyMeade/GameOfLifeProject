import java.util.Scanner;

public class Minigames {

	public static void main(String[] args) {
		//Minigames.guessTheNumber();
//Minigames.math();
		Minigames.randomChooser();
	}
	public static void randomChooser() {
		int miniChooser=(int) ((Math.random()*8)+1);
		System.out.println("The minigame you will be playing is... Number" + " " +miniChooser);
		if(miniChooser==1) {
			Minigames.guessTheNumber();
		}if(miniChooser==2) {
			Minigames.math();
		}if(miniChooser==3) {
				Minigames.trivia();
		}if(miniChooser==4) {
			Minigames.trivia2();
		}if(miniChooser==5) {
			Minigames.riddle();
		}if(miniChooser==6) {
			Minigames.javaQuestion();
		}if(miniChooser==7) {
			Minigames.music();
		}if(miniChooser==8) {
			Minigames.sports();
		}
	}
	
public static void guessTheNumber() {
	int guess=(int) ((Math.random()*10)+1);
	System.out.println("Hello good sir this minigame is all about guessing. Can you guess the number? it is inbetween 1-10");
	Scanner answer= new Scanner(System.in);
	System.out.println("Guess the number. good luck");
	int rando=answer.nextInt();
	if(rando!=guess) {
		System.out.println("Oh No! you missed it");
		
	}else {
		System.out.println("Wow! Beginners luck?");
		Runner.players.get(PlayingGame.currentPlayer).addMoney(100000);
	}
	//test

	
	
}
public static void math() {
	System.out.println("this minigame is all about math lets see how good you are at it");
	System.out.println("what it 1003*137");
	Scanner mathAnswer=new Scanner(System.in);
	System.out.println("put your answer below");
	int correct= mathAnswer.nextInt();
	if(correct!=137411) {
		System.out.println("uh oh that is incorrect you lose money");
		
	}else {
		System.out.println("Holy Cow you are good at math you win 50K");
		Runner.players.get(PlayingGame.currentPlayer).addMoney(50000);
	}
			
}
public static void riddle() {
	System.out.println("This minigame is all about riddles can you answer it?");
	System.out.println("Alright lets go");
	Scanner riddler=new Scanner(System.in);
	System.out.println("There's a one-story house where everything is yellow. The walls are yellow. the doors are yellow. even the funature is yellow. what color are the stairs");
String answer=riddler.nextLine();
if(answer=="There are no stairs") {
	System.out.println("Wow. this must have been some easy money");
	Runner.players.get(PlayingGame.currentPlayer).addMoney(30000);
}else {
	System.out.println("unlucky maybe read the first sentence ");
}


}
public static void trivia() {
	System.out.println("This is all about really random trivia. do you know your weird facts?");
	Scanner farts= new Scanner(System.in);
	System.out.println("what did Emperor Claudius legalize at banquets?");
	String answer=farts.nextLine();
	if(answer=="farts") {
		System.out.println("WHAT! How did you know that?");
		Runner.players.get(PlayingGame.currentPlayer).addMoney(75000);
	}else {
		System.out.println("Oh no, don't be sad this question was really hard");
	}
}
public static void trivia2() {
	System.out.println("This is a trivia minigame");
	Scanner decath= new Scanner(System.in);
	System.out.println("When was the first Iphone released");
	String answer=decath.nextLine();
	if(answer=="2007") {
		System.out.println("Good job tech wiz! You know your dates");
		Runner.players.get(PlayingGame.currentPlayer).addMoney(20000);
	}else {
		System.out.println("Darn but good try though");
	}
	
}
public static void javaQuestion() {
	System.out.println("Hey what do ya know a question about java. This should be easy money");
	Scanner os=new Scanner(System.in);
	System.out.println("Is Java a type of OS");
	String jav=os.nextLine();
	if(jav=="no") {
		System.out.println("See! I said it would be easy money");
		Runner.players.get(PlayingGame.currentPlayer).addMoney(20000);
	}else {
		System.out.println("Well guess who needs to read up on some java history");
		
	}
	
}
public static void sports() {
	System.out.println("Lets see how well you know sports, specifically soccer");
	Scanner cup=new Scanner(System.in);
	System.out.println("Which team was the first to win the World Cup in 1930");
String uru=cup.nextLine();
if(uru=="Uruguay") {
	System.out.println("Great! you know your stuff");
	Runner.players.get(PlayingGame.currentPlayer).addMoney(50000);
}else {
	System.out.println("Darn soccer is a great sport and is the most played ");
}
}
public static void music() {
	System.out.println("I want to rock! lets see how well you know it");
	Scanner led=new Scanner(System.in);
	System.out.println("What was the name of the rock band formed by Jimmy Page");
	String jim=led.nextLine();
	if(jim=="Led Zepplin") {
	System.out.println("I head bang to that bro ");
	Runner.players.get(PlayingGame.currentPlayer).addMoney(50000);
	}else {
		System.out.println("Darn you need to listen to some music");
	}

}

}

