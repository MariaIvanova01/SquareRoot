package squareRoot;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        double sqrt = -1;

        try {
            sqrt = sqrt(Integer.parseInt(input));
        }catch (IllegalArgumentException e){
            System.out.println("Invalid");
        }

        if (sqrt != -1){
            System.out.printf("%.2f%n",sqrt);
        }
        System.out.println("Goodbye");

    }
    public static double sqrt(int n){
        if (n < 0){
            throw new IllegalArgumentException("Invalid");

        }
        return Math.sqrt(n);
    }
}
