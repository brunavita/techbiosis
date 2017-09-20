package techbiosis.sort;

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
	
	@Test
	public void testSort2() {
		int[] vector = {20};
		int[] vectorSort = {20};
		new Sort(vector, 0, vector.length -1);    
        assertArrayEquals(vectorSort, vector);
        
        int[] vector2 = {20, 10};
        int[] vectorSort2 = {10, 20};
		new Sort(vector2, 0, vector2.length -1);    
        assertArrayEquals(vectorSort2, vector2);

        int[] vector3 = {20, 10, 30};
        int[] vectorSort3 = {10, 20, 30};
		new Sort(vector3, 0, vector3.length -1);    
        assertArrayEquals(vectorSort3, vector3);
	}

}
