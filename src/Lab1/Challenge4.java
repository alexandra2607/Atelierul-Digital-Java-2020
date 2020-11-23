package Lab1;

import java.util.Arrays;

public class Challenge4 {

    public static void main(String[] args) {
        int ct = 0;
        int[] arr = new int[]{-1, -1, -1, 2};
        for (int i = 0; i < arr.length -2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++){
                for( int m = j+1; m < arr.length; m++) {
                    if ((arr[i] + arr[j] + arr[m]) == 0) {
                        ct++;
                        System.arraycopy(arr, m + 1, arr, m, arr.length - m - 1);
                        System.arraycopy(arr, j + 1, arr, j, arr.length - j - 1);
                        System.arraycopy(arr, i + 1, arr, i, arr.length - i - 1);
                        m = arr.length;
                    }
                }
            }
        }
        System.out.println(ct);
    }
}
