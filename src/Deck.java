public class Deck {
    private Card[] allCards;
    int cardCount= 0;

    public Deck() {
        allCards = new Card[52];
        String[] suits = {"Hearts", "Diamonds", "Spades", "Clubs"};

        for (int j = 0; j < 4; j++) {
            for (int i = 1; i < 14; i++) {
                Card c = new Card(suits[j], i);
                allCards[cardCount] = c;
                cardCount++;

            }
        }
    }
}
