package ru.mirea.lab14;
import java.util.regex.Pattern;

public class Number5 {
    private static final String datepattern = "^(0[1-9]|1\\d|2[0-8])/(0[1-9]|1[0-2])/((19|20)\\d\\d|9999)$";

    public static boolean isValidDate(String date) {
        Pattern pattern = Pattern.compile(datepattern);
        return pattern.matcher(date).matches();
    }

    public static void main(String[] args) {
        String[] validDates = {"29/02/2000", "30/04/2003", "01/01/2003"};
        String[] invalidDates = {"29/02/2001", "30-04-2003", "1/1/1899"};

        for (String date : validDates) {
            System.out.println(date + " is valid: " + isValidDate(date));
        }

        for (String date : invalidDates) {
            System.out.println(date + " is valid: " + isValidDate(date));
        }
    }
}