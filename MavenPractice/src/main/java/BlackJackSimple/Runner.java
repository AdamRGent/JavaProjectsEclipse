package BlackJackSimple;

public class Runner {
	
	public static void main(String[] args) {
		BlackJackSimple.dealer= 21;
		BlackJackSimple.player= 21;
		
		BlackJackSimple BlackJack = new BlackJackSimple();
		System.out.println("The dealer's hand was: " + BlackJackSimple.dealer + " The player's hand was: " + BlackJackSimple.player);;
		System.out.println (BlackJackSimple.play(BlackJackSimple.dealer, BlackJackSimple.player));
	}
	
}

