import java.util.Arrays;

public class Sumof2arrays {
    public static void main(String[] args) {
        int[] arr1 = {12,3,4,5,6,7};
        int[] arr2 = {9,3,4,6,90,87,67,56 };
        int n=0;
        if(arr1.length>arr2.length)
        {
            n = arr1.length;
        }
        else{
            n = arr2.length;
        }
        int[] arr3 = new int[n];
        int i=0;
        int j=0;
        int k=0;
        while(i<arr1.length && j<arr2.length)
        {
            arr3[k] = arr1[i] + arr2[j];
            i++;
            j++;
            k++;
        }
        while(i<arr1.length)
        {
            arr3[k] = arr1[i];
            i++;
            k++;
        }
        while(j<arr2.length)
        {
            arr3[k] = arr2[j];
            j++;
            k++;
        }
        System.out.println(Arrays.toString(arr3));
    }
}
