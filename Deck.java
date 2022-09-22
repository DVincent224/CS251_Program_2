public class Deck {
    private boolean[] deck = new boolean[52];

    public void initDeck(){
        for(int i=0;i<this.deck.length;i++){
            this.deck[i] = true;
        }
    }
}
