package kadai5;

import java.util.Scanner;

public class kadai56 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("x = ");
        float x= input.nextFloat();
        System.out.print("y = ");
        float y= input.nextFloat();
        System.out.print("h = ");
        float h= input.nextFloat();

        Square s= new Square();
        s.tate=x;
        s.yoko=y;
        s.takasa=h;
        float sm=s.menseki();
        float ss=s.taiseki();
        System.out.println("四角形の面積は "+sm);
        System.out.println("四角柱の体積は "+ss);


        Triangle t=new Triangle();
        t.tate=x;
        t.yoko=y;
        t.takasa=h;
        float tm=t.menseki();
        float ts=t.taiseki();
        System.out.println("三角形の面積は "+tm);
        System.out.println("三角柱の体積は "+ts);
    }
}
