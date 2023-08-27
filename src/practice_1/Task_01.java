package practice_1;

public class Task_01 {
    static String productName;
    static double price;
    static double amount;
    static double totalCost;
    private final static String CURRENCY = "EUR";
    private final static String unit = "kg";

    public static void main(String[] args) {

        productName = "Oranges";
        amount = 5.7;
        price = 26.57;

        totalCost = amount * price;
        System.out.printf("Product: %s, sold %s %s, total cost is %s %.2f.%n", productName, amount, unit, CURRENCY, totalCost);

        productName = "Bananas";
        amount = 32;
        price = 41.03;

        totalCost = amount * price;
        System.out.printf("Product: %s, sold %s %s, total cost is %s %.2f.%n", productName, amount, unit, CURRENCY, totalCost);

    }
}

