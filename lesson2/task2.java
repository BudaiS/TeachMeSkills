package lesson2;
///Задача: «С помощью цикла while посчитать сумму четных элементов от 10 до 55».
public class task2 {
    public static void main(String[] args){
        int i = 10, s = 0;
        while(i < 55){
            s += i;
            i+=2;
        }
        System.out.println(s);
    }
}
