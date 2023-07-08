public class subsetsum {
    public static int subset(int[] arr,int sum,int i)
    {
        if(sum==0)
        {
            return 1;
        }
        if(i>=arr.length)
        {
            return 0;
        }
        if(sum<0)
        {
            return 0;
        }

        return subset(arr,sum-arr[i], i+1) + subset(arr, sum,i+1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,10,15,25,17,8};
        System.out.println(subset(arr,25,0));

    }
}
