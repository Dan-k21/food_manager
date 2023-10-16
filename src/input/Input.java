package input;

import java.util.Scanner;

public class Input {
    public static Scanner input = new Scanner(System.in);

    public static int getInputInt() {
        int number;
        while (true) {
            try {
                number = Integer.parseInt(input.nextLine());
                return number;
            } catch (NumberFormatException exception) {
                System.out.print("Vui lòng nhập số: ");
            }
        }
    }
    public static String getInputString() {
        return input.nextLine();
    }
}
