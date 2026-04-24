import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int slot = getUserSlot(scanner);
        int[] indexes = convertSlotToIndex(slot);

        System.out.println("Slot: " + slot);
        System.out.println("Row: " + indexes[0]);
        System.out.println("Column: " + indexes[1]);
    }

    public static int getUserSlot(Scanner scanner) {
        int slot;
        do {
            System.out.print("Enter a slot number (1-9): ");
            slot = scanner.nextInt();
        } while (slot < 1 || slot > 9);

        return slot;
    }

    public static int[] convertSlotToIndex(int slot) {
        int position = slot - 1;
        int row = position / 3;
        int col = position % 3;

        return new int[]{row, col};
    }
}