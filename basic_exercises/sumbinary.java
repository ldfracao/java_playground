package basic_exercises;

import java.util.Scanner;

public class sumbinary {
    public static void main(String[] args) {

        int binary1, binary2;
        int remainder = 0, i = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("First number: ");
        binary1 = input.nextInt();
        System.out.println("Second number: ");
        binary2 = input.nextInt();
        int[] sum = new int[20];
        input.close();

        for (; binary1 != 0 || binary2 != 0; i++) {
            sum[i] = ((binary1 % 10 + binary2 % 10 + remainder) % 2);
            remainder = ((binary1 % 10 + binary2 % 10 + remainder) / 2);
            binary1 = binary1 / 10;
            binary2 = binary2 / 10;
            
        }
        if (remainder != 0){
            sum[i] = remainder;
        }
        while (i >= 0) {
            System.out.print(sum[i--]);
        }
        
    }
}