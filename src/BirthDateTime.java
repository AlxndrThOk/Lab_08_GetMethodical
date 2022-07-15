import java.util.Scanner;

public class BirthDateTime
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int birthYear;
        int birthMonth;
        int birthDay;
        int birthHour;
        int birthMinute;

        birthYear = SafeInput.getRangedInt(in, "What year were you born", 1950,2010);
        birthMonth = SafeInput.getRangedInt(in, "What month were you born",1,12);

        switch (birthMonth)
        {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                birthDay = SafeInput.getRangedInt(in, "What day were you born",1,31);
                break;
            case 4: case 6: case 9: case 11:
                birthDay = SafeInput.getRangedInt(in, "What day were you born",1,30);
                break;
            case 2:
                birthDay = SafeInput.getRangedInt(in, "What day were you born",1,28);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + birthMonth);
        }
        birthHour = SafeInput.getRangedInt(in,"What hour were you born",0,23);
        birthMinute = SafeInput.getRangedInt(in,"What minute were you born",0,59);

        System.out.println("You were born on " + birthMonth + "/" + birthDay + "/" + birthYear + " at " + birthHour + ":" + birthMinute);
    }
}
