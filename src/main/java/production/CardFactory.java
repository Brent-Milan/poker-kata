package production;

public class CardFactory {
	
	int[] values = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
	
	String[] suits = { "Spade", "Club", "Heart", "Diamond" };

	public Card createCard(String suit, int value) {
		Card card = new Card(suit, value);
		return card;
	}

	public String assignName(String suit) {
		if(suit == null) {
			return null;
		}
		
		if(suit.equalsIgnoreCase("Spade")) {
			return "S";
		} if(suit.equalsIgnoreCase("Club")) {
			return "C";
		}
		
		return null;
	}	

}
