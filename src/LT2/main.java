package LT2;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        int number=10;
        String name="Ohmoyi-Yusuke";
        System.out.println(number+name);

        List<Integer>numberList=new ArrayList<>();
        numberList.add(1);
        numberList.add(3);
        numberList.add(29);

        System.out.println(numberList);
//        System.out.println(numberList.get(2));
        for (int num:numberList){
            System.out.println(num);
        }
    }
}
