import java.util.Scanner;

public class Minigames {

	public static void main(String[] args) {
		//Minigames.guessTheNumber();
//Minigames.math();
	}
public static void guessTheNumber() {
	int guess=(int) ((Math.random()*1)+10);
	System.out.println("Hello good sir this minigame is all about guessing. Can you guess the number?");
	System.out.println("you have three tries. if you win you get 50 thousand if you lose, you lose 50,000");
	System.out.println("Are you ready?");
	System.out.println("(1)=yes. (2)=no");
	Scanner answer=new Scanner(System.in);
	int choice= answer.nextInt();
	Scanner numGuess = new Scanner(System.in);
	int count=0;
	System.out.println(choice);
	if(choice == 1) {
		
		while(count<=3) {
			int playerGuess = numGuess.nextInt();
			if(playerGuess< guess) {
				System.out.println("That number was too low try again");
				count++;
			}else if(playerGuess>guess) {
				System.out.println("That number was too high, try again");
				count++;
				
			}else if(count==3) {
				System.out.println("Uh oh! you are out of tries, you lose 50K ");
			}else {
				System.out.println("Congrats! you win this minigame, you get 50K ");
			}
		}	
	}
	
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
		System.out.println("WHAT! how did you know that but hey 50K is 50K");
		
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
}else {
	System.out.println("Darn soccer is a great sport and is the most played ");
}
}
public static void music() {
	System.out.println("I want to rock! lets see how well you know it");
	Scanner led=new Scanner(System.in);
	System.out.println("What was the name of the rock band formed by Jimmy Page");
	String jim=led.nextLine();
	if(jim=="Led Zepplin");
	System.out.println("I head bang to that bro ");
}
}
