package production;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DeckTest {

	Deck underTest;
	
	@Before
	public void setUp() throws Exception {
		underTest = new Deck();
	}

	@Test
	public void shouldReturnLengthOf52() {
		int expected = 52;
		assertEquals(expected, underTest.gameCards.length);
	}

}
