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

    public int check() {
        int sum = 0;
        for (int i=0; i<cards.size(); i++) {
            Card c = cards.get(i);

            //Make face card value = 10
            if (c.getValue() > 10) {
                sum = sum + 10;
            }
            else if (c.getValue() == 1) {
                if (sum + 11 > 21) {
                    sum = sum + 1;
                }
                else{
                    sum = sum + 11;
                }
            }
            else{
                sum = sum + c.getValue();
            }
        }

        return sum;
    }
}
