package kadai6;

import java.util.Random;
import java.util.Scanner;

public class Kadai65 {
    public static void main(String[] args) {
        /**
         * Scannerと乱数表を準備する
         */
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        /**
         * 変数tAにTargetをlabel="A",x=4,y=4でインスタンス化する。
         */
        Target tA = new Target("A",4,4);

        /**
         * 変数tGにTargetをlabel="G",x=乱数gx,y=乱数gyで
         * インスタンス化する。
         * gx,gyの乱数は、0から3までの4つから選ばれる。
         */
        int gx = rand.nextInt(4);
        int gy = rand.nextInt(4);
        Target tG = new Target("G",gx,gy);

        /**
         * 無限ループ開始
         */
        while (true) {

            for (int y = 0; y < 5; y++) {
                for (int x = 0; x < 5; x++) {
                    if (x==tA.x && y==tA.y) {
                        /**
                         * x,yがtAのもので一致すれば、tAの表示名を表示。
                         */
                        System.out.print(tA.label);
                    } else if (x==tG.x && y==tG.y) {
                        /**
                         * x,yがtGのもので一致すれば、tGの表示名を表示。
                         */
                        System.out.print(tG.label);
                    } else {
                        /**
                         * x,yがtA,tGのどちらのものとも一致しなければ、
                         * "."を表示。
                         */
                        System.out.print(".");
                    }
                }
                System.out.println("");
            }
            /**
             * 標準入力"w""a""s""d"の入力でtAのmove機能を実行する
             */
            System.out.print("どちらに移動する？：");
            String key = input.next();
            tA.move(key);

            /**
             * tA tGのx,y座標が完全一致すれば、終了。
             */
            if (tA.x==tG.x && tA.y==tG.y) {
                System.out.println("Goal!!");
                System.exit(0);
            }
        }
    }
}