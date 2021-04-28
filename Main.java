
import java.util.Scanner;

class Main {

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

        while (true) {

            // Print the current grid
            System.out.println("+---------------------+");
            for (int y = 0; y < 10; y++) {
                System.out.print("|");
                for (int x = 0; x < 10; x++) {
                    if (x != 9) {
                        System.out.print(" " + grid[x][y]);
                    } else {
                        System.out.print(" " + grid[x][y] + " ");
                    }
                }
                System.out.print("|\n");
            }
            System.out.println("+---------------------+");

            // Print cuurent location
            System.out.println("| Current X: " + X + "        |");
            System.out.println("| Current Y: " + Y + "        |");
            System.out.println("+---------------------+");

            // Ask for next move
            System.out.print("> ");
            String choice = input.next(); // TODO: add check for exception

            // Do the magic!
            switch (choice) {
                case "d":
                    grid[X][Y] = '.';
                    grid[X + 1][Y] = 'X';
                    X = X + 1;
                    break;
                case "q":
                    grid[X][Y] = '.';
                    grid[X - 1][Y] = 'X';
                    X = X - 1;
                    break;
                case "z":
                    grid[X][Y] = '.';
                    grid[X][Y - 1] = 'X';
                    Y = Y - 1;
                    break;
                case "s":
                    grid[X][Y] = '.';
                    grid[X][Y + 1] = 'X';
                    Y = Y + 1;
                    break;
                case "exit":
                    System.exit(0);
            }

            // Clear the console (supposed that it's 120*80 by default)
            for (int z = 0; z < 14; z++) {
                System.out.println();
            }
        }
    }
}
