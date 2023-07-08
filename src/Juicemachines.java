import java.util.Arrays;
import java.util.Scanner;

public class Juicemachines {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int h=0;
        int k=0;
        int[] arr = new int[n];
        int[] arr1 = new int[n/2];
        int[] arr2 = new int[n/2];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i=i+2)
        {
            arr1[h] = arr[i];
            h++;
        }
        for(int j=1;j<arr.length;j=j+2)
        {
            arr2[k] = arr[j];
            k++;
        }
        int sum=0;
        int count=0;
        int count1=0;
        for(int i=0;i<arr1.length;i++)
        {
            if(arr1[i]>arr2[i] && sum>=0)
            {
                sum = sum + (arr1[i] - arr2[i]);
                //System.out.println(sum);
                count++;
                System.out.println(count);
            }
            else {
                count1++;
            }
        }
        for(int i=0;i<count1;i++)
        {
            sum = sum + (arr1[i] - arr2[i]);
            //System.out.println(sum);
            }
        if(sum>=0)
        {
            System.out.println(arr1.length-count);
        }
        else{
            System.out.println(-1);
        }
    }
}
