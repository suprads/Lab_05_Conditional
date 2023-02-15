import java.util.Scanner;

public class TheaterKiosk
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int age = 0;
        String trash = "";

        System.out.print("Enter your age: ");

        if (in.hasNextInt())
        {
            age = in.nextInt();
            in.nextLine();
        }

        else
        {
            trash = in.nextLine();
            System.out.println("You entered an incorrect value: " + trash);
            System.exit(0);
        }

        if (age >= 21)
        {
            System.out.println("You get a wristband!");
        }
    }
}
