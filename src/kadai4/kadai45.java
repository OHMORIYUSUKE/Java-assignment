package kadai4;

import java.util.Scanner;

public class kadai45 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("a = ");
        int a = input.nextInt();
        System.out.print("b = ");
        int b = input.nextInt();

        Comparison comp= new Comparison();

        comp.printMaxMin(a,b);
    }
}
