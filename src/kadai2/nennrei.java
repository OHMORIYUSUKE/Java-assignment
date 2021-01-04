package kadai2;

import java.util.Scanner;

public class nennrei {
    public static void main(String[] args) {

        while (true) {
            Scanner KyeInput = new Scanner(System.in);
            System.out.print("年齢を入力してください:");
            int x = KyeInput.nextInt();

            if (x <= 120 && x>=0) {
                if (x >= 20) {
                    System.out.println("成人");
                } else {
                    System.out.println("未成年");
                }
            } else {
                System.out.println("エラー");
                break;
            }
        }
    }
}
