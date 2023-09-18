import java.util.Arrays;
public class SmartDeck extends Deck {
    private int cardsDealt = 0;
    @Override
    public void initDeck() {
        super.initDeck();
    }
    public int dealCard(){
        int card = super.dealCard();
        if (card > -1) {
            this.cardsDealt++;
        }
        return card;
    }
    public int getCardsDealt(){
        return cardsDealt;
    }
    public static String cardToString(int index){
        String cards;
        cards = Deck.cardToString(index);
        return cards;
    }

}
