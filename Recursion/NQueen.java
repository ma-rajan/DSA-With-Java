

public class NQueen {
    static final int N = 4;
    static void printBoard(int board[][]) {
        for (int i = 0; i < N; i++) {
          for (int j = 0; j < N; j++) {
            System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    static boolean isSafe(int board[][], int row, int col) {
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 1)
                return false;
        }
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
          if (board[i][j] == 1)
             return false;
        }
        for (int i = row, j = col; i >= 0 && j < N; i--, j++) {
            if (board[i][j] == 1)
                return false;
        }
        return true;
    }
    static boolean solve(int board[][], int row) {

        if (row == N) {
            printBoard(board);
            return true;
        }

        boolean res = false;

        for (int col = 0; col < N; col++) {

            if (isSafe(board, row, col)) {

                board[row][col] = 1;

                res = solve(board, row + 1) || res;

                board[row][col] = 0; // backtrack
            }
        }
        return res;
    }

    public static void main(String args[]) {
        int board[][] = new int[N][N];
        solve(board, 0);
    }
}

