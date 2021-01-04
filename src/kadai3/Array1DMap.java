package kadai3;
import java.util.Scanner;
public class Array1DMap {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);

    int[]ia=new  int[5];

    int x=2;

    while(true) {
        for (int i = 0; i < ia.length; i++) {
            ia[i]=0;
            ia[x]=1;
            System.out.print(ia[i] + "");
        }
        System.out.print("どちらに移動する？");

        Scanner scan = new Scanner(System.in);
        String key = scan.nextLine();
        //String key = null;
        switch (key) {
            case "k":
                if (0<x){
                x=x-1;
                System.out.println("左に移動");
                break;
                }else {
                    System.out.println("これ以上左に行けません。");
                    break;
                }
            case "d":
                if (x< ia.length-1) {
                    x = x + 1;
                    System.out.println("右に移動");
                    break;
                }else {
                    System.out.println("これ以上右に行けません。");
                    break;
                }
            case "q":
                System.out.println("終了");
                System.exit(0);
        }
    }
    }
}
