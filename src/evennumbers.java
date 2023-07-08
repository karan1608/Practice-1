import java.util.Arrays;
import java.util.Scanner;

public class evennumbers {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String o="";
        int[] arr = new int[n];
        int[] arr1 = new int[n];
        int count =0;
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int j=0;j<n;j++)
        {
            if(arr[j]%2==0)
            {
                arr[j] = arr[j];
                count++;
                o = arr[j]+","+o;

            }
            else{
                arr[j] = 0;
            }
        }
        System.out.println(o);
        String[] arr3 = o.split(",");
        int[] arr2 = new int[count];
        for (int i = 0; i < count; i++) {
            arr2[i] = Integer.valueOf(arr3[i]);
        }

        System.out.println(Arrays.toString(arr2));
    }
}
