
import java.util.Scanner;

class Main {

    // Check for collision
    public static boolean check(int x, int y) {
        if(x < 0 || x > 9 || y < 0 || y > 9) {
            return true;
        }
        return false;
    }

    // Print banner
    public static void banner() {
        System.out.println(
            "     _ ____              _\n"             +
            "    (_) ___| _ __   __ _| | _____\n"      +
            "    | \\___ \\| '_ \\ / _` | |/ / _ \\\n" +
            "    | |___) | | | | (_| |   <  __/\n"     +
            "   _/ |____/|_| |_|\\__,_|_|\\_\\___|\n"  +
            "  |__/        Coded by @jihedkdiss\n"
        );
    }

    public static void main(String[] args) {

        // Variable declarations
        Scanner input = new Scanner(System.in);
        char grid[][] = new char[10][10];

        // Fill the grid with empty dots
        for (int y = 0; y < 10; y++) {
            for (int x = 0; x < 10; x++) {
                grid[x][y] = '.';
            }
        }

        // Set cursor and position
        grid[0][0] = 'X';
        int X = 0;
        int Y = 0;
        int score = 0;

        while (true) {

            // Print banner
            banner();

            // Print the current grid
            System.out.println("   +---------------------+");
            for (int y = 0; y < 10; y++) {
                System.out.print("   |");
                for (int x = 0; x < 10; x++) {
                    System.out.print(" " + grid[x][y]);
                }
                System.out.print(" |\n");
            }
            System.out.println("   +---------------------+");

            // Print current location
            System.out.println("   | Current X: " + X + "        |");
            System.out.println("   | Current Y: " + Y + "        |");
            System.out.println("   | Score    : " + score + "        |");
            System.out.println("   +---------------------+");

            // Ask for next move
            System.out.print("   > ");
            String choice = input.next();

            // Do the magic!
            switch (choice) {

                case "d":
                    if(check(X + 1, Y)) break;
                    grid[X][Y] = '.';
                    grid[X + 1][Y] = 'X';
                    X = X + 1;
                    break;

                case "q":
                    if(check(X - 1, Y)) break;
                    grid[X][Y] = '.';
                    grid[X - 1][Y] = 'X';
                    X = X - 1;
                    break;

                case "z":
                    if(check(X, Y - 1)) break;
                    grid[X][Y] = '.';
                    grid[X][Y - 1] = 'X';
                    Y = Y - 1;
                    break;

                case "s":
                    if(check(X, Y + 1)) break;
                    grid[X][Y] = '.';
                    grid[X][Y + 1] = 'X';
                    Y = Y + 1;
                    break;

                case "exit":
                    System.exit(0);

            }

            // Clear the console
            try {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } catch (Exception e) {
                System.exit(0);
            }
            
        }
    }
}
