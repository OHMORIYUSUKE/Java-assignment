package kadai5;

public class Triangle {
    float tate;
    float yoko;
    float takasa;
    float tm;
    float menseki(){
        tm = tate*yoko/2;
        return tm;
    }
    float taiseki(){
        float ts = tm*takasa;
        return ts;
    }
}
