package lesson4;
/// найти минимальное значение четных строк
public class task1 {
    public static void main(String[] args) {
        int[][] mass = {{ 95, 26, 8 }, { 94, 55, 86 }, { 77, 28, 19 }};
        int min = 0;
        int a = mass[0][0];
        for(int i = 0; i < mass.length; i+=2){
            for(int j = 0; j < mass[i].length; j++){
                if(a > mass[i][j]){
                    a = mass[i][j];
                }
            }
            min = a;
        }
        System.out.println(min);
    }
}

