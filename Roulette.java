import java.util.Scanner;

public class Roulette {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstLuckyNumber = scanner.nextInt();
        int secondLuckyNumber = scanner.nextInt();

        if (firstLuckyNumber == 36 && secondLuckyNumber == 17) {
            System.out.println("Congratulations You  Won Jackpot 10000$$$");
        } else if (firstLuckyNumber == 36 && secondLuckyNumber != 17) {
            System.out.println("Congratulations you won 20$");
        } else if (firstLuckyNumber != 36 && secondLuckyNumber == 17) {
            System.out.println("Congratulations you won 50$");
        } else if (firstLuckyNumber != 36 && secondLuckyNumber != 17) {
            System.out.println("Sorry But You Lose:(");
        }
    }

}




