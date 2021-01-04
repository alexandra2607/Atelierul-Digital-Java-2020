package Lab5.challenge2;

public class ShoeDontMatch extends Exception {
    public ShoeDontMatch () {
        super("Wrong params, they must have the same color and the same size");
    }
}
