import java.util.*;

public class hashmap {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,String> map = new HashMap<>();
        int n =sc.nextInt();
        for(int i=0;i<n;i++)
        {
           int mark = sc.nextInt();
           String name = sc.next();
           map.put(mark,name);
        }
        int[] arr1 = new int[n];
        ArrayList<Integer> l1 = new ArrayList<>(map.keySet());
        Collections.sort(l1,Collections.reverseOrder());
        for(int k=0;k<l1.size();k++)
        {
            arr1[k] = l1.get(k);
        }
        for(int h=0;h<n;h++)
        {
            System.out.println("Rank "+(h+1)+":"+map.get(arr1[h]));
        }
    }
}
