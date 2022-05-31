package Homework4;
// Создаём квадратную матрицу, размер вводим с клавиатуры. Заполняем
//        случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде
//        матрицы).
//        1) Почитать сумму четных элементов стоящих на главной диагонали.
//        2)Вывести нечетные элементы находящиеся под главной
//        диагональю(включительно).
//        3)Проверить произведение элементов какой диагонали больше.
//        4)Посчитать сумму четных элементов стоящих над побочной диагональю (не
//        включительно)
//        5)Транспонировать матрицу(1 столбец станет 1-й строкой, 2-й столбец - 2-й
//        строкой и т. д.)
import java.util.Random;
import java.util.Scanner;
public class task1 {
    public static void main(String[] args){
     Random r = new Random();
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the size of the square matrix ");
     System.out.println();
     long mul1 = 1;
     long mul2 = 1;
     int n = 0;
     if(sc.hasNext()){
         n = sc.nextInt();
     }
     int[][] mas = new int[n][n];
     for(int i = 0; i < mas.length; i++){
         for( int j = 0; j < mas.length; j++){
             mas[i][j] = r.nextInt(51);
             System.out.print(mas[i][j] + " ");
         }
         System.out.println();
     }
     System.out.println();
     int sum = 0;
     for(int i = 0; i < mas.length; i++){       // 1. считаю сумму четных элементов на главной диагонали
         if(mas[i][i] % 2 == 0){
             sum += mas[i][i];
         }
         mul1 *= mas[i][i]; // 3. вычисляю произведение элементов на главной диагонали для 3 задачи
        }
     System.out.println("The sum of the even elements on the main diagonal = " + sum);
     System.out.println();
     System.out.println("Odd elements under the main diagonal inclusive");

     for(int i = 0; i < mas.length; i++){       // 2. нахожу нечетные элементы под главной диагональю(включительно)
         for(int j = 0; j < i + 1; j++){
             if(mas[i][j] % 2 == 1){
                 System.out.print(mas[i][j] + " ");
             }
         }
     }
     System.out.println();
     for(int i = 0, j = mas.length- 1; i < mas.length; i++, j--){ // 3. вычисляю произведение элементов на побочной диагонали
         mul2 *= mas[i][j];
     }
        System.out.println();
     if(mul1 > mul2){       // 3. проверяю произведение какой диагонали больше
         System.out.println("The product of the elements of the main diagonal is greater");
     } else if (mul1 < mul2) {
         System.out.println("The product of the side diagonal elements is greater than");
     }else {
         System.out.println("The product of the elements of the diagonals are equal");
     }
     System.out.println();
     int sum1 = 0;
     for(int i = 1; i < mas.length; i++){   // 4. нахожу сумму четных элементов стоящих над побочной диагональю (не включительно)
         for(int j = mas.length - 1; j > mas.length - i - 1; j--){
             if (mas[i][j] % 2 == 0){
                 sum1 += mas[i][j];
             }
         }
     }
     System.out.println("Sum of even elements above the secondary diagonal (not included) = " + sum1);
     System.out.println();
        for (int i = 0; i < n; i++) {  // 5. Трансопртирую матрицу
            for (int j = i + 1; j < n; j++) {
                int tmp = mas[i][j];
                mas[i][j] = mas[j][i];
                mas[j][i] = tmp;
            }
        }
        for(int i = 0; i < mas.length; i++){
            for( int j = 0; j < mas.length; j++){
                System.out.print(mas[i][j] + " "); // 5. Вывожу на экран оттранспортрованную матрицу
            }
            System.out.println();
        }
    }
}
