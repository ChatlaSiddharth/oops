import java.util.Arrays;
import java.util.Random;
public class Deck extends Card {
    private Card[] deck = new Card[52];
    private int cardsDealt;
    private String[] suits = {"H", "D", "C", "S"};
    private String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};


    // constructor
    public Deck() {
        this. deck = initDeck(this.suits, this.ranks);
        this.cardsDealt = 0;
    }

    // initializing the Deck for the constructor
    public Card[] initDeck(String[] suits, String[]ranks){
        Card[] deck = new Card[52];
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                this.deck[index] = new Card(suit, rank);
                index++;
            }
        }
        return this.deck;
    }

    public int getCardsDealt() {
        return cardsDealt;
    }

    private void setCardsDealt(int cardsDealt) {
        this.cardsDealt = cardsDealt;
    }

    public boolean isEmptyDeck(){
        // prints true if all the cards are dealt
        return (getCardsDealt() == 51);
    }
    public void collectAllCards(){
        setCardsDealt(0);
    }

    public Card dealCard(int cardsDealt) {
        Card card = null;
        if (!isEmptyDeck()) {
            card = this.deck[cardsDealt];
            setCardsDealt(this.getCardsDealt() + 1);
        }
        return card;
    }

    public void shuffleDeck(){
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int index1 = random.nextInt(52);
            int index2 = random.nextInt(52);

            Card temp = deck[index1].clone();
            deck[index1] = deck[index2].clone();
            deck[index2] = temp.clone();
        }
    }

    public void shuffleDeck(int swapCnt){
        Random random = new Random();
        for (int i = 0; i < swapCnt; i++) {
            int index1 = random.nextInt(52);
            int index2 = random.nextInt(52);

            Card temp = deck[index1].clone();
            deck[index1] = deck[index2].clone();
            deck[index2] = temp.clone();
            //System.out.print(i);
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(deck);
    }
}

