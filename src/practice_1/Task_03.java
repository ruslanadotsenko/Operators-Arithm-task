package practice_1;

import java.util.Scanner;

public class Task_03 {

    static String name;
    static int quantity;
    static double price;
    static double totalCost;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter product name: ");
        name = scanner.nextLine();

        System.out.print("Enter product quantity: ");
        quantity = scanner.nextInt();

        System.out.print("Enter product price, USD: ");
        price = scanner.nextDouble();

        totalCost = quantity * price;

        System.out.printf("%nInput product name: %s.", name);
        System.out.printf("%nInput product quantity, pcs.: %s.", quantity);
        System.out.printf("%nInput product price, USD: %s.", price);
        System.out.printf("%nCost of orange is USD %.2f.%n", totalCost);

        scanner.close();
    }
}
