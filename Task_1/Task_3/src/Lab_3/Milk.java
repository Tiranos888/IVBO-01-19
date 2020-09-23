package Lab_3;

public class Milk implements Priceable {
    private int prise=4;

    @Override
    public int getPrice() {
        return prise;
    }
}
