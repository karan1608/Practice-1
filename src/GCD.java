public class GCD {
//    public static void main(String[] args) {
//        int a =27, b = 39;
//        int gcd =1;
//        for(int i=1;i<=a & i<=b;i++)
//        {
//            if(a%i ==0 && b%i ==0)
//            {
//                gcd =i;
//            }
//        }
//        System.out.println(gcd);
//    }
    public static int gcd(int a1,int b1)
    {
        if(b1==0)
        {
            return a1;
        }
        return gcd(b1,a1%b1);
    }

    public static void main(String[] args) {
        int a = -27;
        int b = 39;
        System.out.println(gcd(a,b));
    }
}
