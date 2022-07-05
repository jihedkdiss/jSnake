import java.util.*;
import jcolors.*;

class jSnake {

    // Check if the next move is an apple
    public static boolean checkApple(int x, int y, char[][] grid) {
        if (grid[x][y] == 'o') {
            return true;
        }
        return false;
    }

    // Print the formatted grid with current location & score
    public static void printGrid(char[][] grid, int X, int Y, int score) {
        // Print the grid and walls
        System.out.println("   +---------------------+");
        for (int y = 0; y < 10; y++) {
            System.out.print("   |");
            for (int x = 0; x < 10; x++) {
                System.out.print(" " + grid[x][y]);
            }
            System.out.print(" |\n");
        }
        System.out.println("   +---------------------+");

        // Print current location & score
        System.out.println("   | Current X: " + X + "        |");
        System.out.println("   | Current Y: " + Y + "        |");
        String currentScore = score + "";
        System.out.print("   | Score    : " + score);
        for (int i = 0; i < 9 - currentScore.length(); i++) {
            System.out.print(" ");
        }
        System.out.println("|");
        System.out.println("   +---------------------+");
    }

    // Check if the next move is outside the grid
    public static boolean checkWall(int x, int y, char[][] grid) {
        if (x < 0 || x > 9 || y < 0 || y > 9 || grid[x][y] == '#') {
            return true;
        }
        return false;
    }

    // Print loading animation with random duration
    public static void loadingAnimation() {
        System.out.println("   Loading...");
        System.out.print("   ");
        for (int i = 0; i < random.nextInt(15); i++) {
            System.out.print("~ ");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                banner();
                System.out.println("   " + e);
                System.exit(1);
            }
        }
    }

    // Clear terminal screen depending on the Operating System
    public static void clearScreen() {
        if (System.getProperty("os.name").equals("Linux")) {
            try {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            } catch (Exception e) {
                banner();
                System.out.println("   [ Error Occured ]");
                System.out.println("   " + e);
                System.exit(1);
            }
        } else if (System.getProperty("os.name").contains("Windows")) {
            try {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } catch (Exception e) {
                banner();
                System.out.println("   " + e);
                System.exit(1);
            }
        } else {
            System.out.println("   [ Error Occured ]");
            System.out.println("   System not recognised. Leaving...");
            System.exit(1);
        }
    }

    // Print banner
    public static void banner() {
        String banner = "     _ ____              _\n" +
                        "    (_) ___| _ __   __ _| | _____\n" +
                        "    | \\___ \\| '_ \\ / _` | |/ / _ \\\n" +
                        "    | |___) | | | | (_| |   <  __/\n" +
                        "   _/ |____/|_| |_|\\__,_|_|\\_\\___|\n" +
                        "  |__/        Coded by @jihedkdiss\n";
        banner = fgColors.yellow(banner);
        System.out.println(banner);
    }

    // Randomness generator
    static Random random = new Random();

    public static void main(String[] args) {

        // jColors setup
        jcolors.setup();

        // Variable declarations
        Scanner input = new Scanner(System.in);
        char grid[][] = new char[10][10];
        boolean apple = false;

        // Fill the grid with empty dots
        for (int y = 0; y < 10; y++) {
            for (int x = 0; x < 10; x++) {
                grid[x][y] = '.';
            }
        }

        // Set cursor and position
        int X = random.nextInt(10);
        int Y = random.nextInt(10);
        int appleX = random.nextInt(10);
        int appleY = random.nextInt(10);
        grid[X][Y] = '@';
        int score = 0;

        // Loading animation at the beginning
        clearScreen();
        banner();
        loadingAnimation();
        clearScreen();

        // Do the magic!
        while (true) {

            // Print banner
            banner();

            // Set random apple on grid
            if (!apple) {
                appleX = random.nextInt(10);
                appleY = random.nextInt(10);
                while (grid[appleX][appleY] == '@') {
                    appleX = random.nextInt(10);
                    appleY = random.nextInt(10);
                }
                grid[appleX][appleY] = 'o';
                apple = true;
            }

            // Print the current grid
            printGrid(grid, X, Y, score);

            // Ask for next move
            inputColors.yellow();
            System.out.print("   > ");
            String choice = input.next();
            inputColors.close();

            // Check user input and perform move
            switch (choice) {

                case "d":
                    if (checkWall(X + 1, Y, grid)) break;
                    if (checkApple(X + 1, Y, grid)) {
                        score++;
                        apple = false;
                    }
                    grid[X][Y] = '.';
                    grid[X + 1][Y] = '@';
                    X = X + 1;
                    break;

                case "q":
                    if (checkWall(X - 1, Y, grid)) break;
                    if (checkApple(X - 1, Y, grid)) {
                        score++;
                        apple = false;
                    }
                    grid[X][Y] = '.';
                    grid[X - 1][Y] = '@';
                    X = X - 1;
                    break;

                case "z":
                    if (checkWall(X, Y - 1, grid)) break;
                    if (checkApple(X, Y - 1, grid)) {
                        score++;
                        apple = false;
                    }
                    grid[X][Y] = '.';
                    grid[X][Y - 1] = '@';
                    Y = Y - 1;
                    break;

                case "s":
                    if (checkWall(X, Y + 1, grid)) break;
                    if (checkApple(X, Y + 1, grid)) {
                        score++;
                        apple = false;
                    }
                    grid[X][Y] = '.';
                    grid[X][Y + 1] = '@';
                    Y = Y + 1;
                    break;

                case "D":
                    if (checkWall(X + 1, Y, grid)) break;
                    if (checkApple(X + 1, Y, grid)) {
                        score++;
                        apple = false;
                    }
                    grid[X][Y] = '.';
                    grid[X + 1][Y] = '@';
                    X = X + 1;
                    break;

                case "Q":
                    if (checkWall(X - 1, Y, grid)) break;
                    if (checkApple(X - 1, Y, grid)) {
                        score++;
                        apple = false;
                    }
                    grid[X][Y] = '.';
                    grid[X - 1][Y] = '@';
                    X = X - 1;
                    break;

                case "Z":
                    if (checkWall(X, Y - 1, grid)) break;
                    if (checkApple(X, Y - 1, grid)) {
                        score++;
                        apple = false;
                    }
                    grid[X][Y] = '.';
                    grid[X][Y - 1] = '@';
                    Y = Y - 1;
                    break;

                case "S":
                    if (checkWall(X, Y + 1, grid)) break;
                    if (checkApple(X, Y + 1, grid)) {
                        score++;
                        apple = false;
                    }
                    grid[X][Y] = '.';
                    grid[X][Y + 1] = '@';
                    Y = Y + 1;
                    break;

                // You love me, right?
                // You don't!? Well, what about 100 points??
                case "ilovejio":
                    for (int i = 0; i < 100; i++) {
                        try {
                            Thread.sleep(10);
                            score++;
                            clearScreen();
                            banner();
                            printGrid(grid, X, Y, score);
                        } catch (Exception e) {
                            banner();
                            System.out.println("   " + e);
                            System.exit(1);
                        }
                    }
                    clearScreen();
                    banner();
                    System.out.println("   Good job! You found a fazzoura xD");
                    System.out.println("   Check jihedkdiss.ml!");
                    try {
                        Thread.sleep(4000);
                    } catch (Exception e) {
                        banner();
                        System.out.println("   " + e);
                        System.exit(1);
                    }
                    break;

                // You love azizos, right?
                // You don't!? Well, what about 50 points??
                case "iloveazizos":
                    for (int i = 0; i < 50; i++) {
                        try {
                            Thread.sleep(10);
                            score++;
                            clearScreen();
                            banner();
                            printGrid(grid, X, Y, score);
                        } catch (Exception e) {
                            banner();
                            System.out.println("   " + e);
                            System.exit(1);
                        }
                    }
                    clearScreen();
                    banner();
                    System.out.println("   Good job! You found a fazzoura xD");
                    System.out.println("   Check azizamari.tn!");
                    try {
                        Thread.sleep(4000);
                    } catch (Exception e) {
                        banner();
                        System.out.println("   " + e);
                        System.exit(1);
                    }
                    break;

                // This will restart the game
                case "restart":
                    clearScreen();
                    grid[X][Y] = '.';
                    X = random.nextInt(10);
                    Y = random.nextInt(10);
                    grid[X][Y] = '@';
                    grid[appleX][appleY] = '.';
                    appleY = random.nextInt(10);
                    appleX = random.nextInt(10);
                    while (grid[appleX][appleY] == '@') {
                        appleX = random.nextInt(10);
                        appleY = random.nextInt(10);
                    }
                    grid[appleX][appleY] = 'o';
                    score = 0;
                    break;

                case "exit":
                    clearScreen();
                    System.exit(0);
                    break;

            }

            // Clear the console
            clearScreen();
            
        }
    }
}
