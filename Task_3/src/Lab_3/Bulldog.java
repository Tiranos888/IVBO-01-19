package Lab_3;

public class Bulldog extends Dog {

    Bulldog(int age, int weight, int height,String breed,String color){
        super(age,weight,height,breed,color);
    }

    @Override
    public void Bark() {
        System.out.println("WOOF WOOF");
    }

    @Override
    public void Eat() {
        System.out.println("MMMMMF");
    }

    @Override
    public void Sleep() {
        System.out.println("ZZzzZZZzzzZ");
    }
}
