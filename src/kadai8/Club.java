package kadai8;

public class Club {
    int i=0;
    private String clubName;
    Member[] members ;
    public Club(String clubName){
        this.clubName = clubName;
        members = new Member[70];
    }
    public void join(Member member){

            if (members[i] == null) {
                members[i] = member;
                i++;
            }

    }
    public void print(){
        for (int i=0;i<members.length;i++) {
            if(members[i] != null) {
                members[i].print();
            }
        }
    }
}