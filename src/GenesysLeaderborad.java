import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class GenesysLeaderborad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ref=0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int[] arr1 = new int[k];
        for (int j = 0; j < k; j++) {
            arr1[j] = sc.nextInt();
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        int count=1;
        for(int a:arr)
        {
            if(!map.containsKey(a))
            {
                map.put(a,count);
                count++;
            }
        }
        int max=0;
        for(int a1:arr1)
        {
            if(map.containsKey(a1))
            {
                if(a1>max) {
                    System.out.print(map.get(a1) + " ");
                }else{
                    System.out.print(map.get(ref)+" ");
                }
            }
            else if(a1>arr[0] || a1<max)
            {
                System.out.print(1+" ");
                max = Math.max(max,a1);
            }
            else if(a1<arr[arr.length-1]) {
                System.out.print((map.get(arr[arr.length - 1]) + 1)+" ");
            }
            else{
                for(int a2:arr)
                {
                   if(a2<a1)
                   {
                       ref = a2;
                       System.out.print( (map.get(a2)) +" ");
                       max = Math.max(max,a1);
                       //System.out.print(max);
                       break;
                   }
                }
        }
        }
    }
}
