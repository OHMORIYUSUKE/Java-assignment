package kadai3;
import java.util.Scanner;
public class Array2DMap {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int map[][] = new int[9][9];

        int x=4;
        int y=4;

    while (true) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                map[i][j] = 0;
                map[x][y] = 1;
                System.out.print(map[i][j] + "");
            }
            System.out.print("\n");
        }
        System.out.print("どちらに移動する？");

        Scanner scan = new Scanner(System.in);
        String key = scan.nextLine();

        switch (key) {
            case "w":
                if (x>0) {
                    x = x - 1;
                    System.out.println("上に移動");
                    break;
                }else {
                    System.out.println("これ以上「上」に行けません。");
                    break;
                }

            case "d":
                if (y< map.length-1) {
                    y = y + 1;
                    System.out.println("右に移動");
                    break;
                }else {
                    System.out.println("これ以上「右」に行けません。");
                    break;
                }

            case "z":
                if (x< map.length-1) {
                    x = x + 1;
                    System.out.println("下に移動");
                    break;
                }else {
                    System.out.println("これ以上「下」に行けません。");
                    break;
                }

            case "a":
                if (y>0) {
                    y = y - 1;
                    System.out.println("左に移動");
                    break;
                }else {
                    System.out.println("これ以上「左」に行けません。");
                    break;
                }

            case "s":
                System.out.println("終了");
                System.exit(0);
        }


    }
    }
}
