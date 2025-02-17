import java.util.Scanner;
import java.util.Random;

public class Lab_06_Blocking_Input_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random gen = new Random();
        int rnd = gen.nextInt(10) + 1;
        int guess = 0;
        String trash = "";
        boolean done = false;

        do
        {
            System.out.println("Guess a number 1-10");
            if (in.hasNextInt())
            {
                guess = in.nextInt();
                if (guess >= 1 && guess <= 10) {
                    System.out.println("The random number was " + rnd + ".");
                    done = true;
                }
                else
                {
                    trash = in.nextLine();
                    System.out.println("Please enter a number 1-10.");
                }
            }
            else
            {
                trash = in.nextLine();
                System.out.println("Please enter a number 1-10");
            }
        }while(!done);

        if (guess > rnd)
        {
            System.out.println("Your guess was too high.");
        }
        else if (guess == rnd)
        {
            System.out.println("You guessed correctly.");
        }
        else if (guess < rnd)
        {
            System.out.println("Your guess was too low.");
        }
    }
}

