public class Main {
    public static void main(String[] args) {
        System.out.println("Let's play cards!");

        Deck d = new Deck();
        d.fisher_yates_sort();
        d.display();
    }
}
