public class Subarray {
    public static void main(String[] args) {
        int[] arr = {1,2,1,2,3,4};
        int sum=0;
        int i=0;
        int n=2;
        int target=3;
        int count=0;
        //Count of sum that equals to target.
//        while(i<arr.length)
//        {
//            sum = arr[i] + arr[j];
//            i++;
//            j++;
//            if(sum == target)
//            {
//                count++;
//            }
//        }
        while(i<n)
        {
            sum += arr[i];
            //System.out.println(sum);
            i++;
        }
        if(sum == target)
        {
            count++;
            //System.out.println(count);
        }
        while(i<arr.length)
        {
            sum+=arr[i];
            sum-=arr[i-n];
            i++;
            if(sum == target)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
