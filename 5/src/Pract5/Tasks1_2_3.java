package Pract5;

public class Tasks1_2_3 {

    public void recursion1(int n){

        for (int i=1;i<=n;i++){

            for(int j=0;j<i;j++){
                System.out.print(i);
            }
        }
    }

    public int reсursion2(int k,int buf){
        if (k==buf) {
            return 0;
        }
        System.out.print(buf);
        buf++;
        return reсursion2(k,buf);
    }

    public int reсursion3(int a,int b){
        if (a==b) {
            System.out.print(b);
            return 0;
        }
        if (a>b){
            System.out.print(a+" ");
            a--;
        } else {
            System.out.print(a+" ");
            a++;
        }

        return reсursion3(a,b);
    }

}
