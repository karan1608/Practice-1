import java.util.HashSet;

public class LongestSubstring{
    public static int LongestSubstring(String s) {
        char[] chars = s.toCharArray();
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int right = 0;
        int max = 0;
        while (right < chars.length) {
            if (!set.contains(chars[right])) {
                set.add(chars[right]);
                // System.out.print(set);
                max = Math.max(max, set.size());
                right++;
                //System.out.println(right);
            } else {
                set.remove(chars[left]);
                left++;
            }
        }
        System.out.println(max);
        return max;

    }
    public static void main(String args[])
    {
        LongestSubstring("ababb");
    }
}