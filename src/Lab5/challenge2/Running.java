package Lab5.challenge2;

public class Running implements Shoe {
    private String color;
    private int size;

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public int getSize() {
        return size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Running(String color, int size) {
        this.color = color;
        this.size = size;
    }
}
