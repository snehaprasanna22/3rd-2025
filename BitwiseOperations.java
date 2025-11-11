import java.util.Scanner;

public class BitwiseOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input two integers
        System.out.print("Enter first integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();

        // Perform bitwise operations
        int andResult = num1 & num2;
        int orResult = num1 | num2;
        int xorResult = num1 ^ num2;

        // Display results in both decimal and binary form
        System.out.println("\nBitwise Operations:");
        System.out.println("AND (&)  : " + andResult + " (Binary: " + Integer.toBinaryString(andResult) + ")");
        System.out.println("OR  (|)  : " + orResult + " (Binary: " + Integer.toBinaryString(orResult) + ")");
        System.out.println("XOR (^)  : " + xorResult + " (Binary: " + Integer.toBinaryString(xorResult) + ")");

        input.close();
    }
}