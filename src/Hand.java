import java.util.ArrayList;

public class Hand {
    private String name;
    private ArrayList<Card> cards;

    public Hand(String name) {
        this.name = name;
        cards = new ArrayList<>();
    }

    public void show() {
        System.out.println(name + ":");
        for (int i=0; i<cards.size(); i++) {
            Card c = cards.get(i);
            System.out.println(c);
        }
    }

    public void add(Card c) {
        cards.add(c);
    }
}
