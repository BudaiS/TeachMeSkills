package lesson3;
///Задача: организовать ввод массива из потока ввода (клавиатуры) с использованием класса Scanner.
///        Размер массива и его элементы ввести с клавиатуры с использованием класса Scanner.
import java.util.Scanner;
public class task2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = sc.nextInt();
        int[] mas = new int[size];
        for(int i = 0; i < size; i++){
            System.out.println("Введите число");
            mas[i] = sc.nextInt();
        }
    }
}
