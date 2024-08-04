import java.util.Arrays;

public class Task12 {
    public static void Multiplier(){
        int[] arr_a = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arr_a));
        for (int i = 0; i < arr_a.length; i++) {
            if (arr_a[i] < 6){
                arr_a[i] =arr_a[i]*2;

            }

        }
        System.out.println(Arrays.toString(arr_a));
    }
}










//
//12. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;