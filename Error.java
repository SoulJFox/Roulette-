import java.util.Scanner;

public class Error {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number == 0) {
            System.out.println("no errors found");
        } else if (0 != number) {
            System.out.println("ERROR! ERROR! ERROR!");
        }
    }
}