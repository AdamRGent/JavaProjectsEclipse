package BlackJackSimple;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BlackJackSimpleTest {

	@Test
	public void playerWinsTest() {
	    BlackJackSimple BlackJack = new BlackJackSimple();
	    assertEquals("Expected: Player/Dealer both bust", 0, BlackJackSimple.play(22, 22));
	}
	
	@Test
	public void DealBustsTest() {
	    BlackJackSimple BlackJack = new BlackJackSimple();
	    assertEquals("Expected: Player wins with 21", 21, BlackJackSimple.play(22, 21));
	}
	
	@Test
	public void DealerWinsTest() {
	    BlackJackSimple BlackJack = new BlackJackSimple();
	    assertEquals("Expected: Dealer wins with 18", 18, BlackJackSimple.play(18, 22));
}
}