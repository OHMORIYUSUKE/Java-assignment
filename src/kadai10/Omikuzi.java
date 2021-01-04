package kadai10;

public class Omikuzi {
    private String unsei;
    private String setumei;

    public Omikuzi(String unsei,String setumei){
        this.unsei = unsei;
        this.setumei = setumei;
    }

    public void print(){
        String str = "今日の運勢；"+unsei+","+setumei;
        System.out.println(str);
    }
}
