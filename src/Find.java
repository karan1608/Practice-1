public class Find {
    public static void main(String[] args) {
//        int[] arr1 = {2, 3, 4, 1, 2, 6, 7, 2, 3, 4, 9};
//        int[] arr2 = {2, 3, 4};
//        int count = 0;
//        for (int i = 0; i < arr1.length-1; i++) {
//            int j = 0;
//            while (j < arr2.length && arr2[j] == arr1[i + j]) {
//                j++;
//            }
//            if (j == arr2.length) {
//                count++;
//            }
//        }
//        System.out.println(count);
        String a1 = "helloworldhellohjhello";
        String a2 = "hello";
        char[] arr1 = a1.toCharArray();
        char[] arr2 = a2.toCharArray();
        int count=0;
        for(int i=0;i<arr1.length-1;i++)
        {
            int j=0;
            while(j<arr2.length && arr2[j] == arr1[i+j])
            {
                j++;
            }
            if(j == arr2.length)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
