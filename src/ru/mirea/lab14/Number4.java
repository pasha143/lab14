package ru.mirea.lab14;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Number4 {
    private static final String obraz = "\\d+(?!\\+)";

    public static boolean hasDigitsWithoutPlus(String text) {
        Pattern pattern = Pattern.compile(obraz);
        Matcher matcher = pattern.matcher(text);
        return matcher.find();
    }

    public static void main(String[] args) {
        String[] validExpressions = {"(1 + 8) - 9 / 4"};
        String[] invalidExpressions = {"6 / 5 - 2 * 9"};

        for (String expression : validExpressions) {
            System.out.println(expression + " has digits without '+' sign: " + hasDigitsWithoutPlus(expression));
        }

        for (String expression : invalidExpressions) {
            System.out.println(expression + " has digits without '+' sign: " + hasDigitsWithoutPlus(expression));
        }
    }
}