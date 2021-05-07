
import java.util.*;

class jSnake {

    // Check for apple
    public static boolean checkApple(int x, int y, char[][] grid) {
        if(grid[x][y] == 'O') {
            return true;
        }
        return false;
    }

    // Check for collision
    public static boolean check(int x, int y, char[][] grid) {
        if(x < 0 || x > 9 || y < 0 || y > 9 || grid[x][y] == '#') {
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
    
    // Fake Loading Animation (Duration: 1s ~ 15s)
    public static void loadingAnimation() {
        System.out.println("   Loading...");
        System.out.print("   ");
        for(int i = 0; i < random.nextInt(15); i++) {
            System.out.print("~ ");
            try {
				Thread.sleep(500);
			} catch (Exception e) {
				banner();
                System.out.println("   [ Error Occured ]");
	            System.out.println("   " + e);
	            System.exit(1);
			}
        }
    }

    public static void main(String[] args) {

        // Variable declarations
        Scanner input = new Scanner(System.in);
        Random random = new Random();
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
        grid[X][Y] = '@';
        int score = 1;

        while (true) {

            // Print banner
            banner();

            // Set random apple on grid
            if(!apple) {
                int appleX = random.nextInt(10);
                int appleY = random.nextInt(10);
                while(grid[appleX][appleY] == '#' || grid[appleX][appleY] == '@') {
                    appleX = random.nextInt(10);
                    appleY = random.nextInt(10);
                }
                grid[appleX][appleY] = 'O';
                apple = true;
            }

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
            String currentScore = score + "";
            System.out.print("   | Score    : " + score);
            for (int i = 0; i < 9 - currentScore.length(); i++) {
                System.out.print(" ");
            }
            System.out.println("|");
            System.out.println("   +---------------------+");

            // Ask for next move
            System.out.print("   > ");
            String choice = input.next();

            // Do the magic!
            switch (choice) {

                case "d":
                    if(check(X + 1, Y, grid)) break;
                    if(checkApple(X + 1, Y, grid)) {
                        score++;
                        apple = false;
                    }
                    grid[X][Y] = '.';
                    grid[X + 1][Y] = '@';
                    X = X + 1;
                    break;

                case "q":
                    if(check(X - 1, Y, grid)) break;
                    if(checkApple(X - 1, Y, grid)) {
                        score++;
                        apple = false;
                    }
                    grid[X][Y] = '.';
                    grid[X - 1][Y] = '@';
                    X = X - 1;
                    break;

                case "z":
                    if(check(X, Y - 1, grid)) break;
                    if(checkApple(X, Y - 1, grid)) {
                        score++;
                        apple = false;
                    }
                    grid[X][Y] = '.';
                    grid[X][Y - 1] = '@';
                    Y = Y - 1;
                    break;

                case "s":
                    if(check(X, Y + 1, grid)) break;
                    if(checkApple(X, Y + 1, grid)) {
                        score++;
                        apple = false;
                    }
                    grid[X][Y] = '.';
                    grid[X][Y + 1] = '@';
                    Y = Y + 1;
                    break;
                    
                // Don't you love me?? Am sure you do!
                // Well in case you don't, what about 1000 points :)
                case "ilovejihed":
                    for(int i = 0; i < 1000; i++) {
                        try {
				            Thread.sleep(5);
				            score++;
				            clearScreen();
				            banner();
				            printGrid(grid, X, Y, score);
			            } catch (Exception e) {
			                banner();
                            System.out.println("   [ Error Occured ]");
		                    System.out.println("   " + e);
		                    System.exit(1);
                        }
                    }
                        clearScreen();
                        banner();
                        System.out.println("   Good job! You found a fazzoura xD");
                        System.out.println("   Check jihedkdiss.github.io!");
                        try {
                            Thread.sleep(4000);
                        } catch (Exception e) {
                            banner();
                            System.out.println("   [ Error Occured ]");
			                System.out.println("   " + e);
			                System.exit(1);
                        }
                    break;
                    
                // Don't you love azizos??
                // Well I'm not very sure about that but, anyway... :)
                case "iloveazizos":
                    for(int i = 0; i < 100; i++) {
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
                    System.out.println("   Check azizamari.github.io!");
                    try {
                        Thread.sleep(2000);
                    } catch (Exception e) {
                        banner();
                        System.out.println("   [ Error Occured ]");
			                  System.out.println("   " + e);
			                  System.exit(1);
                    }
                
                // This will set score to 0 and generate new positions
                case "restart":
                    clearScreen();
                    grid[X][Y] = '.';
                    X = random.nextInt(10);
                    Y = random.nextInt(10);
                    grid[X][Y] = '@';
                    grid[appleX][appleY] = '.';
                    int appleY = random.nextInt(10);
                    int appleX = random.nextInt(10);
                    while(grid[appleX][appleY] == '@') {
                        appleX = random.nextInt(10);
                        appleY = random.nextInt(10);
                    }
                    grid[appleX][appleY] = 'O';
                    score = 0;

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
