import java.util.HashSet;
import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        if (isPangram(input)) {
            System.out.println("The string is a pangram.");
        } else {
            System.out.println("The string is not a pangram.");
        }
    }

    public static boolean isPangram(String input) {
        HashSet<Character> charSet = new HashSet<>();
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                charSet.add(Character.toLowerCase(c));
            }
        }
        return charSet.size() == 26;
    }
}