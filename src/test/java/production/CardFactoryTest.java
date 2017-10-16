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

}
