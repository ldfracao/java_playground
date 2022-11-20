package basic_exercises;

import java.util.Scanner;

public class dec2hex {
    public static void main(String[] args) {

        int num = 0, remainder = 0;
        char [] hex = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F',};
        String hexnum="";
        Scanner input = new Scanner(System.in);
        System.out.println("Input dec number: ");
        num = input.nextInt();
        while (num != 0) {
            remainder = num % 16;
            hexnum = hex[remainder] + hexnum;
            num /= 16;
        }
        input.close();
        System.out.println("Hex: " + hexnum);
    }
}
