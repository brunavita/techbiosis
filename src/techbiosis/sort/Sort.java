package techbiosis.sort;

public class Sort {

	/**TODO: In the Pragmatic Lottery (motto: There’s One Born Every Minute, and it Might Just Be You!), 
	 * we select each week’s winning combination by drawing balls. There are sixty balls, numbered 
	 * (not surprisingly, as we are programmers) 0 to 59. The balls are drawn by the personable, but 
	 * somewhat distracted, Daisy Mae. As a result, some weeks five numbers are drawn, while other weeks 
	 * seven, nine, or even fifteen balls make it to the winner’s rack. Regardless of the number of balls 
	 * drawn, our viewers need to see the list of winning numbers in sorted order just as soon as possible. 
	 * So, your challenge is to come up with some code that accepts each number as it is drawn and presents 
	 * the sorted list of numbers so far. The tests might look something like:
	 * rack = Rack.new
	 * assert_equal([], rack.balls)
	 * rack.add(20)
	 * assert_equal([ 20 ], rack.balls)
	 * rack.add(10)
	 * assert_equal([ 10, 20 ], rack.balls)
	 * rack.add(30)
	 * assert_equal([ 10, 20, 30 ], rack.balls)
	 */
	
	public Sort(int vector[], int leftNumber, int rightNumber) {
		int left = leftNumber;
		int right = rightNumber;
		int index = vector[(left + right) / 2];
		int change;

		while (left <= right)
		{
			while (vector[left] < index) {
				left = left + 1;
			}

			while (vector[right] > index) {
				right = right - 1;
			}

			if (left <= right) {
				change = vector[left];
				vector[left] = vector[right];
				vector[right] = change;
				left = left + 1;
				right = right - 1;
			}
		}

		if (right > leftNumber){
			new Sort(vector, leftNumber, right);	
		}
		
		if (left < rightNumber){
			new Sort(vector, left, rightNumber);
		}
	}

}
