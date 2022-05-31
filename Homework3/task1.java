package Homework3;
/// 1)Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы
///        массива на экран сначала в строку, отделяя один элемент от другого пробелом, а
///        затем в столбик (отделяя один элемент от другого началом новой строки). Перед
///        созданием массива подумайте, какого он будет размера
/// 1) Найти произведение элементов, кратных 3.
public class task1 {
    public static void main(String[] args) {
        int size = 0;
        for (int i = 2; i <= 20; i += 2) {            /// вычисляю размер массива
            size++;
        }
        int[] mass = new int[size];
        for (int i = 0, j = 2; i < mass.length; i++, j += 2) {
            mass[i] = j;
            System.out.print(mass[i] + " ");
        }
        System.out.println(" ");
        System.out.println(" ");
        int a = 1;
        for (int i = 0; i < mass.length; i++) {    /// вычисляю произведение элементов кратных трем
            if (mass[i] % 3 == 0) {
                a *= mass[i];
            }
            System.out.println(mass[i]);
        }
        System.out.println(" ");
        System.out.println(a);
    }
}