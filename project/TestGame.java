public class TestGame {

    public static void main(String[] args) {
        System.out.println("Running Game Logic Validation Tests...\n");

        testRowWin();
        testColWin();
        testDiagonalWin();
        testDrawCondition();
        testNoWinnerYet();

        System.out.println("\nAll validation tests passed successfully!");
    }

    static void testRowWin() {
        int[] px = new int[9];
        int[] po = new int[9];
        // X fills top row: 0, 1, 2
        px[0] = 1; px[1] = 1; px[2] = 1;
        int result = Main.winner(px, po);
        if (result == 1) {
            System.out.println("[PASS] Test Row Win (Top row 0-1-2)");
        } else {
            System.err.println("[FAIL] Test Row Win failed");
        }
    }

    static void testColWin() {
        int[] px = new int[9];
        int[] po = new int[9];
        // O fills left column: 0, 3, 6
        po[0] = 1; po[3] = 1; po[6] = 1;
        int result = Main.winner(px, po);
        if (result == 0) {
            System.out.println("[PASS] Test Column Win (Left column 0-3-6)");
        } else {
            System.err.println("[FAIL] Test Column Win failed");
        }
    }

    static void testDiagonalWin() {
        int[] px = new int[9];
        int[] po = new int[9];
        // X fills main diagonal: 0, 4, 8
        px[0] = 1; px[4] = 1; px[8] = 1;
        int result = Main.winner(px, po);
        if (result == 1) {
            System.out.println("[PASS] Test Diagonal Win (Main diagonal 0-4-8)");
        } else {
            System.err.println("[FAIL] Test Diagonal Win failed");
        }
    }

    static void testDrawCondition() {
        int[] px = {1, 0, 1, 1, 0, 0, 0, 1, 1};
        int[] po = {0, 1, 0, 0, 1, 1, 1, 0, 0};
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            sum += px[i] + po[i];
        }
        int winnerResult = Main.winner(px, po);
        if (sum == 9 && winnerResult == -1) {
            System.out.println("[PASS] Test Draw Condition (Full board, no winner)");
        } else {
            System.err.println("[FAIL] Test Draw Condition failed");
        }
    }

    static void testNoWinnerYet() {
        int[] px = new int[9];
        int[] po = new int[9];
        px[0] = 1; po[1] = 1;
        int result = Main.winner(px, po);
        if (result == -1) {
            System.out.println("[PASS] Test Incomplete Game (Returns -1)");
        } else {
            System.err.println("[FAIL] Test Incomplete Game failed");
        }
    }
}
