import java.util.ArrayList;

public class Perumutation {
    public static void permutation(String s1,String ans)
    {
        ArrayList<String> s = new ArrayList<>();
        if(s1.length() ==0)
        {
            s.add(ans);
            return;
        }
        for(int i=0;i<s1.length();i++)
        {
            char ch = s1.charAt(i);
            String per = s1.substring(0,i) + s1.substring(i+1);
            permutation(per,ans+ch);
        }
    }

    public static void main(String[] args) {
        String s1 = "ab";
        permutation(s1,"");
    }
}
