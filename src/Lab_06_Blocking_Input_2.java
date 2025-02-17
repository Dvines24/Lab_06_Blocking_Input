import java.util.Scanner;

public class Lab_06_Blocking_Input_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double width = 0;
        double height = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.println("What is the width of the rectangle?");
            if (in.hasNextDouble()) {
                width = in.nextDouble();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("Please enter a valid width.");
            }
        } while (!done);
        done = false;
        do {
            System.out.println("What is the height of the rectangle?");
            if (in.hasNextDouble()) {
                height = in.nextDouble();
                done = true;
            } else {
                trash = in.next();
                System.out.println("Please enter a valid height.");
            }
        } while (!done);
        System.out.println("The perimeter of the rectangle is " + (width * 2 + height * 2) + "'");
        System.out.println("The area of the rectangle is " + (width * height) + ".");
        System.out.println("The hypotenuse is " + Math.sqrt((width * width) + (height * height)) + ".");
    }
}

