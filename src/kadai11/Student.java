package kadai11;

public class Student {
    private String number;
    private String name;

    public Student(String arg){
        if(arg == null){
            throw new RuntimeException();
        }
        String[] splitted = arg.split(",",0);
        this.number = splitted[0];
        this.name = splitted[1];
    }
    public void print(){
        String message = "学籍；"+this.number+"名前；"+this.name;
        System.out.println(message);
    }
}
