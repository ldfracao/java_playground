package basic_exercises;

import java.util.Scanner;

public class exercise01 {
    public static void main(String[] args) {

        float[][] notas = new float[5][4];
        int apro_count = 0, rep_count = 0;
        Scanner input = new Scanner(System.in);
        System.out.println(notas.length);
        
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                System.out.println("Enter number: " + i + ", " + j);
                notas[i][j] = input.nextFloat();
                System.out.println(notas[j].length);
                if (notas[i][j] >= 7)
                    apro_count++;
                else
                    rep_count++;
            }
        }
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[j].length; j++) {
                System.out.print(notas[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Total de aprovados: " + apro_count);
        System.out.println("Total de reprovados: " + rep_count);
        input.close();
    }
}
