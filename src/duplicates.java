import java.util.Arrays;
import java.util.Scanner;

public class duplicates {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 2, 1, 5 };
        int n = arr.length;

        // Loop through the array and mark duplicates as -1
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    arr[j] = -1;
                }
            }
        }

        // Create a new array without duplicates
        int[] result = new int[n];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != -1) {
                result[j] = arr[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(result));
        result = Arrays.copyOf(result, j);

        // Print the array without duplicates
        System.out.println(Arrays.toString(result));
    }
    }


