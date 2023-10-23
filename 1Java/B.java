import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Roman Number: ");
        String romanNumber = scanner.nextLine();
        System.out.println("The Roman Number is: " + romanToInteger(romanNumber));
    }

    public static int romanToInteger(String romanNumber) {
        int totalValue = 0;
        int currentValue = 0;
        int nextValue = 0;

        for (int i = 0; i < romanNumber.length(); i++) {
            currentValue = getValue(romanNumber.charAt(i));
            if (i + 1 < romanNumber.length()) {
                nextValue = getValue(romanNumber.charAt(i + 1));
            } else {
                nextValue = 0;
            }

            if (currentValue >= nextValue) {
                totalValue += currentValue;
            } else {
                totalValue -= currentValue;
            }
        }

        return totalValue;
    }

    public static int getValue(char character) {
        switch (character) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}