package jcolors;

public class bgColors {
    static String rightEscapeChar = "\u001B[0m";
    public static String black(String input) {
        return "\u001B[40m" + input + rightEscapeChar;
    }
    public static String red(String input) {
        return "\u001B[41m" + input + rightEscapeChar;
    }
    public static String green(String input) {
        return "\u001B[42m" + input + rightEscapeChar;
    }
    public static String yellow(String input) {
        return "\u001B[43m" + input + rightEscapeChar;
    }
    public static String blue(String input) {
        return "\u001B[44m" + input + rightEscapeChar;
    }
    public static String magenta(String input) {
        return "\u001B[45m" + input + rightEscapeChar;
    }
    public static String cyan(String input) {
        return "\u001B[46m" + input + rightEscapeChar;
    }
    public static String white(String input) {
        return "\u001B[47m" + input + rightEscapeChar;
    }
}
