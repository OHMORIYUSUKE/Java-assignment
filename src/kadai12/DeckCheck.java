package kadai12;

import java.util.Scanner;

public class DeckCheck {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.printCardList();
        Scanner scanner = new Scanner(System.in);
        System.out.println("整数を入力してください。");
        int x = scanner.nextInt();
        try {
            Card card = deck.drawCard(x);
            card.print();
        }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }
}
