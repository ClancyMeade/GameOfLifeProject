
public class SalaryCard extends Card
{
	protected int amountToCollect; 
	protected int taxPayAmount; 
	
	public SalaryCard(String cT, int a, int t)
	{ 
		super(cT); 
		amountToCollect = a; 
		taxPayAmount = t; 
	}

	public int getAmountToCollect() {
		return amountToCollect;
	}

	public void setAmountToCollect(int amountToCollect) {
		this.amountToCollect = amountToCollect;
	}

	public int getTaxPayAmount() {
		return taxPayAmount;
	}

	public void setTaxPayAmount(int taxPayAmount) {
		this.taxPayAmount = taxPayAmount;
	}
	
}
