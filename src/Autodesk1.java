import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Autodesk1 {
    public static void main(String[] args) {

        int[] arr = {55, 60, 1, 10, 57, 89, 79,66,71,02};
        int n = arr.length;
        int max=0;
        int max1=0;
        ArrayList<Integer> arr1 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int num = arr[i];
            while(num>0)
            {
                int result = num%10;
                arr1.add(result);
                num/=10;
            }
        }
        int[] arr2 = new int[arr1.size()];
        int j=0;
        for(int a:arr1)
        {
            arr2[j] = a;
            j++;
        }
        Arrays.sort(arr2);
        HashMap<Integer,Integer> map = new HashMap<>();
        int count=0;
        for(int i=0;i<arr2.length;i++)
        {
            if(!map.containsKey(arr2[i]))
            {
                map.put(arr2[i],count+1);
            }
            else{
                int u = map.get(arr2[i]);
                map.put(arr2[i],u+1);
                int h = map.get(arr2[i]);
                max1 = Math.max(h,max1);
            }
        }
        //System.out.println(max1);
        int[] arr3 = new int[map.size()];
        int[] arr4 = new int[map.size()];
        int k=0;
        for(int b:map.keySet())
        {
            arr3[k] = b;
            k++;
        }
        int h=0;
        for(int c: map.values()) {
            arr4[h] = c;
            h++;
        }
        for(int i=0;i<arr4.length;i++)
        {
            max = Math.max(arr4[i],max);
        }
        ArrayList<Integer> arr5 = new ArrayList<>();
        for(int i=0;i<arr4.length;i++)
        {
            if(arr4[i] == max)
            {
                arr5.add(arr3[i]);
            }
        }
        Collections.sort(arr5);
        System.out.println(arr5);
    }
}
