
public class LifeTileCard extends Card
 	{
		String phrase; 
		int amount;
		
		public LifeTileCard(String t, String p, int a)
		{ 
			super(t); 
			phrase = p; 
			amount = a; 
		}

		public String getPhrase() {
			return phrase;
		}

		public void setPhrase(String phrase) {
			this.phrase = phrase;
		}

		public int getAmount() {
			return amount;
		}

		public void setAmount(int amount) {
			this.amount = amount;
		}

	}
