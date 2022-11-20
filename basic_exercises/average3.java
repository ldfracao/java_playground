package basic_exercises;

import java.util.Scanner;

public class average3 {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner input = new Scanner(System.in);
        System.out.println("First number: ");
        num1 = input.nextInt();
        System.out.println("Second number: ");
        num2 = input.nextInt();
        System.out.println("Third number :");
        num3 = input.nextInt();
        System.out.println("Average: " + (num1 + num2 + num3) / 3);
        input.close();
    }
}
