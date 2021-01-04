package kadai4;

import java.util.Scanner;

public class kadai48 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("n = ");
        int N = input.nextInt();

        Hantei hanntei = new Hantei();
        int x = hanntei.evenOrOdd(N);
        if (x == 0) {
            System.out.println("偶数");
        } else if (x == 1) {
            System.out.println("奇数");
        }
    }
}
