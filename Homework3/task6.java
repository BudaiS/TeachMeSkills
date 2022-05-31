package Homework3;
/// 6)Создайте массив из 4 случайных целых чисел из отрезка [0;10], выведите его
///        на экран в строку. Определить и вывести на экран сообщение о том, является ли
///        массив строго возрастающей последовательностью.
///        6) Проверить, различны ли все элементы массива.
import java.util.Random;
public class task6 {
    public static void main(String[] args){
        Random r = new Random();
        int[] mas = new int[4];
        for(int i = 0; i < mas.length; i++){
            mas[i] = r.nextInt(11);
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        for(int i = 1; i < mas.length; i++){
            if(mas[i - 1] > mas[i]){
                System.out.println("The array is not a strictly increasing sequence");
                break;
            }
            if(i == mas.length - 1){
                System.out.println("The array is a strictly increasing sequence");
            }
        }
        System.out.println();
        int tmp;
        int leftSide = 0;
        int rightSide = mas.length - 1;
        do{
            for(int i = leftSide; i < rightSide; i++){
            if(mas[i] > mas[i + 1]){
                tmp = mas[i];
                mas[i] = mas[i + 1];
                mas[i + 1] = tmp;
            }
        }
            rightSide--;
            for(int i = rightSide; i > leftSide; i--){
                if(mas[i] < mas[i - 1]){
                    tmp = mas[i];
                    mas[i] = mas[i - 1];
                    mas[i - 1] = tmp;
                }
            }
            leftSide++;
        }while (leftSide < rightSide);
        for(int i = 1; i < mas.length; i++){  /// проверка различнв ли все элементы
            if(mas[i-1] == mas[i]){
                System.out.println("Array elements are not distinct");
                break;
            }
            if(i == mas.length -1){
                System.out.println("All array elements are different");
            }
}
    }
}