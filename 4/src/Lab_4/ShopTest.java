package Lab_4;

public class ShopTest {
    public static void main(String[] args) {
    Milk milk=new Milk();
    Cookie cookie=new Cookie();
    Bread bread=new Bread();
    Egg egg=new Egg();
    System.out.println("Totall cost: "+(milk.getPrice()+bread.getPrice()+ cookie.getPrice()+ egg.getPrice()));
    }
}
