import java.util.Arrays;
import java.util.stream.IntStream;

public class Task13 {

    public static void Two_dimensional_array1(){
        int dimension = 5;
        int[][] arr_a = new int[dimension][dimension];
        //int i = 0;
        IntStream.range(0, dimension).forEach(i -> {
            arr_a[i][i] = 1;
            arr_a[i][arr_a.length - 1 - i] = 1;
        });
        Arrays.stream(arr_a).map(Arrays::toString).forEach(System.out::println);
        }
}







//13. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
//и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
//Определить элементы одной из диагоналей можно по следующему принципу:
//индексы таких элементов равны, то есть [0][0], [1][1], [2][2], ..., [n][n];