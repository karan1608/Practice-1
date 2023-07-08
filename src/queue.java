import java.util.Arrays;
import java.util.Scanner;

public class queue {
    public static void main(String[] args)
    {
         int start =0;
         int end =0;
         int[] arr = new int[5];
         int count=arr.length;
         //System.out.println(count);
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the Choice: \n 1. Push 2.Pop 3.Show 4.Exit");
         while(sc.hasNext()) {
             int n = sc.nextInt();
             switch (n) {
                 case 1:
                     count = push(count,sc.nextInt(),arr);
                     break;
                 case 2:
                     count = pop(count,arr);
                     System.out.println(count);
                     break;
                 case 3:
                     show(arr);
                     break;
                 case 4:
                     System.exit(n);
                 default:
                     System.out.println("Enter a Valid Choice");
             }
         }
    }

    public static int push(int c, int element, int[] a) {
        if(c>a.length)
        {
            System.out.println("Overflow");
        } else if (c<=0) {
            System.out.println("Underflow");

        } else{
            a[c-1] = element;
            c--;
        }
        return c;
    }
    public static int pop(int c,int[] a)
    {
        if(c<0)
        {
            System.out.println("Underflow");
        } else if (c>a.length) {
            System.out.println("Overflow");
        } else{
            a[c-1] =0;
            c++;
        }
        return c;
    }
    public static void show(int[] a) {
        System.out.println(Arrays.toString(a));
    }
}
