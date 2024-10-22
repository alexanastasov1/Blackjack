public class Card {
    private String suit;
    private int value;  // 1 (Ace) - 13 (King)

    public Card(String suit, int value) {
        this.suit = suit;
        this.value = value;
    }

    public String getSuit() {
        return suit;
    }

    public int getValue() { return value; }

    public String getValueName() {
        if (value == 1) {
            return "Ace";
        } else if (value == 11) {
            return "Jack";
        } else if (value == 12) {
            return "Queen";
        } else if (value == 13) {
            return "King";
        } else {
            return Integer.toString(value);
        }
    }

    public void display() {
        System.out.println(getValueName() + " of " + getSuit());
    }

    public String toString() {
        return getValueName() + " of " + getSuit();
    }

}

