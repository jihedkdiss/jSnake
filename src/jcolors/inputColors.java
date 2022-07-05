package jcolors;

public class inputColors {
    public static void close() {
        System.out.print("\u001B[0m");
    }
    public static void black() {
        System.out.print("\u001B[30m");
    }
    public static void red() {
        System.out.print("\u001B[31m");
    }
    public static void green() {
        System.out.print("\u001B[32m");
    }
    public static void yellow() {
        System.out.print("\u001B[33m");
    }
    public static void blue() {
        System.out.print("\u001B[34m");
    }
    public static void magenta() {
        System.out.print("\u001B[35m");
    }
    public static void cyan() {
        System.out.print("\u001B[36m");
    }
    public static void white() {
        System.out.print("\u001B[37m");
    }
}
