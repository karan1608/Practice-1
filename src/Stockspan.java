import java.util.Arrays;

public class Stockspan {
    public static void main(String[] args) {
        int[] arr = {10,20,15,10,25,22};
        int[] span = new int[arr.length];
        span[0] = 1;
        for(int i=1;i<arr.length;i++)
        {
            span[i] = 1;
            for(int j=i-1;(j>=0)&&(arr[i]>=arr[j]);j--)
            {
                span[i]++;
            }
        }
        System.out.println(Arrays.toString(span));
    }
}
