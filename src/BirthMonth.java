import java.util.Scanner;

public class BirthMonth
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int birthMonth = 0;
        String trash = "";

        System.out.print("Enter your birth month from 1 through 12: ");

        if (in.hasNextInt())
        {
            birthMonth = in.nextInt();
            in.nextLine();
        }

        else
        {
            trash = in.nextLine();
            System.out.println("You entered an incorrect month value: " + trash);
            System.exit(0);
        }

        if (birthMonth >= 1 && birthMonth <= 12)
        {
            System.out.println("Your birth month is: " + birthMonth);
        }

    }
}
