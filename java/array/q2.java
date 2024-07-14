 import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        // Prompt user to enter the size of the array
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        // Declare an array of given size
        int[] array = new int[size];

        // Prompt user to enter the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        // Variable to store the sum
        int sum = 0;

        // Calculate sum of array elements
        for (int num : array) {
            sum += num;
        }

        // Print the sum
        System.out.println("Sum of array elements is: " + sum);

        // Close the scanner
        sc.close();
    }
}
