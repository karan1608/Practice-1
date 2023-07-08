import java.sql.SQLOutput;

public class Fibonacci {
    public static void main(String[] args) {
        int i=0;
        int i1=1;
        int sum=0;
        System.out.print(i+" ");
        System.out.print(i1+" ");
        for(int j=1;j<10;j++)
        {
            sum = i + i1;
            i = i1;
            i1 = sum;
            System.out.print(sum+" ");
        }
    }
}
