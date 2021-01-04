package kadai2;

import java.util.Scanner;

public class adision {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("a : ");
        int a = input.nextInt();

        System.out.print("b : ");
        int b =  input.nextInt();

        float ans = a + b;
        System.out.println("a + b = "+ ans);

    }
}
