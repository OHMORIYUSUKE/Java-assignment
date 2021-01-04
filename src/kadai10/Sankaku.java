package kadai10;

public class Sankaku extends Zukei {
    public Sankaku(float tate,float yoko,float takasa){
        this.tate = tate;
        this.yoko =yoko;
        this.takasa =takasa;
    }

    @Override
    protected float calcMenseki(){
        float tate = super.tate;
        float yoko = super.yoko;
        float ans = tate*yoko/2;
        return ans;
    }
    protected float calcTaiseki(){
        float tate = super.tate;
        float yoko = super.yoko;
        float ans = (tate*yoko/2)*takasa;
        return ans;
    }
}