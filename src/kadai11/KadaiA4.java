package kadai11;

import javax.tools.JavaFileManager;
import java.io.IOException;

public class KadaiA4 {
    public static void main(String[] args) {
        try {
            FileManager fileManager = new FileManager("messages.txt");
            String[] lines = fileManager.getAsArray();

            for (int i=0;i< lines.length;i++) {
                System.out.println(lines[i]);
            }

        }catch (IllegalArgumentException e1){
            System.out.println("ファイル名を正しく入力してください。");
        }catch (IOException e2){
            System.out.println("ファイルが読み込めません。");
        }
        System.out.println("終了");
    }
}
