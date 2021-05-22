package hu.sourceSCOde;

/**
 * A class for everything.
 */

public class Utils {

    public static String[] operators = {"\\+", "\\-", "\\*", "\\/"};

    public static double sum(double num1, double num2) {
        return num1 + num2;
    }

    public static double sub(double num1, double num2) {
        return num1 - num2;
    }

    public static double multi(double num1, double num2) {
        return num1 * num2;
    }

    public static double div(double num1, double num2) {
        return num1 / num2;
    }

    public static double calculateFromString(String text) {
        String[] pieces = text.split("\\s+");
        double res = 0d;
        switch (pieces[1].charAt(0)) {
            case '+':
                res = Utils.sum(Double.parseDouble(pieces[0]), Double.parseDouble(pieces[2]));
                break;
            case '-':
                res = Utils.sub(Double.parseDouble(pieces[0]), Double.parseDouble(pieces[2]));
                break;
            case '*':
                res = Utils.multi(Double.parseDouble(pieces[0]), Double.parseDouble(pieces[2]));
                break;
            case '/':
                res = Utils.div(Double.parseDouble(pieces[0]), Double.parseDouble(pieces[2]));
                break;
        }
        return res;
    }

    public static boolean lastCharIsDigit(String text) {
        return Character.isDigit(text.charAt(text.length() - 1));
    }

    public static String getOperator(char operator) {
        for (String s : operators) {
            if (s.contains(Character.toString(operator))) {
                return s;
            }
        }
        return null;
    }

}
