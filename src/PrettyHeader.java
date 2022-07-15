import java.util.Scanner;

public class PrettyHeader
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String headerText;
        int spaceCount;

        headerText = SafeInput.getNonZeroLenString(in, "enter some text");
        spaceCount = ( 54 - headerText.length() ) / 2;
        System.out.println(spaceCount);

        for (int i = 1; i <= 60; i++)
        {
            System.out.print("*");
        }
        System.out.println();



        System.out.print("***");
        for (int j = 1; j <= spaceCount; j++)
        {
            System.out.print(" ");
        }

        System.out.print(headerText);

        for (int k = 1; k <= spaceCount; k++)
        {
            System.out.print(" ");
        }
        System.out.print("***");
        System.out.println();



        for (int i = 1; i <= 60; i++)
        {
            System.out.print("*");
        }
    }
}
