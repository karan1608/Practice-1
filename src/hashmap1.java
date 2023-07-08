import java.util.*;

public class hashmap1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mark[]=new int[n];
        String name[] = new String[n];
        for (int i = 0; i < n; i++) {
            name[i] = sc.next();
            mark[i] = sc.nextInt();

        }
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<n-1;j++)
            {
                if(mark[j]<mark[j+1])
                {
                    int temp = mark[j];
                    mark[j]=mark[j+1];
                    mark[j+1]=temp;
                    String te=name[j];
                    name[j]= name[j+1];
                    name[j+1]=te;
                }
            }
        }
        // Convert entrySet to Array using toArray method
        for (int j=0;j<n;j++) {
            System.out.println("Rank "+(j+1)+" : "+name[j]);
        }
    }
}