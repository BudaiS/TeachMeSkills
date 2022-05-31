package Homework3;
/// 5)Создайте 2 массива из 5 случайных целых чисел из отрезка [0;15] каждый,
///        выведите массивы на экран в двух отдельных строках. Посчитайте среднее
///        арифметическое элементов каждого массива и сообщите, для какого из
///        массивов это значение оказалось больше (либо сообщите, что их средние
///        арифметические равны).
///        5) Каждый второй элемент в массиве заполните нулями
import java.util.Random;
public class task5 {
    public static void main(String[] args){
        Random r = new Random();
        int[] mas1 = new int[5];
        int[] mas2 = new int[5];
        double sum1 = 0;
        double sum2 = 0;
        double avg1 = 0;
        double avg2 = 0;
        for(int i = 0; i < mas1.length; i++){
            mas1[i] = r.nextInt(16);
            sum1 += mas1[i];
            System.out.print(mas1[i] + " ");
        }
        System.out.println();
        for(int i = 0; i < mas2.length; i++){
            mas2[i] = r.nextInt(16);
            sum2 += mas2[i];
            System.out.print(mas2[i] + " ");
        }
        System.out.println();
        avg1 = sum1 / mas1.length;
        avg2 = sum2 / mas2.length;
        if(avg1 > avg2){
            System.out.println("The first massive is bigger thet the second one");
        }
        else if(avg1 < avg2){
            System.out.println("The first massive is less then the second one");
        }
        else{
            System.out.println("Massive are equal");
        }
        for(int i = 0; i < mas1.length;i++){
            if(i % 2 != 0){
                mas1[i] = 0;
            }
            System.out.print(mas1[i] + " ");
        }
    }
}
