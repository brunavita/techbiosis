package numberToWord;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConvertNumberToWordTest {

	private ConvertNumberToWord n2w = new ConvertNumberToWord();
	
	@Test
	public void testConvert() {
		
		String result = n2w.convert(100);
		assertEquals("one hundred", result);
		
		String resultThousand = n2w.convert(1495);
		assertEquals("one thousand four hundred ninety-five", resultThousand);
	}

}
