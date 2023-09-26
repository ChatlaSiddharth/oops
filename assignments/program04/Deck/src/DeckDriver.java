// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class DeckDriver {
    public static void main(String[] args) {
        //initializing the Deck
        Deck deck = new Deck();

        //printing the deck
        System.out.println(deck.toString());

        int cardsDealt = deck.getCardsDealt();

        while(!deck.isEmptyDeck()){
            deck.dealCard(cardsDealt);
            System.out.println(deck.getCardsDealt());
            cardsDealt++;
        }
        // shuffle deck 100 times
        deck.shuffleDeck();
        System.out.println(deck.toString());

        //specifically shuffle 20 times ,
        // added a print inorder print the count of shuffles in the Deck class
        deck.shuffleDeck(20);
        System.out.println(deck.toString());

    }
}