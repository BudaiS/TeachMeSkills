package Homework3;
import java.util.Random;
/// 8)Создайте два массива из 10 целых случайных чисел из отрезка [0;9] и третий
///        массив из 10 действительных чисел. Каждый элемент с i-ым индексом третьего
///        массива должен равняться отношению элемента из первого массива с i-ым
///        индексом к элементу из второго массива с i-ым индексом. Вывести все три
///        массива на экран (каждый на отдельной строке), затем вывести количество
///        целых элементов в третьем массиве.
///        8) Найти второй по величине (т.е. следующий по величине за максимальным)
public class task8 {
    public static void main(String[] args){
        Random r = new Random();
        int[] mas1 = new int[10];
        int[] mas2 = new int[10];
        double[] mas3 = new double[10];
        for(int i = 0; i < mas1.length; i++){   /// создаем первый массив
            mas1[i] = r.nextInt(10);
            System.out.print(mas1[i] + " ");
        }
        System.out.println();
        for(int i = 0; i < mas2.length; i++){    /// создаем второй массив
            mas2[i] = r.nextInt(10);
            System.out.print(mas2[i] + " ");
        }
        System.out.println();
        for(int i = 0; i < mas3.length; i++){                   /// создаем третий массив
            mas3[i] = (double) mas1[i] / (double) mas2[i];
            System.out.print(mas3[i] + " ");
        }
        int numelem = 0;                                /// переменная подсчета количества целых элементов
        for(int i = 0; i < mas3.length; i++){
            double k = mas3[i] % 1;
            if(k == 0){
                numelem++;
            }
        }
        System.out.println();
        System.out.println("The number of integer elements in the array " + numelem);        //// выводим количесвто целых элементов в третьем массиве
        int tmp;
        int leftSide = 0;
        int rightSide = mas2.length - 1;
        do{                                            /// шейкернул массив, чтобы в дальнейшем найти второй по величине
            for(int i = leftSide; i < rightSide; i++){      /// можно было использовать ArraySort
                if(mas2[i] > mas2[i + 1]){
                    tmp = mas2[i];
                    mas2[i] = mas2[i + 1];
                    mas2[i + 1] = tmp;
                }
            }
            rightSide--;
            for(int i = rightSide; i > leftSide; i--){
                if(mas2[i] < mas2[i - 1]){
                    tmp = mas2[i];
                    mas2[i] = mas2[i - 1];
                    mas2[i - 1] = tmp;
                }
            }
            leftSide++;
        }while (leftSide < rightSide);
        for(int i = 0; i < mas2.length; i++){
            System.out.print(mas2[i] + " ");      /// вывел массив для наглядности
        }
        int nextlargest = 0;
        for(int i = mas2.length - 2; i >= 0; i--){     //// нахожу второй по величине элемент в массиве
            if(mas2[mas2.length - 1] > mas2[i]){
                nextlargest = mas2[i];
                break;
            }
        }
        System.out.println();
        System.out.println("The second largest element in the array " + nextlargest);
    }
}
