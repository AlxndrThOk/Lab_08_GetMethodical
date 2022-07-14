import java.util.Scanner;
public class DevTest {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String aNonZeroLenString = SafeInput.getNonZeroLenString(in, "type something");
        System.out.println(aNonZeroLenString);

        int anInteger = SafeInput.getInt(in, "enter an integer");
        System.out.println(anInteger);

        double aNumber = SafeInput.getDouble(in, "enter a number");
        System.out.println(aNumber);

        int aRangedInt = SafeInput.getRangedInt(in, "enter an integer", 0,10);
        System.out.println(aRangedInt);

        double aRangedDouble = SafeInput.getRangedDouble(in, "enter an number", 0,10);
        System.out.println(aRangedDouble);

        boolean aBoolean = SafeInput.getYNConfirm(in, "play again?");
        System.out.println(aBoolean);

        String aRegExString = SafeInput.getRegExString(in, "enter your phone number", "\\d{3}-\\d{3}-\\d{4}");
        System.out.println(aRegExString);
    }
}
