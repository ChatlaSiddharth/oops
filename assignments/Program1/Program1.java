//code documentation 
//Program specification

//Emulate full deck of cards

//Mandatory methods

public static void initDeck(boolean[] deck){
//set the values of deck to indicate they are all present - not dealt yet
    for(int i = 0 ; i<deck.length; i++)
    {
        deck[i] = true;
    }
}
/*
public static boolean emptyDeck(boolean[] deck){
    
//returns whether or not all the cards in the deck have already been dealt
}

public static int dealCard(boolean[] deck){
// return a card (an int in the range 0 to 51) at random that has not been dealt
// since the deck was initialized via intDeck. Also notes that this card is no longer available
}

public static void printCard(int card){
// given a card (an int in the range 0 to 51) prints
// an appropriate representation of this card based
// on a 1-1 and onto mapping of the set [0, 51] to
// the cards described above.
}
*/

public static void main(String[] args){
    boolean[] myDeck = new boolean[52];
/*
    final int cardsPerRow = 8;
    int cardsThisRow = 0;
    int myCard;
    initDeck(myDeck);
    System.out.println("\nHere is the shuffled deck ..\n");
    while(!emptyDeck(myDeck))
    {
        myCard = dealCard(myDeck);
        ++cardsThisRow;
        if (cardsRhisRow <= cardsPerRow)
        {
            printCard(myCard);
        }
        else
        {
            System.out.println("");
            cardsThisRow = 1;
            printCard(myCard);
            System.out.println(" ");
        }
    }
    System.out.println('\n');
}
