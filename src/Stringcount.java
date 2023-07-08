import java.util.ArrayList;
import java.util.Arrays;

public class Stringcount {
    public static void main(String[] args) {
        String s = "karan kumar asdfakjshf sdfjhskjgk akj";
        String[] arr2 = s.split(" ");
        int[] arr = new int[arr2.length];
        for(int i=0;i< arr2.length;i++)
        {
            arr[i] = arr2[i].length();
        }
        for(int i=0;i<arr2.length;i++)
        {
            for(int j=i+1;j<arr2.length;j++)
            {
                if(arr[i]<arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                    String temp1 = arr2[i];
                    arr2[i] = arr2[j];
                    arr2[j] = temp1;
                }
            }
        }
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr));
        int n = 2;
        int length = arr2[n-1].length();
        System.out.println(length);

        for(int i=0;i<arr.length;i++)
        {
            //System.out.println(arr[i]);
            if(length == arr[i])
            {
                System.out.println(arr2[i]);
            }
            else{
                System.out.println(arr2[n-1]);
            }
        }
    }
}
