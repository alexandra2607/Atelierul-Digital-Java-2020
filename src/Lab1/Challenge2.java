package Lab1;

import java.util.concurrent.atomic.AtomicInteger;

public class Challenge2 {
    static int reverse(int a) {
        int reversed = 0;
        while (a!=0) {
            reversed = reversed * 10 + a % 10;
            a = a/10;
        }
        return reversed;
    }

    static String compute(int a) {
        int ct = 0;
        String s = "";
        if((a) % 3 == 0) {
            s += "Foo";
            ct ++;
        }
        if ((a) % 5 == 0) {
            s += "Bar";
            ct ++;
        }
        if ((a) % 7 == 0) {
            s +="Qix";
            ct ++;
        }
        int ca = a;
        int reversed = 0;
        while (a!=0) {
            reversed = reversed * 10 + a % 10;
            a = a/10;
        }

        while (reversed != 0) {
            if (reversed % 10 == 3) {
                s += "Foo";
                ct ++;
            }
            if (reversed % 10 == 5) {
                s += "Bar";
                ct ++;
            }
            if (reversed % 10 == 7) {
                s += "Qix";
                ct ++;
            }
            reversed = reversed /10;
        }

        if (ct > 0)
            return s;
        else {
            return String.format("%d",ca);
        }
    }

    static String compute2(int a) {
        int ct = 0;
        String s = "";
        if((a) % 3 == 0) {
            s += "Foo";
            ct ++;
        }
        if ((a) % 5 == 0) {
            s += "Bar";
            ct ++;
        }
        if ((a) % 7 == 0) {
            s +="Qix";
            ct ++;
        }

        int ca = a;
        int reversed = 0;
        while (a!=0) {
            reversed = reversed * 10 + a % 10;
            a = a/10;
        }

        while (reversed != 0) {
            if (reversed % 10 == 0) {
                s += '*';
            }
            if (reversed % 10 == 3) {
                s += "Foo";
                ct ++;
            }
            if (reversed % 10 == 5) {
                s += "Bar";
                ct ++;
            }
            if (reversed % 10 == 7) {
                s += "Qix";
                ct ++;
            }
            reversed = reversed /10;
        }
        String stra = Integer.toString(ca);
        stra = stra.replace('0', '*');
        if (ct > 0)
            return s;
        else {
            return stra;
        }
    }



    public static void main(String[] args) {

        int a = 33;
        int b = 15;
        int c = 7;
        int d = 53;
        int e = 10;
        int f = 8;
        System.out.println(a + " => " + compute(a));
        System.out.println(b + " => " +compute(b));
        System.out.println(c + " => " +compute(c));
        System.out.println(d + " => " +compute(d));
        System.out.println(e + " => " +compute(e));
        System.out.println(f + " => " +compute(f));

        int g = 101;
        int h = 303;
        int i = 105;
        int j = 10101;
        System.out.println(g + " => " +compute2(g));
        System.out.println(h + " => " +compute2(h));
        System.out.println(i + " => " +compute2(i));
        System.out.println(j + " => " +compute2(j));

    }
}
