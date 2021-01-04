package kadai8;

public class Member {
    private String gakuseki;
    private String shimei;
    public Member(String gakuseki,String shimei){
        this.gakuseki=gakuseki;
        this.shimei=shimei;
    }
    public void print(){
        System.out.println(gakuseki+","+shimei);
    }
}