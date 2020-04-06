
public abstract class Card
	{
		protected String cardType; 
		
		public Card(String cT)
		{ 
			cardType = cT; 
		}

		public String getCardType() {
			return cardType;
		}

		public void setCardType(String cardType) {
			this.cardType = cardType;
		}
	}
