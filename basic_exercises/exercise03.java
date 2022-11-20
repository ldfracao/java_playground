package basic_exercises;

public class exercise03 {
    public static void main(String[] args) {
        int [][] matriz = {{12, 55, 6, 34, 77}, {98, 66, 43, 32, 7}, {21, 45, 53, 20, 11}};
        int small = matriz[0][0];
        int index1 = 0, index2 = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] < small) {
                    small = matriz[i][j];
                    index1 = i;
                    index2 = j;
                }
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("O menor número é: " + small);
        System.out.println("Sua posição na matriz é: " + index1 + ", " + index2 );

    }
    
}
