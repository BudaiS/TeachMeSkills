package Homework3;
///2)Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в
///        строку, а затем этот же массив выведите на экран тоже в строку, но в обратном
///        порядке (99 97 95 93 ... 7 5 3 1).
///2) Найти среднее арифметическое элементов с нечетными номерами.
public class task2 {
    public static void main(String[] args) {
        int size = 0;
        for(int i = 1; i <= 99; i+=2){          /// вычисляю размер массива
            size++;
        }
        int[] mas = new int[size];
        for (int i = 0, j = 1; i < mas.length; j += 2, i ++){
            mas[i] = j;
            System.out.print(mas[i] + " ");
        }
        System.out.println(" ");
        int sum = 0;
        double avg = 0;
        for(int i = mas.length - 1; i >= 0; i--){
            sum += mas[i];
            System.out.print(mas[i] + " ");
        }
        System.out.println(" ");
        avg = sum / size;
        System.out.println(avg);
    }
}