package Homework2;
///1)Начав тренировки, спортсмен в первый день пробежал 10 км. Каждый
///       день он увеличивал дневную норму на 10% нормы предыдущего дня. Какой
///        суммарный путь пробежит спортсмен за 7 дней?
public class task1 {
    public static void main(String[] args){
        int days  = 1;
        double distance = 10;
        double totaldistance = 0;
        while (days <= 7){
            totaldistance += distance;
            distance = distance + (distance * 0.1);
            days++;
        }
        System.out.println(totaldistance);
    }
}
