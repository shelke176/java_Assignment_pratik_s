import java.util.Arrays;
import java.util.Scanner;

public class ArraySumSorter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];
        int sum = 0;

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
            sum += numbers[i];
        }

        Arrays.sort(numbers);

        System.out.println("Sum of elements: " + sum);
        System.out.println("Array in ascending order:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        sc.close();
    }
}
