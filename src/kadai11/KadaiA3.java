package kadai11;

public class KadaiA3 {
    public static void main(String[] args) {
        try {
            String line1 = "b2190350,大森裕介";
            Student s1 = new Student(line1);
            s1.print();
            String line2 = "b1111111,山田太郎";
            Student s2 = new Student(line2);
            s2.print();
        }catch (RuntimeException e){
            System.out.println("不正なインスタンス");
        }
        System.out.println("終了");
    }
}
