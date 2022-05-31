package Homework2;
///8) И ещё можете попрактиковаться и нарисовать оставшиеся 2
///        треугольника
public class task8 {
    public static void main(String[] args){
        int index=4;
        for(int i=0;i<=index-1;i++) {
            for(int j=0;j<=index-i-1;j++) {
                System.out.print(" ");
            }
            for(int k=index-i; k<=index;k++){
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");
        for(int i=0;i<=index-1;i++) {
            for(int j=0;j<=i;j++) {
                System.out.print(" ");
            }
            for(int k=i; k<=index-1;k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

