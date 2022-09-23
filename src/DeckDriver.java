public class DeckDriver {
    public static void main(String[] args){
        final int cardsPerRow = 8;
        int cardsThisRow = 0;
        int myCard;
        Deck myDeck = new Deck();
        myDeck.initDeck();
        System.out.println("\nHere is a shuffled deck ...\n");
        while (!(myDeck.emptyDeck())){
            myCard = myDeck.dealCard();
            ++cardsThisRow;
            if (cardsThisRow <= cardsPerRow){
                System.out.print(Deck.cardToString(myCard));
                System.out.print(" ");
            }
            else{
                System.out.println("");
                cardsThisRow = 1;
                Deck.cardToString(myCard);

            }
        }
    }
}
