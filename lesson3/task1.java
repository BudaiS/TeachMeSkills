package lesson3;
///Задача: задан массив
///        int[] mas = {25, 47, 34, 18, 96, 33, 28, 55, 87, 13}
///        Найти максимальное и минимальное значения и вывести на экран.
public class task1 {
    public static void main(String[] args) {
        int[] mas = {25, 47, 34, 18, 96, 33, 28, 55, 87, 13};
        int minvalue = mas[0];
        int maxvalue = mas[0];
        for (int i = 1; i < mas.length; i++) {
            if (minvalue > mas[i]){
                minvalue = mas[i];
            }
            if (maxvalue < mas[i]){
                maxvalue = mas[i];
            }
        }
        System.out.println("minimum value = " + minvalue + " maximum value = " + maxvalue);
    }
}