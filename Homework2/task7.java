package Homework2;
///7)Напишите программу, определяющую сумму всех нечетных чисел от 1
///        до 99
public class task7 {
    public static void main(String[] args){
        int i = 1;
        int s = 0;
        while(i <= 99){
          s += i;
          i += 2;
        }
        System.out.println(s);
    }
}
