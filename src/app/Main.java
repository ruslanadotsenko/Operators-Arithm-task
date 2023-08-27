package app;

public class Main {

    static String name;
    static int quota;
    static double price;
    static double salesAmount;
    static double avgSum;
    static int days;
    private final static String CURRENCY = "EUR";

    public static void main(String[] args) {

        name = "Oranges";
        quota = 158;
        price = 2.99;
        days = 7;

        salesAmount = quota * price;
        System.out.printf("Product: %s, sales %s %.2f%n", name, CURRENCY, salesAmount);

        avgSum = salesAmount / days;
        System.out.printf("Product: %s, sales by day %s %.2f%n", name, CURRENCY, avgSum);

        name = "Apples";
        quota = 117;
        price = 1.95;
        days = 7;

        salesAmount = quota * price;
        System.out.printf("Product: %s, sales %s %.2f%n", name, CURRENCY, salesAmount);

        avgSum = salesAmount / days;
        System.out.printf("Product: %s, sales by day %s %.2f%n", name, CURRENCY, avgSum);

    }
}
