package machine;

import java.util.Scanner;

public class CoffeeMachine {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water the coffee machine has: ");
        int mlWater = scanner.nextInt();

        System.out.println("Write how many ml of milk the coffee machine has:");
        int mlMilk = scanner.nextInt();

        System.out.println("Write how many grams of coffee beans the coffee machine has: ");
        int grCoffee = scanner.nextInt();

        System.out.println("Write how many cups of coffee you will need:");
        int cupsNumber = scanner.nextInt();

        int cupsWater = mlWater / 200;
        int cupsMilk = mlMilk / 50;
        int cupsCoffee = grCoffee / 15;
        int maxCups = Math.min(cupsCoffee, Math.min(cupsWater, cupsMilk));

        if ((cupsNumber * 200 > mlWater) || (cupsNumber * 50 > mlMilk) || (cupsNumber * 15 > grCoffee)) {
            System.out.println("No, I can make only " + maxCups + " cup(s) of coffee");
        } else if (cupsNumber == maxCups) {
            System.out.println("Yes, I can make that amount of coffee ");
        } else {
            System.out.println("Yes, I can make that amount of coffee (and even " + (maxCups - cupsNumber) + " more than that)");
        }
    }
}
