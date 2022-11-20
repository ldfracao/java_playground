package basic_exercises;

import java.util.Scanner;

public class exercise02 {
    public static void main(String[] args) {

        int[][] matriz = new int[3][3];
        int sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println(matriz.length);
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Enter number: " + i + ", " + j);
                matriz[i][j] = input.nextInt();
                sum += matriz[i][j];
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Soma: " + sum);
        input.close();
    }
}
