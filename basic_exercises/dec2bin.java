package basic_exercises;

import java.util.Scanner;

public class dec2bin {
    public static void main(String[] args) {
        int i = 0, num = 0;
        int [] binary = new int [20];
        Scanner input = new Scanner(System.in);
        System.out.println("Input a number: ");
        num = input.nextInt();

        while (num != 0) {
            binary[i] = num % 2;
            num /= 2;
            i++;
        }
        System.out.print("Binary: ");
        while(i >= 0){
            System.out.print(binary[i]);
            i--;
        }
        input.close();

    }
}
