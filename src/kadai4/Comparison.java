package kadai4;
public class Comparison {
    int getMax(int a,int b){
        if(a>=b){
            return a;
        }
        return b;
    }
    int getMin(int a,int b){
        if (a<=b){
            return a;
        }
        return b;
    }
    void printMaxMin(int a, int b){
        int x = getMax(a,b);
        int y = getMin(a,b);
        System.out.println("max "+x);
        System.out.println("min "+y);
    }
}
