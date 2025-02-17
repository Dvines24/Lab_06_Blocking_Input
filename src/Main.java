import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int celsius = 0;
        String trash = "";
        boolean done = false;
        do
        {
            System.out.println("What is the current temperature in Celsius?");
            if (in.hasNextInt())
            {
                celsius = in.nextInt();
                System.out.println("The current temperature in Fahrenheit is " + (celsius * 1.8 + 32) + ".");
                done = true;
            }
            else
            {
                trash = in.next();
                System.out.println("You said the temperature was " + trash + ". You need to enter a valid temperature.");
            }
        }while(!done);
    }
}