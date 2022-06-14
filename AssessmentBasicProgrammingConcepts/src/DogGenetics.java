import java.util.Random;
import java.util.Scanner;

public class DogGenetics
{
    public static void main(String[] args)
    {
        // Initialize variables
        String name;
        int[] percs = new int[5];
        int limit = 100;

        // Initialize Scanner
        Scanner input = new Scanner(System.in);

        // Gets the dog's name from the user
        System.out.print("What is your dog's name?: ");
        name = input.nextLine();

        // Loops 5 times, to get five percentages and stores each one to an array
        for(int i = 0; i < 5; i++)
        {
            int p;
            if(i < 4)
            {
                p = getPercentage(limit);
                limit -= p;
            }
            else
            {
                p = limit;
            }

            percs[i] = p;
        }

        // Displays the results
        System.out.println();
        System.out.println("Well than, I have this highly reliable report on " + name + "'s prestigious background right here.");
        System.out.println();

        System.out.println(name + " is:");
        System.out.println(percs[0] + "% St. Bernard");
        System.out.println(percs[1] + "% Chihuahua");
        System.out.println(percs[2] + "% Dramatic RedNosed Asian Pug");
        System.out.println(percs[3] + "% Common Cur");
        System.out.println(percs[4] + "% King Doberman");
    }

    /**
     * Generates a new percentage
     * @param limit - bound for Random()
     * @return random percentage
     */
    public static int getPercentage(int limit)
    {
        Random random = new Random();
        return random.nextInt(limit + 1);
    }
}

