public class leftequalsright {
    public static void main(String[] args) {
        int arr[] = {6,4,2,2,12};
        int start = 0;
        int end = arr.length - 1;
        int val = 0;
        if (arr.length % 2 == 0) {
            while (start <= end) {
                val = Math.abs(val - (arr[start] - arr[end]));
                start++;
                end--;
            }
        } else {
            while (start <= end) {
                val = Math.abs(val - (arr[start] - arr[end]));
                start++;
                end--;
            }
            val = Math.abs(val - (arr[--start]));
        }
        System.out.println(val);
    }
    }
