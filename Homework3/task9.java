package Homework3;
import java.util.Random;
import java.util.Scanner;
/// 9)Пользователь должен указать с клавиатуры положительное число, а
///        программа должна создать массив указанного размера из случайных целых
///        чисел из [0;15] и вывести его на экран в строку. После этого программа должна
///        определить и сообщить пользователю о том, сумма какой половины массива
///        больше: левой или правой, либо сообщить, что эти суммы модулей равны. Если
///        пользователь введёт неподходящее число, то выдать соответствующее
///        сообщение
///        9) Найти наименьший элемент среди элементов с четными индексами массива
public class task9 {
    public static void main(String[] args){
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a positive number");
        int size = sc.nextInt();
        if(size <= 0){
            System.out.println("You entered a non-positive number");
        }
        int[] mas = new int[size];
        for(int i = 0; i < size; i++){
            mas[i] = r.nextInt(16);
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        int sum1 = 0;
        for(int i = 0; i < size / 2; i++){
            sum1 += mas[i];
        }
        int sum2 = 0;
        double a = size;
        for(int i = mas.length - 1; i >= a / 2; i--){
            sum2 += mas[i];
        }
        if(sum1 > sum2){
            System.out.println("The sum of the left half of the array is greater than the right");
        } else if (sum1 < sum2) {
            System.out.println("The sum of the right half of the array is greater than the left");
        }else{
            System.out.println("The sum of the left and right halves of the array are equal");
        }
        int min = mas[0];
        int b = mas[0];
        for(int i = 2; i < mas.length; i++){        /// нахожу наименьший элемент среди четных индексов
            double k = i % 2;
            if(k == 0){
                b = mas[i];
            }
            if(min > b){
                min = b;
            }
        }
        System.out.println("smallest element = " + min);
    }
}