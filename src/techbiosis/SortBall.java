package techbiosis;

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

			String resultado = "";

			for (int i = 0; i < vector.length; i++) 
			{
				if(resultado.isEmpty()){
					resultado = "" + vector[i];
				} else {
					resultado = resultado + ", " + vector[i];
				}
			}

			System.out.println(resultado);	    
		}
		catch (java.util.InputMismatchException e)
		{
			System.out.println("Invalid argument. You must enter a number.");
		}
	}

}
