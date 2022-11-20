package basic_exercises;

public class swap {
    public static void main(String[] args) {
        int var1 = 10, var2 = 20, temp = 0;
        System.out.println("Before swap: " + var1 + ", " + var2);
        temp = var1;
        var1 = var2;
        var2 = temp;

        System.out.println("After swap: " + var1 + ", " + var2);

    }
}
