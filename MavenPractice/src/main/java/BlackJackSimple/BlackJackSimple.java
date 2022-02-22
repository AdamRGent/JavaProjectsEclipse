package BlackJackSimple;

public class BlackJackSimple {
 
	 public static int dealer;{
		if (BlackJackSimple.dealer < 21) {
			BlackJackSimple.dealer = BlackJackSimple.dealer + 1;}}
	 //added the above rule as the dealer is allowed to plus one to their score
	 public static int player;
	 
		
			

	public static String play(int dealer, int player) {
	        if (dealer > 21 && player > 21) {
	            return  "Both hands are bust";
	        } else if (dealer > 21) {
	            return "Dealer is bust, Player wins";
	        } else if (player > 21) {
	            return "Player is bust, dealer wins";
	        } else if (dealer <= 21 && player < dealer) {
	        	return "Dealer wins with the higher hand";
	        } else if (player <= 21 && dealer < player) {
	        	return "Player wins with the higher hand";
	        } else if (dealer <= 21 && player == dealer) {
	        	return "Both hands are equal and Player wins by default";
	        }
	        
			return ("The dealer's hand was: " + BlackJackSimple.dealer + " The player's hand was: " + BlackJackSimple.player);
	
	    }
	 


	}

