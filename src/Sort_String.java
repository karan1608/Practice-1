import java.util.Arrays;

import static java.util.Arrays.sort;

public class Sort_String {
    public static void main(String args[]){
        String[] k ={"Kaa","Abb","Caa"};
        Arrays.sort(k);
//        for(int i=0;i<k.length-1;i++)
//        {
//            if(k[i].compareTo(k[i+1])>0)
//            {
//                String temp = k[i];
//                k[i] = k[i+1];
//                k[i+1] = temp;
//            }
//        }
        System.out.println(Arrays.toString(k));
    }
}
