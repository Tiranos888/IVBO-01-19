package Package1;

public class Sobaka {
    private int age;
    private String name;
    public Sobaka (int a,String b){
        age=a;
        name=b;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int newAge){
        age=newAge;
    }
    public void setName(String newName){
        name=newName;
    }
    public int ageInHuman(){
        return age*7;
    }
    public String toString(){
        return this.getName()+" "+this.getAge();
    }
}
