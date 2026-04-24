public class TicTacToe {

    public static void main(String[] args) {
        char[][] board = {
                {'X', '-', '-'},
                {'-', 'O', '-'},
                {'-', '-', '-'}
        };

        int row = 1;
        int col = 0;

        if (isValidMove(board, row, col)) {
            System.out.println("Valid move");
        } else {
            System.out.println("Invalid move");
        }
    }

    public static boolean isValidMove(char[][] board, int row, int col) {
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }

        if (board[row][col] != '-') {
            return false;
        }

        return true;
    }
}