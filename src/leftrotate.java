
import java.util.Arrays;

public class leftrotate {
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6};
        int n=3;
        int[] temp = new int[arr.length];
        for (int i = n; i <arr.length ; i++) {
            temp[i-n] = arr[i];
        }
        int x = temp.length;
        System.out.println(x);
        for(int j = 0; j<n;j++)
        {
            temp[x-n+j] = arr[j];
        }
        System.out.println(Arrays.toString(temp));
    }
}
