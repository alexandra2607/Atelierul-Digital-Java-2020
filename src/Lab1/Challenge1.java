package Lab1;

public class Challenge1 {

    public static void main(String[] args) {
        System.out.println("Challenge1");
        for(int i = 0; i < 100; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//            }else if (i % 3 == 0) {
//                System.out.println("fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("buzz");
//            } else {
//                System.out.println(i);
//            }
            if (i % 3 != 0 && i % 5 !=0) {
                System.out.print(i);
            }
            if (i % 3 == 0) {
                System.out.print("fizz");
            }
            if (i % 5 == 0) {
                System.out.print("buzz");
           }
            System.out.print(',');
        }
    }
}
