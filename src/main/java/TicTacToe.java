import java.util.Random;

public class TicTacToe {
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        initializeBoard(board);
        printBoard(board);

        Random random = new Random();

        String humanPlayer = "Human";
        String computerPlayer = "Computer";

        char humanSymbol;
        char computerSymbol;
        String currentPlayer;

        boolean humanStarts = random.nextBoolean();

        if (humanStarts) {
            humanSymbol = 'X';
            computerSymbol = 'O';
            currentPlayer = humanPlayer;
        } else {
            humanSymbol = 'O';
            computerSymbol = 'X';
            currentPlayer = computerPlayer;
        }

        System.out.println("\nToss Result:");
        System.out.println("Human Symbol: " + humanSymbol);
        System.out.println("Computer Symbol: " + computerSymbol);
        System.out.println("First Turn: " + currentPlayer);
    }

    public static void initializeBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = '-';
            }
        }
    }

    public static void printBoard(char[][] board) {
        System.out.println("Empty Tic-Tac-Toe Board:");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}