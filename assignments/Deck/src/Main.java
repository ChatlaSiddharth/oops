// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import com.sun.source.tree.WhileLoopTree;

public class Main {
    public static void main(String[] args) {

        Deck myDeck = new Deck();
        final int cardsPerRow = 8;
        int cardsThisRow = 0;
        String temp ;
        int myCard;
        while(!myDeck.emptyDeck()){
            myCard = myDeck.dealCard();
            ++cardsThisRow;
            if (cardsThisRow <= cardsPerRow) {
                temp = myDeck.printCard(myCard);
                System.out.print(temp);
                System.out.print("  ");
            }
            else{
                System.out.println("");
                cardsThisRow = 1;
                temp = myDeck.printCard(myCard);
                System.out.print(temp);
                System.out.print("  ");
            }
        }
        System.out.println("\n");
        System.out.println("\nSmart Cards Implementation :");

        //-----------------------------------------------------------------------------------------------------
        // The Code in the above myDeck which is an object of the class Deck is the same
        // as the code below that is works with the object of SmartDeck class.
        // This is because the Smart Deck extends the class Deck, we also override the same methods in the
        // SmartDeck Class
        //------------------------------------------------------------------------------------------------------

        SmartDeck myDeck2 = new SmartDeck();
        final int cardsPerRow2 = 8;
        int cardsThisRow2 = 0;
        String temp2 ;
        int myCard2;
        while(!myDeck2.emptyDeck()){
            myCard2 = myDeck2.dealCard();
            ++cardsThisRow2;
            if (cardsThisRow2 <= cardsPerRow2) {
                temp2 = myDeck2.printCard(myCard2);
                System.out.print(temp2);
                System.out.print("  ");
            }
            else{
                System.out.println("");
                cardsThisRow2 = 1;
                temp2 = myDeck2.printCard(myCard2);
                System.out.print(temp2);
                System.out.print("  ");
            }
        }
        System.out.println("\n");
        System.out.println("\nCards Dealt: " + myDeck2.getCardsDealt());
    }

}

