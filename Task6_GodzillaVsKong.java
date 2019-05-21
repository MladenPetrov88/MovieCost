import java.util.Scanner;

public class Task6_GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int statists = Integer.parseInt(scanner.nextLine());
        double clothesPricePerPerson = Double.parseDouble(scanner.nextLine());
        double deckorPrice = budget * 0.1;
        double clothesPrice = statists * clothesPricePerPerson;
        if (statists > 150) {
            clothesPrice = clothesPrice - clothesPrice * 0.1;
        }
        double neededMoney = deckorPrice + clothesPrice;
        double leftMoney = budget - neededMoney;
        if (budget > neededMoney) {
            System.out.printf("Action!%nWingard starts filming with%n%.2f leva left.", leftMoney);
        } else {
            System.out.printf("Not enough money!%nWingard need %.2f leva%nmore.",Math.abs(leftMoney));
        }
    }
}