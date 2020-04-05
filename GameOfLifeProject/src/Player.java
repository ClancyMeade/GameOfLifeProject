import java.util.ArrayList;
import java.util.List;

public class Player
	{
		private String name;
		private int totalMoney;
		private int totalLoans;
		private int placeOnBoard;
		;
		private ArrayList<LifeTile> playersLifeTiles = new ArrayList<LifeTile>();
		private ArrayList<Card> playersCards = new ArrayList<Card>();

		public Player(String n, int tM, int tL, int p, ArrayList<LifeTile> pL, ArrayList<Card> pC)
			{
				name = n;
				totalMoney = tM;
				totalLoans = tL;
				placeOnBoard = p;
				playersLifeTiles = pL;
				playersCards = pC;
				
			}

	

		public String getName()
			{
				return name;
			}

		public void setName(String name)
			{
				this.name = name;
			}

		public int getTotalMoney()
			{
				return totalMoney;
			}

		public void setTotalMoney(int totalMoney)
			{
				this.totalMoney = totalMoney;
			}

		public int getTotalLoans()
			{
				return totalLoans;
			}

		public void setTotalLoans(int totalLoans)
			{
				this.totalLoans = totalLoans;
			}

		public int getPlaceOnBoard()
			{
				return placeOnBoard;
			}

		public void setPlaceOnBoard(int placeOnBoard)
			{
				this.placeOnBoard = placeOnBoard;
			}

		public ArrayList<LifeTile> getPlayersLifeTiles()
			{
				return playersLifeTiles;
			}

		public void setPlayersLifeTiles(ArrayList<LifeTile> playersLifeTiles)
			{
				this.playersLifeTiles = playersLifeTiles;
			}

		public ArrayList<Card> getPlayersCards()
			{
				return playersCards;
			}

		public void setPlayersCards(ArrayList<Card> playersCards)
			{
				this.playersCards = playersCards;
			}

	}
