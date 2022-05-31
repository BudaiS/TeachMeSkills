package lesson4;
///Задание: найдите максимальное значение в 2-мерном массиве.
import java.util.Random;
import java.util.Scanner;
public class task2 {
    public static void main(String[] args){
        System.out.println("Введите размер массива NxM");
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int n = 0;
        int m = 0;
        if(sc.hasNext()){
            n = sc.nextInt();
            m = sc.nextInt();
        }
        int[][] mass = new int[n][m];
        int max = mass[0][0];
        for(int i = 0; i < mass.length; i++){
            for(int j = 0; j < mass[i].length; j++){
                mass[i][j] = r.nextInt(9);
                if(mass[i][j] > max){
                    max = mass[i][j];
                }
                System.out.print(mass[i][j] + " ");
            }
            System.out.println(" ");
        }
        int sum = mass[0][0];
        System.out.println(max);
    }
}
