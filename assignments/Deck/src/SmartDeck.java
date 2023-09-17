public class SmartDeck extends Deck {

    private int cardsDealt = 0;
    @Override
    public void initDeck() {
        super.initDeck();
    }
    public int dealCard(){
        int card = super.dealCard();
        cardsDealt++;
        return card;
    }
    public int getCardsDealt(){
        return cardsDealt;
    }
    public String printCard(int index){
        String cards;
        cards = super.printCard(index);
        return cards;
    }

}
