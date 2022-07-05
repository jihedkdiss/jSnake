package jcolors;

public class fgColorsStrong {
    static String rightEscapeChar = "\u001B[0m";
    public static String black(String input) {
        return "\u001B[90m" + input + rightEscapeChar;
    }
    public static String red(String input) {
        return "\u001B[91m" + input + rightEscapeChar;
    }
    public static String green(String input) {
        return "\u001B[92m" + input + rightEscapeChar;
    }
    public static String yellow(String input) {
        return "\u001B[93m" + input + rightEscapeChar;
    }
    public static String blue(String input) {
        return "\u001B[94m" + input + rightEscapeChar;
    }
    public static String magenta(String input) {
        return "\u001B[95m" + input + rightEscapeChar;
    }
    public static String cyan(String input) {
        return "\u001B[96m" + input + rightEscapeChar;
    }
    public static String white(String input) {
        return "\u001B[97m" + input + rightEscapeChar;
    }
}
