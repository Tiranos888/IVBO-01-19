package Lab_4;

public class Cookie implements Priceable {
    private int prise=15;

    @Override
    public int getPrice() {
        return prise;
    }
}
