package jcolors;

public class fgColors {
    static String rightEscapeChar = "\u001B[0m";
    public static String black(String input) {
        return "\u001B[30m" + input + rightEscapeChar;
    }
    public static String red(String input) {
        return "\u001B[31m" + input + rightEscapeChar;
    }
    public static String green(String input) {
        return "\u001B[32m" + input + rightEscapeChar;
    }
    public static String yellow(String input) {
        return "\u001B[33m" + input + rightEscapeChar;
    }
    public static String blue(String input) {
        return "\u001B[34m" + input + rightEscapeChar;
    }
    public static String magenta(String input) {
        return "\u001B[35m" + input + rightEscapeChar;
    }
    public static String cyan(String input) {
        return "\u001B[36m" + input + rightEscapeChar;
    }
    public static String white(String input) {
        return "\u001B[37m" + input + rightEscapeChar;
    }
}
