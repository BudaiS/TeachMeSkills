package lesson5;

import java.util.Random;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args)  {
        Student[] mas = new Student[5];
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        String name;
        int mark;
        for(int i = 0; i < 5; i++) {
            System.out.println("Enter name # " + i);
            name = sc.nextLine();
            mark = r.nextInt(11);
            mas[i] = new Student(name, 19, mark);
        }
        for(int i = 0; i < 5; i++) {
            System.out.println("====");
            mas[i].showInfo();
        }
        System.out.println();
        for(int i = 0; i < 5; i++){
            mas[i].showMark();
        }
    }
}
