import java.util.Scanner;

public class FavNumbers
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int favInteger = SafeInput.getInt(in, "what is your favorite integer?");
        double favNumber = SafeInput.getDouble(in, "what is your favorite number?");

        System.out.println("your favorite integer is " + favInteger + ", your favorite number is " + favNumber);
    }
}
