package lesson5;

import java.util.Random;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        String name;
        int age;
        int feed;
        Cat[] mas = new Cat[5];
        for(int i = 0; i < mas.length; i++){
            System.out.println("Enter name cat # " + i);
            name = sc.next();
            age = r.nextInt(15);
            feed = r.nextInt(11);
            mas[i] = new Cat(name, age, feed);
        }
        for(int i = 0; i < mas.length; i++){
            System.out.println("===");
            mas[i].showInfoCat();
        }
        System.out.println();
        for(int i = 0; i < mas.length; i++){
            mas[i].Feeding();
        }
    }
}
