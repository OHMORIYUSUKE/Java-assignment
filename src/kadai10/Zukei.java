package kadai10;

public class Zukei {
    protected float tate;
    protected float yoko;
    protected float takasa;

    protected float calcMenseki(){
        return 0.0f;
    }
    protected float calcTaiseki(){
        return 0.0f;
    }

    public void print(){
        float ans1 = calcMenseki();
        System.out.println("面積"+ans1);

        float ans2 = calcTaiseki();
        System.out.println("体積"+ans2);

    }
}
