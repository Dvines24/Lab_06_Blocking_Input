import java.util.Scanner;

public class Lab_06_Blocking_Input {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double gallons = 0;
        double fuelEfficiency = 0;
        double gasCost = 0;
        String trash = "";
        boolean done = false;

            do {
                System.out.println("How many gallons of gas can your car hold?");
                if (in.hasNextDouble())
                {
                    gallons = in.nextDouble();
                    done = true;
                }
                else
                {
                    trash = in.nextLine();
                    System.out.println("Please enter a valid amount.");
                }
            } while (!done);
            done = false;
            do {
                System.out.println("How many miles per gallon does your car get?");
                if (in.hasNextDouble()) {
                    fuelEfficiency = in.nextDouble();
                    done = true;
                } else {
                    trash = in.next();
                    System.out.println("Please enter a valid amount.");
                }
            } while (!done);
            done = false;
            do {
                System.out.println("What is the price per gallon of gas?");
                if (in.hasNextDouble()) {
                    gasCost = in.nextDouble();
                    done = true;
                } else {
                    trash = in.next();
                    System.out.println("Please enter a valid amount");
                }
            } while (!done);


        System.out.println("Your vehicle can travel " + (gallons * fuelEfficiency) + "on a full tank.");
        System.out.println("It will cost " + (100 / gallons * gasCost) + " to travel 100 miles.");
    }
}
