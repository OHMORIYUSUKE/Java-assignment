package kadai7;

public class Circle {
    float r;
    float L;
    float S;

    Circle()
    {
        r = 1.0f;
    }

     public void setR(float r){
         this.r = r;
         if(r<=0){
             this.r = 1;
         }
     }
     public void ennsyuu(){
         setR(r);
         L= (float) (r*2*3.14);
         System.out.println("円周は "+L);
     }
     public void mennseki(){
         setR(r);
         S= (float) (r*r*3.14);
         System.out.println("面積は "+S);
     }
}
