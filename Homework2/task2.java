package Homework2;
///)Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
///        сколько амеб будет через 3, 6, 9, 12,..., 24 часа.
public class task2 {
    public static void main(String[] args){
        int a = 1;
        for(int hours =3; hours<=24; hours = hours + 3){
    a = a * 2;
    System.out.println(a);
        }
    }
}
