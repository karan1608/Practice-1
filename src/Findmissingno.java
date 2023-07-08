import java.util.Arrays;

public class Findmissingno {
    public static int miss(int[] arr, int n)
    {
        int x1 = arr[0];
        int x2 = 1;

        for(int i=1;i<n;i++)
        {
            x1 = x1 ^ arr[i];
        }
        for(int j=2;j<=n+1;j++)
        {
            x2 = x2 ^ j;
        }
        return (x1 ^ x2);
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,5};
        int n = 4;
        int b = miss(arr,n);
        System.out.println(b);
    }
}
