
//Find number of pairs (x, y) in an array such that x^y > y^x
public class Pairs_XY {
    public static void main(String[] args) {
        int[] arr = {10,19,18};
        int[] arr1 = {11,15,9};
        int count=0;

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr1.length;j++)
            {
                double x1 = Math.pow(arr[i],arr[j]);
                double y1 = Math.pow(arr[j],arr[j]);

                if(x1>y1)
                {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
