package jcolors;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Introduction
        Scanner input = new Scanner(System.in);
        System.out.print(fgColorsStrong.blue("Welcome to jColors! "));
        System.out.println(styles.inverse(fgColorsStrong.blue("v1.0")));
        System.out.println(fgColorsStrong.blue(styles.underline("Developed by Jihed Kdiss")));
        System.out.println();
        System.out.println(fgColorsStrong.cyan(styles.inverse("Enter preview text (or press enter for default)")));
        inputColorsStrong.cyan();
        System.out.print(">> ");
        String preview = input.nextLine();
        inputColorsStrong.close();
        System.out.println();

        if (preview.equals("")) {
            // Styles
            System.out.println(styles.bold("This is bold text"));
            System.out.println(styles.underline("This is underlined text"));
            System.out.println(styles.inverse("This is inversed text"));
            System.out.println();

            // Foreground Colors
            System.out.println(fgColors.black("This is black text") + " (black)");
            System.out.println(fgColors.red("This is red text"));
            System.out.println(fgColors.green("This is green text"));
            System.out.println(fgColors.yellow("This is yellow text"));
            System.out.println(fgColors.blue("This is blue text"));
            System.out.println(fgColors.magenta("This is magenta text"));
            System.out.println(fgColors.cyan("This is cyan text"));
            System.out.println(fgColors.white("This is white text"));
            System.out.println();

            // Background Colors
            System.out.println(bgColors.black("This is black text") + " (black)");
            System.out.println(bgColors.red("This is red text"));
            System.out.println(bgColors.green("This is green text"));
            System.out.println(bgColors.yellow("This is yellow text"));
            System.out.println(bgColors.blue("This is blue text"));
            System.out.println(bgColors.magenta("This is magenta text"));
            System.out.println(bgColors.cyan("This is cyan text"));
            System.out.println(bgColors.white("This is white text"));
            System.out.println();

            // Strong Foreground Colors
            System.out.println(fgColorsStrong.black("This is black text") + " (black)");
            System.out.println(fgColorsStrong.red("This is red text"));
            System.out.println(fgColorsStrong.green("This is green text"));
            System.out.println(fgColorsStrong.yellow("This is yellow text"));
            System.out.println(fgColorsStrong.blue("This is blue text"));
            System.out.println(fgColorsStrong.magenta("This is magenta text"));
            System.out.println(fgColorsStrong.cyan("This is cyan text"));
            System.out.println(fgColorsStrong.white("This is white text"));
            System.out.println();

            // Strong Background Colors
            System.out.println(bgColorsStrong.black("This is black text") + " (black)");
            System.out.println(bgColorsStrong.red("This is red text"));
            System.out.println(bgColorsStrong.green("This is green text"));
            System.out.println(bgColorsStrong.yellow("This is yellow text"));
            System.out.println(bgColorsStrong.blue("This is blue text"));
            System.out.println(bgColorsStrong.magenta("This is magenta text"));
            System.out.println(bgColorsStrong.cyan("This is cyan text"));
            System.out.println(bgColorsStrong.white("This is white text"));
            System.out.println();
        } else {
            // Styles
            System.out.println(styles.bold(preview));
            System.out.println(styles.underline(preview));
            System.out.println(styles.inverse(preview));
            System.out.println();

            // Foreground Colors
            System.out.println(fgColors.black(preview));
            System.out.println(fgColors.red(preview));
            System.out.println(fgColors.green(preview));
            System.out.println(fgColors.yellow(preview));
            System.out.println(fgColors.blue(preview));
            System.out.println(fgColors.magenta(preview));
            System.out.println(fgColors.cyan(preview));
            System.out.println(fgColors.white(preview));
            System.out.println();

            // Background Colors
            System.out.println(bgColors.black(preview));
            System.out.println(bgColors.red(preview));
            System.out.println(bgColors.green(preview));
            System.out.println(bgColors.yellow(preview));
            System.out.println(bgColors.blue(preview));
            System.out.println(bgColors.magenta(preview));
            System.out.println(bgColors.cyan(preview));
            System.out.println(bgColors.white(preview));
            System.out.println();

            // Strong Foreground Colors
            System.out.println(fgColorsStrong.black(preview));
            System.out.println(fgColorsStrong.red(preview));
            System.out.println(fgColorsStrong.green(preview));
            System.out.println(fgColorsStrong.yellow(preview));
            System.out.println(fgColorsStrong.blue(preview));
            System.out.println(fgColorsStrong.magenta(preview));
            System.out.println(fgColorsStrong.cyan(preview));
            System.out.println(fgColorsStrong.white(preview));
            System.out.println();

            // Strong Background Colors
            System.out.println(bgColorsStrong.black(preview));
            System.out.println(bgColorsStrong.red(preview));
            System.out.println(bgColorsStrong.green(preview));
            System.out.println(bgColorsStrong.yellow(preview));
            System.out.println(bgColorsStrong.blue(preview));
            System.out.println(bgColorsStrong.magenta(preview));
            System.out.println(bgColorsStrong.cyan(preview));
            System.out.println(bgColorsStrong.white(preview));
            System.out.println();
        }

    }
}
