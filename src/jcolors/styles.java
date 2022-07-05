package jcolors;

public class styles {
    static String rightEscapeChar = "\u001B[0m";
    public static String normal(String input) {
        return "\u001B[0m" + input + rightEscapeChar;
    }
    public static String bold(String input) {
        return "\u001B[1m" + input + rightEscapeChar;
    }
    public static String underline(String input) {
        return "\u001B[4m" + input + rightEscapeChar;
    }
    public static String inverse(String input) {
        return "\u001B[7m" + input + rightEscapeChar;
    }
}
