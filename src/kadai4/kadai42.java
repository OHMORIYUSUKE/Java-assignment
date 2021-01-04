package kadai4;

public class kadai42 {
    public static void main(String[] args) {
        Comparison comp = new Comparison();
        int x = comp.getMax(3, 4);
        int y = comp.getMin(3,4);
        System.out.println("大きいのは"+x);
        System.out.println("小さいのは"+y);
    }
}
