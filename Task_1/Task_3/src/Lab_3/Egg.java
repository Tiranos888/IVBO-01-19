package Lab_3;

public class Egg implements Priceable {
    private int prise=1;

    @Override
    public int getPrice() {
        return prise;
    }
}
