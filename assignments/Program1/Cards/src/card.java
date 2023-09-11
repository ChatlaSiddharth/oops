
import java.util.Random;
public class card {
    public int a  = 2;
    public static String suits[] = { "C", "S", "H", "D" };
    public static String rank[] = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "K", "Q" };
    public static String[] totalCards = new String[52];

    public static void initDeck(boolean[] deck) {
        int k = 0;
        for (int i = 0; i < rank.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                totalCards[k] = rank[i].concat(suits[j]);
                k++;
            }
        }

        for (int i = 0; i < deck.length; i++) {
            deck[i] = false;
        }
    }

    public static boolean emptyDeck(boolean[] deck) {
        for (int i = 0; i < deck.length; i++) {
            if (deck[i] == false)
                return false;
        }
        return true;
    }

    public static int dealCard(boolean[] deck) {

        for (int i = 0; i < deck.length; i++) {
            int random = new Random().nextInt(deck.length);
            if (deck[random] == false) {
                deck[random] = true;
                return random;
            }
            //i--;
        }
        return 0;
    }

    public static void printCard(int card) {

        System.out.print(totalCards[card]);
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
