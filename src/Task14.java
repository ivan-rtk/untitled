import java.util.Arrays;

public class Task14 {
    public static int[] Returning_arrays1(int len, int initialValue){
       int[] arr = new int[len];
       for (int i = 0; i < len; i++){
           arr[i] = initialValue;
            }

       System.out.println(Arrays.toString(arr));
       return arr;
    }


}









//
//        Написать метод, принимающий на вход два аргумента: len и initialValue, и
//возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue.