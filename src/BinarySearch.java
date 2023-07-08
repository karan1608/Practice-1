import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Numbers of Elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int first =0;
        int last = arr.length -1;
        int mid = (first+last)/2;
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter the Search Key: ");
        int key = sc.nextInt();
        while(first<=last)
        {
            if(arr[mid]<key)
            {
                first = mid +1;
            }
            else if(arr[mid] == key)
            {
                System.out.println("Element found at the index: "+ (mid+1));
                break;
            }
            else{
                last = mid -1;
            }
            mid = (first+last)/2;
        }
        if(first>last)
        {
            System.out.println("Element Not Found");
        }
    }
}
