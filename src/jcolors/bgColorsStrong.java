package jcolors;

public class bgColorsStrong {
    static String rightEscapeChar = "\u001B[0m";
    public static String black(String input) {
        return "\u001B[100m" + input + rightEscapeChar;
    }
    public static String red(String input) {
        return "\u001B[101m" + input + rightEscapeChar;
    }
    public static String green(String input) {
        return "\u001B[102m" + input + rightEscapeChar;
    }
    public static String yellow(String input) {
        return "\u001B[103m" + input + rightEscapeChar;
    }
    public static String blue(String input) {
        return "\u001B[104m" + input + rightEscapeChar;
    }
    public static String magenta(String input) {
        return "\u001B[105m" + input + rightEscapeChar;
    }
    public static String cyan(String input) {
        return "\u001B[106m" + input + rightEscapeChar;
    }
    public static String white(String input) {
        return "\u001B[107m" + input + rightEscapeChar;
    }
}
