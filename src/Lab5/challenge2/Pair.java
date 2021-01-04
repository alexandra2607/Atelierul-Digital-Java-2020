package Lab5.challenge2;

public class Pair <T extends Shoe> {
    private T first;
    private T second;

    public Pair (T firstElement, T secondElement) throws ShoeDontMatch {
        if (!check(firstElement, secondElement)) {
            throw new ShoeDontMatch();
        }
        first = firstElement;
        second = secondElement;

    }

    public T getFirst(){
        return first;
    }

    public T getSecond() {
        return second;
    }

    private boolean check(T shoe1, T shoe2) {
        if (!shoe1.getColor().equals(shoe2.getColor())) {
            return false;
        }
        if (shoe2.getSize() == shoe1.getSize()) {
            return false;
        }
        return true;
    }
}
