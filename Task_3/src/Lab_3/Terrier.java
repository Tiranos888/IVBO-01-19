package Lab_3;

public class Terrier extends Dog {

    Terrier(int age, int weight, int height,String breed,String color){
        super(age,weight,height,breed,color);
    }

    @Override
    public void Bark() {
        System.out.println("woof");
    }

    @Override
    public void Eat() {
        System.out.println("grrrrr");
    }

    @Override
    public void Sleep() {
        System.out.println("zzzzz");
    }
}
