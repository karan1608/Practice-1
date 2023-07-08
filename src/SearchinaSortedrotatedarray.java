public class SearchinaSortedrotatedarray {
    public static int searc(int[] arr,int l,int h,int key1) {
        int start =l;
        int end = h;
        int key = key1;
        if(start>end)
            return -1;
        int mid = (start+end)/2;
        if(arr[mid] == key)
        {
            return mid;
        }
        if(arr[start]<=arr[mid])
        {
            if(key>=arr[start] && key<=arr[mid])
                return searc(arr, start, mid - 1, key);

            return searc(arr,mid+1,end,key);

        }
        if(key>=arr[mid] && key<=arr[end])
        {
            return searc(arr,mid+1,end,key);
        }
        return searc(arr,start,mid-1,key);

    }

    public static void main(String[] args) {
        int[] arr = {4,5,6,7,8,1,2,3};
        int l =0;
        int h = arr.length-1;
        int key1 = 3;
        int i = searc(arr,l,h,key1);
        System.out.println(i+1);
    }
}
