import java.util.Arrays;

public class Quicksort {
    static void sort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }

        int s1 = low;
        int e1 = high;
        //int mid = s1 + (e1 - s1) / 2;
        int pivot = arr[low];

        while (s1 <= e1) {
            while (arr[s1] < pivot) {
                s1++;
            }
            while (arr[e1] > pivot) {
                e1--;
            }

            if (s1 <= e1) {
                int temp = arr[s1];
                arr[s1] = arr[e1];
                arr[e1] = temp;
                s1++;
                e1--;
            }
        }
        sort(arr, low, e1);
        sort(arr, s1, high);
    }


    public static void main(String[] args) {
        int[] arr = {5,9,10,8,24,89,1,7};
        sort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
}
