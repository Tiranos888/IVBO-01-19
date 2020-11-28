package Lab7;

import java.util.ArrayList;

public class Task_ArrayList {

    public static void main(String[] args) {
        ArrayList<String> Array=new ArrayList<String>();

        Array.add("Blue");
        Array.add("Green");
        Array.add("Red");
        Array.add("Yellow");

        System.out.println("Color on 1 index is "+Array.get(1));
        Array.set(1,"Pink");
        System.out.println("Change color on 1 index to pink");
        System.out.println("Color on 1 index is "+Array.get(1));

        System.out.println("There are "+Array.size()+" colors");

        if (Array.contains("Red")){
            Array.remove(2);
        }

        Object[] colors=Array.toArray();
        for (Object i: colors){
            System.out.println(i);
        }
    }
}
