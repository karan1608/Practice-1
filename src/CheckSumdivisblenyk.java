import java.util.Scanner;

public class CheckSumdivisblenyk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of elements:");
        int n= sc.nextInt();
        System.out.println("Enter the K Element:");
        int k1 = sc.nextInt();
        int sum=0;
        int[] arr1 = new int[n];
        System.out.println("Enter the Array Elements:");
        for(int i=0;i<n;i++)
        {
            arr1[i] = sc.nextInt();
        }
        for(int j=0;j<n;j++)
        {
            for(int k=j+1;k<n;k++) {
                sum = (arr1[j] + arr1[k]);
                if(sum%k1==0)
                {
                    System.out.println("("+arr1[j]+","+arr1[k]+")");
                }
            }
        }
    }
}
