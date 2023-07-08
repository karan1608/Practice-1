import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Goodnumbers goodNumbers = new Goodnumbers();

        System.out.print("Enter no of Queries : ");
        int q = scanner.nextInt();
        scanner.nextLine();

        System.out.println();

        for (int i = 0; i < q; i++) {
            System.out.print("Enter the Pairs: ");
            String pair = scanner.nextLine();

            System.out.println();

            String[] stringArr = pair.split(" ");

            int noOfGoodNumbers = 0;

            for (int j = Integer.parseInt(stringArr[0]); j <= Integer.parseInt(stringArr[1]); j++) {
                if (goodNumbers.isGoodNumber(j)) {
                    noOfGoodNumbers++;
                }
            }

            System.out.println("No of Good Numbers in the given range = " + noOfGoodNumbers);

        }

    }
}