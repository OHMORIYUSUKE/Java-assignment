package kadai11;

import java.io.IOException;
import java.util.List;

public class KadaiA5 {
    public static void main(String[] args) {
        try {
            FileManager fileManager = new FileManager("students.txt");
            List<String> lines = fileManager.getAsList();

            for (String gakusei :lines) {
                String[] splitted = gakusei.split(",",0);

                String message = "学籍；"+splitted[0]+" 名前；"+splitted[1];
                System.out.println(message);
            }

        }catch (IllegalArgumentException e1){
            System.out.println("ファイル名を正しく入力してください。");
        }catch (IOException e2){
            System.out.println("ファイルが読み込めません。");
        }
        System.out.println("終了");
    }
}
