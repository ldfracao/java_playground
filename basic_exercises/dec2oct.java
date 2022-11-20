package basic_exercises;

import java.util.Scanner;

public class dec2oct {
    public static void main(String[] args) {

        int num = 0, i = 0, j;
        int array[] = new int [20];
        Scanner input = new Scanner(System.in);
        System.out.println("Input dec number: ");
        num = input.nextInt();
        input.close();

        while (num != 0) {
            array[i++] = num % 8;
            num /= 8;
        }
        System.out.println("Octal: ");
        for (j = i - 1; j >= 0; j--) {
            System.out.print(array[j]);
        }
        System.out.println();
    }
}

