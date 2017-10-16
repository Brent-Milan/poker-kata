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

}
