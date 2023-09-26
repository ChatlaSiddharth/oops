public class Card implements Cloneable{
    private String suits;
    private String rank;


    //Default Constructor
    public Card() {
        this.suits = "C";
        this.rank = "A";
    }
    //Specifying Constructor
    public Card(String suits, String rank) {
        this.suits = suits;
        this.rank = rank;
    }
    //Clone method
    public Card clone(){
        Card cardClone;
        try{
            cardClone = (Card) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return cardClone;
    }

    //public Accessor methods
    public String getSuits() {
        return suits;
    }
    public String getRank() {
        return rank;
    }

    //private mutators
    private void setRank(String rank) {
        if (validRank(rank)) {
            this.rank = rank;
        }
    }
    private void setSuits(String suits) {
        if(validSuit(suits)){
            this.suits = suits;
        }
    }

    //Validity Checkers
    private boolean validRank(String rank){
        boolean validity = false;
        String[] rankCheck = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        for(String pointer : rankCheck) {
            if (pointer.equals(rank)){
                validity = true;
            }
        }
        return validity;
    }
    private boolean validSuit(String suit){
        boolean validity = false;
        String[] suitCheck = {"H", "D", "C", "S"};
        for(String pointer : suitCheck) {
            if (pointer.equals(suit)){
                validity = true;
            }
        }
        return validity;
    }

    // equals method
    public boolean equals(Card guest){
        return this.suits.equals(guest.getSuits()) && this.rank.equals(guest.getRank());
    }

    //To String method to print Card Details
    @Override
    public String toString() {
        return suits + rank;

    }
}
