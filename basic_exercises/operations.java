package basic_exercises;

import java.util.Scanner;

public class operations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = 0, num2 = 0;
        System.out.println("First number: ");
        num1 = input.nextInt();
        System.out.println("Second number: ");
        num2 = input.nextInt();
        System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
        System.out.println(num1 + " x " + num2 + " = " + (num1*num2));
        System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
        System.out.println(num1 + " mod " + num2 + " = " + (num1%num2));
        input.close();
    }
}
