package Lab6.challenge1;

import java.sql.Array;
import java.util.*;

public class Main {
    public static void displayLeaders(List<Integer> list) {
        Collections.reverse(list);
        Iterator<Integer> it = list.iterator();
        Integer currentElement = null;
        Integer max = null;
        while (it.hasNext()) {
            currentElement = it.next();
            if(currentElement > max) {
                System.out.println(currentElement + " ");
                max = currentElement;
            }
        }
    }
    public static void main(String[] args) {
        displayLeaders(Arrays.asList(1,5,11,2,9,7,2,5,4,1));
    }
}
