package Lab1;

import sun.security.util.ArrayUtil;

import java.util.Arrays;

public class Challenge3 {

    public static void main(String[] args) {
        int ct = 0;
        int[] arr = new int[]{1, 1, 0, -1, -1};
        for (int i = 0; i < arr.length -1; i++) {
            for (int j = i + 1; j < arr.length; j++){
                if ( (arr[i] + arr[j]) == 0) {
                    ct ++;
                    for(int k = i; k < arr.length; k ++) {
                        arr[i] = arr[i+1];
                        arr[j] = arr[j+1];
                    }
                    System.out.println("After removing: "+ Arrays.toString(arr));
                    j = arr.length;
                }
            }
        }
        System.out.println(ct);
    }
}
