import java.util.Arrays;

public class stringconcat {
    public static void main(String[] args) {
        String[] arr = {"Hello","Karankumar","use"};
        int[] a1 = new int[arr.length];
        int[] a2 = new int[arr.length];
        int max =0;
        for(int i=0;i< arr.length;i++) {
            for (int j = i + 1; j < arr.length; j++) {
                max = Math.max(arr[i].length(), arr[j].length());
            }
        }
        String s ="";
        for(int i=0;i<max;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(i<arr[j].length()) {
                    s = s + arr[j].charAt(i);
                }
//                else{
//                    continue;
//                }
            }
        }
        System.out.println(s);
    }
}
