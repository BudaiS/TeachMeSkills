package Homework3;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/// 10)Пользователь вводит с клавиатуры число большее 3, которое сохраняется в
///        переменную n. Если пользователь ввёл не подходящее число, то программа
///        должна выдать соответствующее сообщение. Создать массив из n случайных
///        целых чисел из отрезка [0;n] и вывести его на экран. Создать второй массив
///        только из чётных элементов первого массива, если они там есть, и вывести его
///        на экран.
///        10) Найти максимальный элемент в массиве и поменять его местами с нулевым
///        элементом
public class task10 {
    public static void main(String[] args) {
        int n = 0;
        Random r = new Random();
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter a number greater than 3");
            if (sc.hasNextInt()) {
                n = sc.nextInt();
            } else System.out.println("You didn't enter a number!");
        }
        while (n < 4);
        int c = 0;
        int[] mas = new int[n];
        for (int i = 0; i < n; i++) {
            mas[i] = r.nextInt(n + 1);
            if (mas[i] % 2 == 0) c++;
        }
        System.out.println(Arrays.toString(mas));
        System.out.println();
         int[] mas1 = new int[c];
         int index = 0;
         for (int i = 0; i < n; i++) {
             if (mas[i] % 2 == 0){
                 mas1[index] = mas[i];
                 index++;
                 }
            }
         System.out.println(Arrays.toString(mas1));
         System.out.println();
         int max = mas[0];
         for(int i = 1; i < mas.length; i++){  // нахожу максимальный элемент
             if(mas[i] > max){
                 max = mas[i];
             }
         }
         for(int i = 0; i < mas.length; i++){       // ставлю на место максимального мас0
             if(mas[i] == max){
                 mas[i] = mas[0];
                 break;
             }
         }
         mas[0] = max;      // вместо мас0 ставлю мах элемент
        System.out.println(Arrays.toString(mas));
    }
}


