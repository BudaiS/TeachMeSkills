package Homework2;
/// 5)Напишите программу печати таблицы перевода расстояний из дюймов в
///        сантиметры для значений длин от 1 до 20 дюймов. 1 дюйм = 2,54 см

public class task {
    public static void main(String[] args){
        double inch = 1;
        for(int i = 1; i <= 20; i++){
            inch = i;
            System.out.println(inch + " Inch = " + inch * 2.54 + " centimeter");
    }

    }
}