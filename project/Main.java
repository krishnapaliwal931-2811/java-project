import java.util.Scanner;

public class Main {

    public static int add3(int x, int y, int z) {
        return x + y + z;
    }

    public static void showBoard(int[] pX, int[] pO) {
        String[] board = new String[9];
        for (int i = 0; i < 9; i++) {
            if (pX[i] == 1) {
                board[i] = "X";
            } else if (pO[i] == 1) {
                board[i] = "O";
            } else {
                board[i] = String.valueOf(i);
            }
        }

        System.out.println(board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("--|---|--");
        System.out.println(board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("--|---|--");
        System.out.println(board[6] + " | " + board[7] + " | " + board[8]);
    }

    public static int winner(int[] pX, int[] pO) {
        int[][] patterns = {
            {0, 1, 2}, {3, 4, 5}, {6, 7, 8},
            {0, 3, 6}, {1, 4, 7}, {2, 5, 8},
            {0, 4, 8}, {2, 4, 6}
        };

        for (int[] p : patterns) {
            if (add3(pX[p[0]], pX[p[1]], pX[p[2]]) == 3) {
                System.out.println("X wins!");
                return 1;
            }
            if (add3(pO[p[0]], pO[p[1]], pO[p[2]]) == 3) {
                System.out.println("O wins!");
                return 0;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] px = new int[9];
        int[] po = new int[9];
        int turn = 1; // 1 = X, 0 = O

        System.out.println("Tic Tac Toe Game");
        while (true) {
            showBoard(px, po);

            int pos = -1;
            while (true) {
                if (turn == 1) {
                    System.out.print("X, enter position: ");
                } else {
                    System.out.print("O, enter position: ");
                }

                if (!sc.hasNextInt()) {
                    System.out.println("Invalid input! Please enter a number (0-8).");
                    sc.next();
                    continue;
                }

                pos = sc.nextInt();
                if (pos < 0 || pos > 8) {
                    System.out.println("Invalid position! Please choose between 0 and 8.");
                    continue;
                }

                if (px[pos] == 1 || po[pos] == 1) {
                    System.out.println("Position already occupied! Choose an empty spot.");
                    continue;
                }

                break;
            }

            if (turn == 1) {
                px[pos] = 1;
            } else {
                po[pos] = 1;
            }

            int result = winner(px, po);
            if (result != -1) {
                System.out.println("Game Over");
                break;
            }

            // draw check: all 9 cells filled and no winner
            int sum = 0;
            for (int i = 0; i < 9; i++) {
                sum += px[i] + po[i];
            }

            if (sum == 9) {
                System.out.println("It's a draw!");
                System.out.println("Game Over");
                break;
            }

            turn = 1 - turn;
        }
        sc.close();
    }
}
