import java.util.Scanner;
import java.util.Random;

public class Homework12 {
    public static void main(String[] args) {
//      формування початкової матриці
        Random random = new Random();
        int m = 0;
        int n = 0;

        Scanner matrixM = new Scanner(System.in);
        System.out.print("Введіть кількість рядків матриці: ");

        while (true) {
            m = matrixM.nextInt();
            if (m > 0) {
                break;
            }
            else
            System.out.print("Введено некорректне число \n\n");
            System.out.print("Введіть кількість рядків матриці: ");
        }

        Scanner matrixN = new Scanner(System.in);
        System.out.print("Введіть кількість стовбців матриці: ");
        while (true) {
            n = matrixN.nextInt();
            if (n > 0) {
                break;
            }
            else
                System.out.print("Введено некорректне число \n\n");
            System.out.print("Введіть кількість рядків матриці: ");
        }

        int[][] a = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = random.nextInt(100);
            }
        }

//      виведення на екран початкової матриці
        System.out.println("Початкова матриця:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%5d", a[i][j]);
            }
            System.out.println();
        }

//      транспонування матриці
        int[][] transposedA = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                transposedA[i][j] = a[j][i];
            }
        }

//      виведення на екран трансонованої матриці
        System.out.println();
        System.out.println("Транспонована матриця:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%5d", transposedA[i][j]);
            }
            System.out.println();
        }

    }

}
