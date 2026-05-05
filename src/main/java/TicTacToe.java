import java.util.Random;

public class TicTacToe {

    static char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };

    static boolean isHumanTurn = true;
    static boolean gameOver = false;

    public static void main(String[] args) {

        while (!gameOver) {

            if (isHumanTurn) {
                humanMove();
            } else {
                computerMove();
            }

            printBoard();

            if (checkWin() || checkDraw()) {
                gameOver = true;
            } else {
                isHumanTurn = !isHumanTurn;
            }
        }
    }

    static void humanMove() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    board[i][j] = 'X';
                    return;
                }
            }
        }
    }

    static void computerMove() {
        Random rand = new Random();
        int row, col;

        while (true) {
            int slot = rand.nextInt(9) + 1;
            row = (slot - 1) / 3;
            col = (slot - 1) % 3;

            if