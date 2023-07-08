import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] arr = new int[5];
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Choice: \n 1. Push 2. Pop 3. Show 4. Exit");
        while (sc.hasNext()) {
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    count = push(count,sc.nextInt(),arr);
                    System.out.println("Count="+count);
                    continue;
                case 2:
                    count = pop(count, arr);
                    System.out.println("Size of Stack "+count);
                    continue;
                case 3:
                    show(arr);
                    continue;
                case 4:
                    System.exit(n);
                default:
                    System.out.println("Enter Valid Choice");
            }
        }
    }
        public static int push(int c, int element, int[] a)
        {
            if (c < a.length-1) {
                a[c] = element;
                c++;
            } else {
                System.out.println("Overflow");
            }
            return c;
        }
        public static int pop(int c, int[] a)
        {
            if(c<=0)
            {
                System.out.println("Stack is Underflow");
            }
            else {
                a[c-1] = 0;
                c--;
            }
            return c;
        }
        public static void show(int[] a)
        {
            System.out.println(Arrays.toString(a));
        }

}