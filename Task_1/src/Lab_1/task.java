package Lab_1;
import java.util.Arrays;
import java.util.Scanner;

public class task {
    private int[]array={1,2,3,5,7,8,0,12,6,5};

    public int forSum(){
        int sum=0;
        for (int i=0;i< array.length;i++){
            sum=sum+array[i];
        }
        return sum;
    }

    public int whileSum(){
        int sum=0;
        int i=0;
        while(i< array.length){
            sum=sum+array[i];
            i++;
        }
        return sum;
    }

    public int doWhileSum(){
        int sum=0;
        int i=0;
        do{
            sum=sum+array[i];
            i++;
        }while(i<array.length);
        return sum;
    }

    public static int getFactorial(int f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }

    public static void main(String[] args){
        task cl1=new task();
        System.out.println(cl1.forSum()+" "+cl1.whileSum()+" "+cl1.doWhileSum());
        Scanner sc=new Scanner(System.in);

        for (int i=0;i< args.length;i++) {
            System.out.println(args[i]);
        }

        for (float i=1;i<11;i++){
            System.out.print(1/i);
            System.out.print(" ");
        }

        int[] arr=new int[5];
        System.out.println();
        for(int i=0;i<arr.length;i++){
            arr[i]= (int) (Math.random()*10);

            System.out.print(arr[i]+" ");
        }
        Arrays.sort(arr);
        System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        int f=2;
        System.out.println();
        System.out.println(getFactorial(f));
    }
}
