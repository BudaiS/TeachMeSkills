package lesson4;
// Задание: найдите сумму элементов на главной диагонали.
import java.util.Random;
import java.util.Scanner;
public class task4 {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array NxM");
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int n = 0;
        int m = 0;
        int sum = 0;
        if (sc.hasNext()) {
            n = sc.nextInt();
            m = sc.nextInt();
        }
        int[][] mass = new int[n][m];
        for (int i = 0; i < mass.length; i++) {
            for(int j = 0; j < mass.length; j++){
                mass[i][j] = r.nextInt(10);
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
            sum += mass[i][i];

        }
        System.out.println();
        System.out.println("Sum of elements on the main diagonal = " + sum);
    }
}
