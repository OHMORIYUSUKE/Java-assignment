package kadai10;

import java.util.Random;

public class OmikuziBox {
    private Omikuzi[] omikuzis;


    public OmikuziBox(){
        omikuzis =new Omikuzi[5];

         omikuzis[0] = new Omikuzi("大吉","今日は絶好調");
         omikuzis[1] = new Omikuzi("吉","嬉しいことが起きるかも");
         omikuzis[2] = new Omikuzi("中吉","忘れ物に注意");
         omikuzis[3] = new Omikuzi("小吉","寝坊に注意");
         omikuzis[4] = new Omikuzi("凶","めげずに頑張ろう");

    }
    public void pickup(){
        Random rand = new Random();
        int n = rand.nextInt(5);
        Omikuzi omikuzi = omikuzis[n];
        omikuzi.print();
    }
}
