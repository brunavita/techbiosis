package techbiosis;

public class Sort {

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
