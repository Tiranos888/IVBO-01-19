package Lab_4;

public class Bread implements Priceable {
    private int prise=2;

    @Override
    public int getPrice() {
        return prise;
    }
}
