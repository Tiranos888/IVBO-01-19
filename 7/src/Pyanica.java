import java.util.LinkedList;
import java.util.Queue;

public class Pyanica {

    public static String pyanica(int []arr1, int []arr2){
        int turns=0;
        Queue <Integer> Hand1= new LinkedList<Integer>();
        Queue <Integer> Hand2=new LinkedList<Integer>();

        for (int i=0;i< arr1.length;i++){
            Hand1.add(arr1[i]);
        }

        for (int i=0;i< arr2.length;i++){
            Hand2.add(arr2[i]);
        }

        while (turns<106){

            if (Hand1.size()==0){
                return ("first "+turns);
            }

            if (Hand2.size()==0){
                return ("second "+turns);
            }

            if (Hand1.peek()>Hand2.peek()){
                if (Hand1.peek()==9 & Hand2.peek()==0){
                    Hand1.add(Hand2.poll());
                    Hand1.add(Hand1.poll());
                    System.out.println("added to first");
                    turns++;
                    continue;
                }
                Hand2.add(Hand1.poll());
                Hand2.add(Hand2.poll());
            } else {
                if (Hand2.peek()==9 & Hand1.peek()==0){
                    Hand2.add(Hand1.poll());
                    Hand2.add(Hand2.poll());
                    System.out.println("added to second");
                    turns++;
                    continue;
                }
                Hand1.add(Hand2.poll());
                Hand1.add(Hand1.poll());
            }


            turns++;
        }
        return ("botva");
    }

    public static void main(String[] args) {
        int [] hand1=new int[]{1,3,5,7,9};
        int [] hand2=new int[]{2,4,6,8,0};

        System.out.println(pyanica(hand1,hand2));
    }

}
