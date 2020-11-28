package MergeSort;

public class Merge {

    public static void mergeSort(int[] arr, int n) {

        if (n < 2) {
            return;
        }

        int middle = n / 2;
        int[] left = new int[middle];
        int[] right = new int[n - middle];


        for (int i = 0; i < middle; i++) {
            left[i] = arr[i];
        }

        for (int i = middle; i < n; i++) {
            right[i - middle] = arr[i];
        }


        mergeSort(left, middle);

        mergeSort(right, n - middle);

        merge(arr, left, right, middle, n - middle);
    }


    public static void merge(
            int[] arr, int[] lArr, int[] rArr, int left, int right) {

        int i = 0, j = 0, k = 0;

        while (i < left && j < right) {
            if (lArr[i] <= rArr[j]) {
                arr[k++] = lArr[i++];
            }
            else {
                arr[k++] = rArr[j++];
            }
        }

        while (i < left) {
            arr[k++] = lArr[i++];
        }

        while (j < right) {
            arr[k++] = rArr[j++];
        }
    }


    public static void main(String[] args) {
        Merge Arr=new Merge();

        int []arr={0,5,2,3,7,6,8};
        Merge.mergeSort(arr,arr.length);

        for (int a: arr){
            System.out.print(a + " ");
        }
    }

}
