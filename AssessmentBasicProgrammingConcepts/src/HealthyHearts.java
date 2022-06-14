import java.util.Scanner;

public class HealthyHearts
{
    public static void main(String[] args)
    {
        // Initialize variables
        int age, maxRate;
        double lowTarg, highTarg;

        // Initialize Scanner
        Scanner input = new Scanner(System.in);

        // Get the user's age
        System.out.print("What is your age? ");
        age = Integer.parseInt(input.nextLine());

        // Calculate the different rates and targets
        maxRate = 220 - age;
        lowTarg = 0.5 * maxRate;
        highTarg = 0.85 * maxRate;

        // Display the results
        System.out.println("Your maximum heart rate should be " + maxRate + " beats per minute.");
        System.out.println("You target HR Zone is " + Math.round(lowTarg) + " - " + Math.round(highTarg) + " beats per minute");

    }
}
