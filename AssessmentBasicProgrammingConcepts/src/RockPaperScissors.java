import java.util.Scanner;

public class RockPaperScissors
{
    public static void main(String[] args)
    {
        int rounds;
        Scanner input = new Scanner(System.in);

        System.out.println("======== Rock, Paper, Scissors ========");
        System.out.print("How many rounds would you like to play? (1-10): ");

        while(true)
        {
            rounds = Integer.parseInt(input.nextLine());

            if(rounds < 1 || rounds > 10)
            {
                break;
            }
            else
            {
                System.out.println("Rounds: " + rounds);
            }
        }
    }
}
