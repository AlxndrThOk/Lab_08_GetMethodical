import java.util.Scanner;

public class CheckOut
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double itemPrice;
        double totalPrice = 0;
        boolean moreItems;

        System.out.println("WELCOME TO THE $10 STORE");
        do
        {
            itemPrice = SafeInput.getRangedDouble(in, "What is the price of your item",0.5,9.99);
            totalPrice += itemPrice;
            moreItems = SafeInput.getYNConfirm(in, "Do you have any more items");
        }
        while (moreItems);

        System.out.println("Your total price is");
        System.out.printf("%3.2f", totalPrice);
    }
}
