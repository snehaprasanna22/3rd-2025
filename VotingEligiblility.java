mport java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input age
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        // Input citizenship status
        System.out.print("Are you a citizen? (true/false): ");
        boolean isCitizen = input.nextBoolean();

        // Check voting eligibility using logical AND
        if (age >= 18 && isCitizen) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }

        input.close();
    }
}