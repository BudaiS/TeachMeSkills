package Homework4;
// Разработать консольную игру крестики-нолики. В игре участвуют 2 игрока. Они
//        по очереди вводят координаты клетки в которую хотят сделать ход. После
//        каждого хода, в консоли отрисовывается игровое поле с текущим состоянием.
//        Игра продолжается до победы одного из игроков или ничьи.
import java.util.Scanner;
public class task2 {
    public static void  main(String[] args){
        System.out.println("Below is the table of coordinates");
        String[][] mas = {{"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"}};
        for(int i = 0; i < mas.length; i++){
            for(int j = 0; j < mas.length; j++){
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        Scanner sc = new Scanner(System.in);
        String player1;
        String player2;
        System.out.print("Player 1 Please enter you name ");
        player1 = sc.next();
        System.out.println();
        System.out.print("Player 2 Please enter you name ");
        player2 = sc.next();
        System.out.println();
        String[][] mas2 = {{"*", "*", "*"}, {"*", "*", "*"}, {"*", "*", "*"}};
        int size = 0;
        while(size < 5){
            int a;
            System.out.println(player1 + " Enter the number according to the coordinate table ");
            a = sc.nextInt();
            if(a == 1)mas2[0][0] = "X";
            if(a == 2)mas2[0][1] = "X";
            if(a == 3)mas2[0][2] = "X";
            if(a == 4)mas2[1][0] = "X";
            if(a == 5)mas2[1][1] = "X";
            if(a == 6)mas2[1][2] = "X";
            if(a == 7)mas2[2][0] = "X";
            if(a == 8)mas2[2][1] = "X";
            if(a == 9)mas2[2][2] = "X";
            System.out.println();
            for(int i = 0; i < mas2.length; i++){
                for(int j = 0; j < mas2.length; j++){
                    System.out.print(mas2[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
            if((mas2[0][0] == "X" & mas2[0][1] == "X" & mas2[0][2] == "X") ||
                    (mas2[1][0] == "X" & mas2[1][1] == "X" & mas2[1][2] == "X") ||
                    (mas2[2][0] == "X" & mas2[2][1] == "X" & mas2[2][2] == "X") ||
                    (mas2[0][0] == "X" & mas2[1][0] == "X" & mas2[2][0] == "X") ||
                    (mas2[0][1] == "X" & mas2[1][1] == "X" & mas2[2][1] == "X") ||
                    (mas2[0][2] == "X" & mas2[1][2] == "X" & mas2[2][2] == "X") ||
                    (mas2[0][0] == "X" & mas2[1][1] == "X" & mas2[2][2] == "X") ||
                    (mas2[0][2] == "X" & mas2[1][1] == "X" & mas2[2][0] == "X")) {
                System.out.println("Congratulations!!! " + player1 + " You have won!!!");
                break;
            }
            size++;
            if(size > 4){
                System.out.println("Draw!!!");
                break;
            }
            int b;
            System.out.println(player2 + " Enter the number according to the coordinate table ");
            b = sc.nextInt();
            if(b == 1)mas2[0][0] = "0";
            if(b == 2)mas2[0][1] = "0";
            if(b == 3)mas2[0][2] = "0";
            if(b == 4)mas2[1][0] = "0";
            if(b == 5)mas2[1][1] = "0";
            if(b == 6)mas2[1][2] = "0";
            if(b == 7)mas2[2][0] = "0";
            if(b == 8)mas2[2][1] = "0";
            if(b == 9)mas2[2][2] = "0";
            System.out.println();
            for(int i = 0; i < mas2.length; i++){
                for(int j = 0; j < mas2.length; j++){
                    System.out.print(mas2[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
            if((mas2[0][0] == "0" & mas2[0][1] == "0" & mas2[0][2] == "0") ||
                    (mas2[1][0] == "0" & mas2[1][1] == "0" & mas2[1][2] == "0") ||
                    (mas2[2][0] == "0" & mas2[2][1] == "0" & mas2[2][2] == "0") ||
                    (mas2[0][0] == "0" & mas2[1][0] == "0" & mas2[2][0] == "0") ||
                    (mas2[0][1] == "0" & mas2[1][1] == "0" & mas2[2][1] == "0") ||
                    (mas2[0][2] == "0" & mas2[1][2] == "0" & mas2[2][2] == "0") ||
                    (mas2[0][0] == "0" & mas2[1][1] == "0" & mas2[2][2] == "0") ||
                    (mas2[0][2] == "0" & mas2[1][1] == "0" & mas2[2][0] == "0")) {
                System.out.println("Congratulations!!! " + player2 + " You have won!!!");
                break;
            }
        }
    }
}
