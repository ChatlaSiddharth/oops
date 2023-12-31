import java.util.Arrays;
import java.util.Random;

public class Main {

    public static String suits[] = { "C", "S", "H", "D" };
    public static String rank[] = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "K", "Q" };
    public static String[] deckOfCards = new String[52];

    // set the values of deck to indicate that they are all
    // present - not dealt yet.
    public static void initDeck(boolean[] deck){
        int pointer = 0;
        for (int i = 0; i < rank.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                deckOfCards[pointer] = rank[i].concat(suits[j]);
                pointer++;
            }
        }

        for (int i = 0; i < deck.length; i++) {
            deck[i] = false;
        }
    }

    // returns whether or not all the cards in the deck
    // have already been dealt.
    public static boolean emptyDeck(boolean[] deck){
        for (int i = 0; i < deck.length; i++) {
            if (!deck[i])
                return false;
        }
        return true;
    }

    // returns a card (an int in the range 0 to 51) at random
    // that has not been dealt since the deck was initialize
    // via intDeck.  Also notes (in deck) that this card is
    // no longer available.

    public static int dealCard(boolean[] deck){
        for (int i = 0; i < deck.length; i++) {
            int random = new Random().nextInt(deck.length);
            if (deck[random] == false) {
                deck[random] = true;
                return random;
            }
        }
        return 0;
    }

    // given a card (an int in the range 0 to 51) prints
    // an appropriate representation of this card based
    // on a 1-1 and onto mapping of the set [0, 51] to
    // the cards described above.
    public static void printCard(int card) {
        System.out.print(deckOfCards[card]);
    }


    public static void main(String[] args) {
        boolean[] myDeck = new boolean[52];
        final int cardsPerRow = 8;
        int cardsThisRow = 0;
        int myCard;
        initDeck(myDeck);
        System.out.println("\nHere is a shuffled deck ...\n");
        while (!emptyDeck(myDeck)) {
            myCard = dealCard(myDeck);
            ++cardsThisRow;
            if (cardsThisRow <= cardsPerRow) {
                printCard(myCard);
                System.out.print("  ");
            } else {
                System.out.println("");
                cardsThisRow = 1;
                printCard(myCard);
                System.out.print("  ");
            }
        }
        System.out.println('\n');

    }
}