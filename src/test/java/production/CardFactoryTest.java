package production;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CardFactoryTest {
	
	CardFactory underTest;

	@Before
	public void setUp() throws Exception {
		underTest = new CardFactory();
	}

	@Test
	public void arraySizeShouldEquals13() {
		int expected = 13;
		assertEquals(expected, underTest.values.length);
	}
	
	@Test
	public void arrayShouldIncludeAllCardValues() {
		int[] expected = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
		assertArrayEquals(expected, underTest.values);
	}
	
	@Test 
	public void suitArraySizeShouldEqual4() {
		int expected = 4;
		assertEquals(expected, underTest.suits.length);
	}
	
	@Test
	public void arrayShouldIncludeAllFourSuits() {
		String[] expected = { "Spade", "Club", "Heart", "Diamond"};
		assertArrayEquals(expected, underTest.suits);
	}
	
	@Test
	public void shouldReturnACardObjectWithSuitSpade() {
		String expected = "Spade";
		Card card = underTest.createCard("Spade", 0);
		assertEquals(expected, card.suit);
	}
	
	@Test
	public void shouldReturnACardObjectWithSuitClub() {
		String expected = "Club";
		Card card = underTest.createCard("Club", 0);
		assertEquals(expected, card.suit);
	}
	
	@Test
	public void shouldReturnACardObjectWithSuitHeart() {
		String expected = "Heart";
		Card card = underTest.createCard("Heart", 0);
		assertEquals(expected, card.suit);
	}
	
	@Test
	public void shouldReturnACardObjectWithValue2() {
		int expected = 2;
		Card card = underTest.createCard("Spade", 2);
		assertEquals(expected, card.value);
	}
	
	@Test
	public void shouldReturnStringOutputS() {
		String expected = "S";
		assertEquals(expected, underTest.abbreviateSuit("Spade"));
	}
	
	@Test
	public void shouldReturnStringOutputC() {
		String expected = "C";
		assertEquals(expected, underTest.abbreviateSuit("Club"));
	}
	
	@Test
	public void shouldReturnStringOutputH() {
		String expected = "H";
		assertEquals(expected, underTest.abbreviateSuit("Heart"));
	}
	
	@Test
	public void shouldReturnStringOutputD() {
		String expected = "D";
		assertEquals(expected, underTest.abbreviateSuit("Diamond"));
	}

}
