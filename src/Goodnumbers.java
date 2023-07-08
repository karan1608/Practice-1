public class Goodnumbers {

    public void goodNumbers(){

    }

    public boolean isPrime(int n){
        boolean isPrime = true;
        for (int i = 2; i < n; i++) {
            if(n%i==0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public int noOfDigits(int n){
        int c = 0;
        while (n > 0){
            n = n / 10;
            c++;
        }
        return c;
    }

    public boolean isGoodNumber(int n){
        boolean good = false;
        int c = 0;
        if(n==1) return true;
        for (int i = 2; i <= n; i++) {
            if(n%i==0 && isPrime(i)){
                c++;
            }
        }

        if(c == noOfDigits(n)){

            good = true;
        }
        return good;
    }
}

