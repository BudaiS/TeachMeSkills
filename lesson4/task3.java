package lesson4;
/// Выбрать наибольшие элементы в строках из матрицы и сложить их
public class task3 {
    public static void main(String[] args) {
        int[][] mass = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int sum = 0;
        int max = mass[0][0];
        for(int i = 0; i < mass.length; i++){
            max = mass[i][0];
            for(int j = 1; j < mass[i].length; j++){
                if(max < mass[i][j]){
                    max = mass[i][j];
                }
            }
            sum += max;
        }
        System.out.println(sum);
    }
}
