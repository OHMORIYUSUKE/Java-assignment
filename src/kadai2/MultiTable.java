package kadai2;

public class MultiTable {
    public static void main(String[] args) {
        for (int i=1;i<=9;i++){
            System.out.print(i+"の段\t");
            for (int I=1;I<=9;I++){
                int ans = i*I;
                System.out.print(ans+"\t");
            }
            System.out.println("");
        }
    }
}
