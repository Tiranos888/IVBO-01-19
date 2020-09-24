package Lab_3;

public abstract class Dog {
    private int age,weight,height;
    private String breed,color;

    Dog(int age, int weight, int height,String breed,String color){
        this.age=age;
        this.weight=weight;
        this.height=height;
        this.breed=breed;
        this.color=color;
    }

    public abstract void Bark();

    public abstract void Eat();

    public abstract void Sleep();
}
