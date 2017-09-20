package techbiosis.sort;

import java.util.Scanner;

public class SortBall {

	public static void main(String[] args) {
		System.out.print("Enter the size of array");
		Scanner scanner = new Scanner(System.in);
		Integer value = 0;

		try
		{
			value = scanner.nextInt();

			int[] vector = new int[value];
			System.out.println("Enter elements in array");

			for(int i=0;i<value;i++)
			{
				vector[i]=scanner.nextInt();
			}

			scanner.close();

			new Sort(vector, 0, vector.length -1);

			String result = "";

			for (int i = 0; i < vector.length; i++) 
			{
				if(result.isEmpty()){
					result = "" + vector[i];
				} else {
					result = result + ", " + vector[i];
				}
			}

			System.out.println(result);	    
		}
		catch (java.util.InputMismatchException e)
		{
			System.out.println("Invalid argument. You must enter a number.");
		}
	}

}
