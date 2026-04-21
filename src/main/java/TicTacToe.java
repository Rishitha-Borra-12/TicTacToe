import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int slot = getUserSlot(scanner);

        System.out.println("You selected slot: " + slot);
    }

    public static int getUserSlot(Scanner scanner) {
        System.out.print("Enter a slot number (1-9): ");
        int slot = scanner.nextInt();
        return slot;
    }
}