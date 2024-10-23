import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Let's play Blackjack!");
        Scanner input = new Scanner(System.in);
        Deck d = new Deck();
        d.shuffle();

        // Players hand
        Hand playerHand = new Hand("Your hand");
        playerHand.add(d.deal());
        playerHand.add(d.deal());
        playerHand.show();

        // Dealers hand
        Hand dealerHand = new Hand("Dealer hand");
        dealerHand.add(d.deal());
        dealerHand.show();
        dealerHand.add(d.deal());

        boolean players_turn = true;

        //Hit or stand
        while (players_turn){
            System.out.println("Hit or stand");
            String choice = input.nextLine();

            if (choice.equals("Hit")){
                playerHand.add(d.deal());
                playerHand.show();
            }

            else{
                playerHand.show();
                players_turn = false;
            }
        }


    }
}
