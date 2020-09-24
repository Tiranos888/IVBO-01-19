package Lab_3;

public class ShopTest {
    public static void main(String[] args) {

        Milk milk = new Milk();
        Cookie cookie = new Cookie();
        Bread bread = new Bread();
        Egg egg = new Egg();
        System.out.println("Totall cost: " + (milk.getPrice() + bread.getPrice() + cookie.getPrice() + egg.getPrice()));
/*
    Bulldog dog1=new Bulldog(3,43,20,"Bulldog","grey");
    dog1.Bark();
    Terrier dog2=new Terrier(5,28,25,"Terrier","pink");
    dog2.Bark();

    dog1.Sleep();
    dog2.Sleep();
    }
    */
    }
}


