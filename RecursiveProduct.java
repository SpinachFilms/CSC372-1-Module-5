import java.util.Scanner;

public class RecursiveProduct {

    public static int productRecursive(int[] numbers, int index) {
        if (index == numbers.length - 1) {
            return numbers[index];
        }
        return numbers[index] * productRecursive(numbers, index + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter five numbers to calculate their product using recursion:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        int result = productRecursive(numbers, 0);
        System.out.println("The product of the five numbers is: " + result);

        scanner.close();
    }
}
