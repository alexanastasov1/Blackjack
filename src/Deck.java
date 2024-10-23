import java.util.Random;

public class Deck {
    private Card[] allCards;
    private int topCard;

    public Deck() {
        allCards = new Card[52];
        String[] suits = {"hearts", "diamonds", "clubs", "spades"};
        int counter = 0;
        for (String s: suits) {
            for (int v = 1; v <= 13; v++) {
                Card c = new Card(s, v);
                allCards[counter] = c;
                counter++;
            }
        }
    }

    public void display() {
        for (int i=0; i<allCards.length; i++) {
            System.out.println(allCards[i]);
        }
    }

    // sort deck alphabetically - a pointless thing to do!
    public void sort() {
        // bubble sort
        boolean swapped = true;
        int passes = 0;
        while (swapped) {
            swapped = false;
            for (int i=0; i<allCards.length-1 - passes; i++) {
                if (allCards[i].toString().compareTo(allCards[i+1].toString()) >0) { // out of order
                    //swap
                    Card temp = allCards[i];
                    allCards[i] = allCards[i+1];
                    allCards[i+1] = temp;
                    swapped = true;
                }
            }
            passes++;
        }
    }

    public void fisher_yates_shuffle(){
        Random r = new Random();
        for (int i = allCards.length - 1 ; i > 0; i = i - 1){
            int j = r.nextInt(0, i);
            Card temp = allCards[i];
            allCards[i] = allCards[j];
            allCards[j] = temp;
        }
    }

    public void shuffle() {
        fisher_yates_shuffle();
    }
}
