import java.util.*;
public class PostFixusingStack{
    public static void main(String args[]){
        String s = "231*+9-";
        int ans =0;
        Stack<Integer> st = new Stack<>();
        if(!Character.isDigit(s.charAt(0)))
        {
            System.out.println("First Vale should be a Number");
        }
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(Character.isDigit(c))
            {
                st.push(c -'0');
            }
            else{
                int val1 = st.pop();
                int val2 = st.pop();
                switch(c)
                {
                    case '+':
                        ans = val2 + val1;
                        st.push(ans);
                        break;
                    case '-':
                        ans = val2 - val1;
                        st.push(ans);
                        break;
                    case '*':
                        ans = val2 * val1;
                        st.push(ans);
                        break;
                    case '/':
                        ans = val2 / val1;
                        st.push(ans);
                        break;
                    default:
                        System.out.println("Enter a valid Operator");
                }
            }
        }
        System.out.println(st);
    }
}