package kadai10;

public class Shikaku extends Zukei {
    public Shikaku(float tate,float yoko,float takasa){
        this.tate = tate;
        this.yoko =yoko;
        this.takasa =takasa;
    }

    @Override
    protected float calcMenseki(){
        float tate = super.tate;
        float yoko = super.yoko;
        float ans = tate*yoko;
        return ans;
    }
    protected float calcTaiseki(){
        float tate = super.tate;
        float yoko = super.yoko;
        float ans = tate*yoko*takasa;
        return ans;
    }
}
