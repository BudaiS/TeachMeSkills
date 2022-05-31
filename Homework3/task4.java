package Homework3;
import java.util.Random;
/// 4)Создайте массив из 20 случайных целых чисел из отрезка [0;20]. Выведите
///        массив на экран в строку. Замените каждый элемент с нечётным индексом на
///        ноль. Снова выведете массив на экран на отдельной строке.
///        4) Найти наименьший нечетный элемент.
public class task4 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] mass = new int[20];
        int c = 0;
        for (int i = 0; i < mass.length; i++) {         /// создаю массив
            mass[i] = r.nextInt(21);
            System.out.print(mass[i] + " ");
        }
        int b = 0;  // нахожу максимальное значение
        for(int i = 0; i < mass.length; i++){
            if(mass[i] > b){
                b = mass[i];
            }
        }
        int min = b;
        for (int i = 0; i < mass.length; i++) {   /// нахожу наименьший нечетный элемент
            if(mass[i] % 2 != 0){
                c = mass[i];
                if (c < min) {
                    min = c;
                }
            }
        }
        System.out.println(" ");
        for (int i = 0; i < mass.length; i++){      /// меняю каждый элемент с нечетным индексом на ноль
            if(i % 2 != 0){
                mass[i] = 0;
            }
            System.out.print(mass[i] + " ");
        }
        System.out.println();
        System.out.println(min);
    }
}