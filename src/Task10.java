import java.util.Arrays;

public class Task10 {
    public static void Сount_arrays1() {
        int[] arr_a = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(arr_a));
        for (int i = 0; i < arr_a.length; i++) {
            if (arr_a[i] == 0) {
                arr_a[i] = 1;
            } else if (arr_a[i] == 1) {
                arr_a[i] = 0;

            }


        }
        System.out.println(Arrays.toString(arr_a));

    }
}





