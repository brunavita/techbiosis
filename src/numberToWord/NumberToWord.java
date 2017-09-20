package numberToWord;

import java.util.Scanner;

public class NumberToWord 
{
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		System.out.print("Enter the number between 0 and 1 billion");
		Scanner scanner = new Scanner(System.in);
		Long value;
		String result = "";

		ConvertNumberToWord convertN2W = new ConvertNumberToWord();
		
		try
		{
			value = scanner.nextLong();
			
			if(value > 1000000000){
				throw new java.util.InputMismatchException();
			}

			result = convertN2W.convert(value);
			
			scanner.close();

			System.out.println(result);	    
		}
		catch (java.util.InputMismatchException e)
		{
			System.out.println("Invalid argument. You must enter a number.");
		}
	}
}