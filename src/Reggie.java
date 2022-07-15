import java.util.Scanner;

public class Reggie
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String socialSecNum;
        String studentMNum;
        String menuChoice;

        socialSecNum = SafeInput.getRegExString(in,"enter your SSN in the format 000-00-0000","\\d{3}-\\d{2}-\\d{4}");
        studentMNum = SafeInput.getRegExString(in,"enter your m number in the format M00000","(M|m)\\d{5}");
        menuChoice = SafeInput.getRegExString(in,"choose Open Save View or Quit [O/S/V/Q]","[OoSsVvQq]");
    }
}
