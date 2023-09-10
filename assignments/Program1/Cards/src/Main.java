import java.util.Arrays;
import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void initDeck(boolean[] deck){
        Arrays.fill(deck, true);
    }

    // returns whether or not all the cards in the deck
    // have already been dealt.
    public static boolean emptyDeck(boolean[] deck){
        boolean status = true;
        for(int j = 0 ; j< deck.length ; j++) {
            if (deck[j] == false) {
                status = false;
            }
        }
        return status;
    }
    public static int dealCard(boolean[] deck){
        Random rand = new Random();
        int randCard = rand.nextInt(52);
        if (deck[randCard] == true){
            deck[randCard] = false;
        }
        else{
            dealCard(deck);
        }
        return randCard;
    }


    public static void main(String[] args) {
        String[] deckVal = {"CA", "C1", "C2", "C3", "C4", "C5", "C6", "C7", "C8", "C9", "C10", "CJ", "CQ", "CK",
                            "SA", "S1", "S2", "S3", "S4", "S5", "S6", "S7", "S8", "S9", "S10", "SJ", "SQ", "SK",
                            "HA","H1","H2","H3","H4","H5","H6","H7","H8","H9","H10","HJ","HQ","HK",
                            "DA","D1","D2","D3","D4","D5","D6","D7","D8","D9","D10","DJ","DQ","DK"};

        boolean[] myDeck = new boolean[52];
        final int cardsPerRow = 8;
        int cardsThisRow = 0;
        int myCard;
        initDeck(myDeck);
        int dealtCard = dealCard(myDeck);
        System.out.println(dealtCard);
        for(int l = 0 ; l < myDeck.length ; l++ ) System.out.println(myDeck[l]);

        System.out.println("\n Here is shuffled deck ...\n");
        boolean check = emptyDeck(myDeck);

    }



}