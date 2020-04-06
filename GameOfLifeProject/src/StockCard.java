
public class StockCard extends Card
{
	protected String number; 
	protected int cost;
	//when number is spun by another player you collect 10,000
	
	public StockCard(String cT, String n, int c)
	{ 
		super(cT); 
		number = n; 
		cost = c; 
		
		
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

}
