public class Card {
    private String suit;
    private int value;

    public Card(String suit, int value){
        this.suit = suit;
        this.value = value;
    }

    public void display(){
        if (value == 1){
            System.out.println("Ace of " + suit);
        }
        else if(value == 11){
            System.out.println("Jack of " + suit);
        }
        else if(value == 12){
            System.out.println("Queen of " + suit);
        }
        else if(value == 13){
            System.out.println("King of " + suit);
        }
        else{
            System.out.println(value + " of " + suit);
        }
    }
}
