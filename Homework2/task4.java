package Homework2;
///4)Составьте программу, вычисляющую A*B, не пользуясь операцией
///        умножения.
public class task4 {
    public static void main(String[] args){
        int a = 5;
        int b = 3;
        int c = 0;
        for(int i = 1; i <= a; i++){
            c += b;
        }
System.out.println(c);
    }
}
