import java.util.Scanner;

public class PartyAffiliation
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String party = "";
        String trash = "";
        System.out.print("Enter your party affiliation [DRI]: ");

        if (in.hasNextLine())
        {
            party = in.nextLine();
        }

        else
        {
            trash = in.nextLine();
            System.exit(0);
        }

        if (party.equalsIgnoreCase("D"))
        {
            System.out.println("You get a Democratic Donkey!");
        }

        else if (party.equalsIgnoreCase("R"))
        {
            System.out.println("You get a Republican Elephant!");
        }
        else if (party.equalsIgnoreCase("I"))
        {
            System.out.println("You get an Independent Man!");
        }

        else
        {
            System.out.println("You belong to a different party!");
        }
    }
}
