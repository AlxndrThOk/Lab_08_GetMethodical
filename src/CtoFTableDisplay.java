import java.util.Scanner;

public class CtoFTableDisplay
{
    public static void main(String[] args)
    {
        System.out.println("Celsius    Fahrenheit");
        for (int i = -100; i <= 100; i++)
        {
            System.out.printf("%8.2f%10.2f%n", (double) i, CtoF(i));
        }
    }

    public static double CtoF(double celciusInput)
    {
        return ( celciusInput * 9/5 ) + 32;
    }
}
