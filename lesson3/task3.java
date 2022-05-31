package lesson3;
/// Задача: организовать генерацию массива с использованием класса Random.
///        Размер массива ввести с клавиатуры с использованием класса Scanner.
import java.util.Random;
import java.util.Scanner;
public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.println("Введите размер массива");
        int size = sc.nextInt();
        int[] mas = new int[size];
        for (int i = 0; i < size; i++) {
            mas[i] = r.nextInt(11);
            System.out.print(mas[i] + " ");
        }
    }
}
