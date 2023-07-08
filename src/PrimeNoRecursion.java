public class PrimeNoRecursion {
    public static boolean prime(int n,int i)
    {
        if(n<=1)
        {
            return false;
        }
        if(n==2)
        {
            return true;
        }
        if(n%i==0)
        {
            return false;
        }
        if(i*i>n) {
            return true;
        }
        return prime(n,i+1);
    }

    public static void main(String[] args) {
        System.out.println(prime(13,2));
    }
}
