package kadai12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import java.util.ArrayList;

public class Deck {
    private ArrayList<Card> cardList;

    public Deck(){
        String[] marks = new String[]{"ダイヤ","スペード","ハート","クローバー"};
        ArrayList<Card> cardList = new ArrayList<>();
        for (int i=0;i<marks.length;i++){
            String mark = marks[i];
            for (int j=1;j<=13;j++){
                Card card = new Card(mark,j);
                cardList.add(card);
            }
        }
        Collections.shuffle(cardList);
        this.cardList = cardList ;
    }
    public void printCardList(){
        for (int i=0;i<cardList.size();i++){
            Card card = cardList.get(i);
            card.print();
        }
    }
    public Card drawCard(int n){
        return cardList.get(n);
    }
}
