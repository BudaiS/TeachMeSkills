package Homework3;
import java.util.Random;
/// 7)Создайте массив из 12 случайных целых чисел из отрезка [0;15]. Определите
///        какой элемент является в этом массиве максимальным и сообщите индекс его
///        последнего вхождения в массив.
///        7) Подсчитать, сколько раз встречается элемент с заданным значением.
public class task7 {
    public static void main(String[] args){
        Random r = new Random();
        int[] mas = new int[12];
        for(int i = 0; i < mas.length; i++){
            mas[i] = r.nextInt(16);
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        int max = mas[0];
        int b = 0;
        for(int i = 0; i < mas.length; i++){
            if(max <= mas[i]){
                    b = i;
                    max = mas[i];
            }
        }
        System.out.println("index " + b);
        int num = 0;
        for(int i = 0; i < mas.length; i++){        /// проверка сколько раз 'max' встречается в массиве
            if(mas[i] == max){
                num++;
            }
        }
        System.out.println("An element with a given value occurs " + num + " once");
    }
}

