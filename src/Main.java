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

        // Player turn
        while (players_turn){
            System.out.println("Hit or stand??");
            String choice = input.nextLine();
            // Hit
            if (choice.equals("Hit")){
                playerHand.add(d.deal());
                playerHand.show();

                // Check if player is bust
                if (playerHand.check() > 21){
                    players_turn = false;
                }

            }
            // Stand
            else{
                playerHand.show();
                players_turn = false;

            }
        }

        boolean dealers_turn = true;

        // Dealer turn
        while (dealers_turn){
            // Hits on value <= 16
            if (dealerHand.check() <= 16){
                dealerHand.add(d.deal());

                // Check if dealer is bust
                if (dealerHand.check() > 21) {
                    dealers_turn = false;
                    dealerHand.show();
                    System.out.println("Dealer is BUST!");
                    System.out.println("Player wins!");
                }

            }
            // Stands on value >= 17
            else{
                dealers_turn = false;
            }

        }
        // Compare hands
        if (playerHand.check() <= 21 & dealerHand.check() <= 21){
            dealerHand.show();

            if (playerHand.check() > dealerHand.check()){
                System.out.println("Player wins");
            }
            else if (dealerHand.check() > playerHand.check()){
                System.out.println("Dealer wins");
            }
            else{
                System.out.println("Push (Nobody wins)");
            }
        }
    }
}
