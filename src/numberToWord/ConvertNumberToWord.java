package numberToWord;

import java.text.DecimalFormat;

public class ConvertNumberToWord {

	public final String CONSTANT_ZERO = "zero";
	public final String CONSTANT_ONE = "one";
	public final String CONSTANT_MASK = "0000000000";
	public final String CONSTANT_BILLION = " billion";
	public final String CONSTANT_MILLION = " million";
	public final String CONSTANT_THOUSAND = " thousand";
	public final String CONSTANT_HUNDRED = " hundred";
	public final String[] tensNames = { "", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };
	public final String[] onesNames = { "", CONSTANT_ONE, "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };

	public String convert(long number) {
		String result;
		
		/** TODO:	Write a program which given a whole number between 0 and 1 billion; writes it out in words. E.g.
		542: five hundred forty-two
		23212 twenty-three thousand two hundred twelve
		1049875: one million forty-nine thousand eight hundred seventy-five */
		
		if (number == 0) { 
			result = CONSTANT_ZERO; 
		}
		else 
		{
			String maskNumber = CONSTANT_MASK;
			DecimalFormat dfNumber = new DecimalFormat(maskNumber);
			String stringNumber = dfNumber.format(number);

			// 000XXXXXXXXX
			int billions = Integer.parseInt(stringNumber.substring(0,1));
			// XXX000XXXXXX
			int millions  = Integer.parseInt(stringNumber.substring(1,4));
			// XXXXXX000XXX
			int hundred = Integer.parseInt(stringNumber.substring(4,7));
			// XXXXXXXXX000
			int thousands = Integer.parseInt(stringNumber.substring(7,10));

			String strBillions;
			switch (billions) {
			case 0:
				strBillions = "";
				break;
			case 1 :
				strBillions = convertPartsOfNumber(billions) + CONSTANT_BILLION;
				break;
			default :
				strBillions = convertPartsOfNumber(billions) + CONSTANT_BILLION;
			}

			result =  strBillions.trim();

			String strMillions;
			switch (millions) {
			case 0:
				strMillions = "";
				break;
			case 1 :
				strMillions = convertPartsOfNumber(millions) + CONSTANT_MILLION;
				break;
			default :
				strMillions = convertPartsOfNumber(millions) + CONSTANT_MILLION;
			}

			result =  result + " " + strMillions;

			String strHundred;
			switch (hundred) {
			case 0:
				strHundred = "";
				break;
			case 1 :
				strHundred = CONSTANT_ONE + CONSTANT_THOUSAND;
				break;
			default :
				strHundred = convertPartsOfNumber(hundred) + CONSTANT_THOUSAND;
			}

			result =  result + " " + strHundred;

			String strThousand;
			strThousand = convertPartsOfNumber(thousands);
			result =  result + " " + strThousand;
		}
		
		return result.trim();
	}

	private String convertPartsOfNumber(int number) 
	{
		String result;

		if (number % 100 >= 20)
		{
			result = onesNames[number % 10];
			number /= 10;

			result = tensNames[number % 10] + "-" + result;
			number /= 10;
		}
		else
		{
			result = onesNames[number % 100];
			number /= 100;
		}


		if (number == 0) {
			return result;
		}

		return onesNames[number] + CONSTANT_HUNDRED + " "+ result;
	}
}
