package techbiosis;

import static org.junit.Assert.*;

import org.junit.Test;

public class SortTest {

	@Test
	public void testSort() {
		int[] vector = {5, 20, 16, 1};
		int[] vectorSort = {1, 5, 16, 20};
		new Sort(vector, 0, vector.length -1);    
        
		assertArrayEquals(vectorSort, vector);
	}

}
