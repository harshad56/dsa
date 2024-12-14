package dsa;

public class DigitExtractionHashing {

	public static int digitExtractionHash(int number) {
		int hash = 0;
		int multiplier = 1;

		while (number > 0) {
			int digit = number % 10;
			hash += digit * multiplier;
			multiplier *= 10;
			number /= 10;
		}

		return hash;
	}

	public static void main(String[] args) {
		int number = 123456;
		int hashValue = digitExtractionHash(number);

		System.out.println("The hash value for " + number + " is: " + hashValue);
	}
}
