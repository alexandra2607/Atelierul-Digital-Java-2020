package Lab5.challenge2;

public class Main {
    public static void main(String[] args) {
        Running r1 = new Running("Red", 37);
        Running r2 = new Running("Black",42);
        Boot boot = new Boot("Blue", 32);
        Pair<Running> pair = null;
        try {
            pair = new Pair(r1, boot);
        }catch (ShoeDontMatch ex) {
            try {
                pair = new Pair<>(r1, r2);
            } catch(ShoeDontMatch e) {
                System.out.println("don't match");
            }
        }

    }
}
