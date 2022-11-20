package basic_exercises;

import java.util.Scanner;

public class bin2dec {
    public static void main(String[] args) {

        int binnum = 0, i = 0, sum = 0;
        int remainder[] = new int [20];
        Scanner input = new Scanner(System.in);
        System.out.println("Input a bin number: ");
        binnum = input.nextInt();
        input.close();

        while (binnum != 0) {
            remainder[i] = binnum % 10;
            binnum /= 10;
            
            if (remainder[i] == 1){
                sum = sum + (int) Math.pow(2, i);
            }
            i++;
        }
        System.out.println("Decimal: " + sum);

    }
}
