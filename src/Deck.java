public class Deck {
    private boolean[] deck = new boolean[52];

    public void initDeck(){
        for(int i=0;i<this.deck.length;i++){
            this.deck[i] = true;
        }
    }

    public boolean emptyDeck(){
        for (int i = 0; i < this.deck.length; i++){
            if (deck[i] == true){
                return false;
            }
        }
        return true;
    }

    public int dealCard(){
        int card = 0;
        do{
            card = (int)Math.floor(Math.random()*(52));
        }while(!(this.deck[card]));
        this.deck[card] = false;
        return card;
    }

    public static String cardToString(int card){
        String[] deckMap = new String[]{"AS","2S","3S","4S","5S","6S","7S","8S","9S","10S","JS","QS","KS",
        "AC","2C","3C","4C","5C","6C","7C","8C","9C","10C","JC","QC","KC",
        "AH","2H","3H","4H","5H","6H","7H","8H","9H","10H","JH","QH","KH",
        "AD","2D","3D","4D","5D","6D","7D","8D","9D","10D","JD","QD","KD"};
        return deckMap[card];
    }    
}
