import java.util.Arrays;
import java.util.Random;
public class Deck {
    private boolean[] deck = new boolean[52];
    private int length = deck.length;

    public Deck() {
        initDeck();
    }

    public void initDeck() {
        for (int i = 0; i < this.length; i++) {
            this.deck[i] = false;
        }
    }

    public void print() {
        for (boolean card : this.deck) {
            System.out.print(card);
        }
        System.out.println(); // Add a newline at the end for formatting.
    }

    public boolean emptyDeck() {
        for (int i = 0; i < this.length; i++) {
            //System.out.print(!this.deck[i]);
            if (!this.deck[i])
                return false;
        }
        return true;
    }

    public int dealCard() {
        for (int i = 0; i < this.length; i++) {
            int random = new Random().nextInt(this.length);
            while (this.deck[random] == false) {
                this.deck[random] = true;
                return random;
            }
        }
        return -1;
    }

    public static String cardToString(int index) {

        String[] suits = {"H", "D", "C", "S"};
        String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        int suitIndex = index / 13;
        int rankIndex = index % 13;

        String suit = suits[suitIndex];
        String rank = ranks[rankIndex];

        return rank + suit;

    }
}

