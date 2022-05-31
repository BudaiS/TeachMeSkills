package Homework3;
/// 3)Создайте массив из 15 случайных целых чисел из отрезка [0; 99]. Выведите
///        массив на экран. Подсчитайте сколько в массиве чётных элементов и выведете
///        это количество на экран на отдельной строке.
/// 3) Найти средне арифметическое элементов массива, превосходящих некоторое число С.
import java.util.Random;
public class task3 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] mass = new int[15];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = r.nextInt(100);
            System.out.print(mass[i] + " ");
        }
        System.out.println(" ");
        int c = 33;  /// некоторое число.... его можно тоже зарамдомить впринципе ))
        int g = 0; /// количество элементов больше чем "c"
        double avg = 0; /// среднее арифметическое
        double sum = 0;
        int num = 0; /// количество четных элементов
        for(int i = 0; i < mass.length; i++){
            if(mass[i] % 2  == 0){
                num++;
            }
            if(mass[i] > c){
                sum += mass[i];
                g++;
            }
        }
        System.out.println("Number of even elements " + num);
        System.out.println(" ");
        avg = sum / g;
        System.out.println("average " + avg);
        }
}

