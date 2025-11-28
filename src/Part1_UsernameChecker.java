import java.util.Scanner;

public class Part1_UsernameChecker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two usernames:");
        String first = scanner.nextLine();
        String second = scanner.nextLine();

        int len1 = first.length();
        int len2 = second.length();

        System.out.println("Length 1: " + len1);
        System.out.println("Length 2: " + len2);

        boolean sameLength = (len1 == len2);
        boolean sameStrings = first.equals(second);

        System.out.println("Lengths match: " + sameLength);
        System.out.println("Strings match: " + sameStrings);

        scanner.close();
    }
}
