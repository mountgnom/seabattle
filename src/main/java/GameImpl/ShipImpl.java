package GameImpl;

import Game.Deck;
import Game.Ship;

import java.util.List;

/**
 * Created by TDzhahangirov on 19.03.2017.
 */
public class ShipImpl implements Ship {

    private List<Deck> decks;

    public List<Deck> getDecks() {
        return this.decks;
    }

    public void setDecks(List<Deck> decks) {
        this.decks = decks;
    }

    public boolean isCrashed() {
        for(Deck deck:this.decks){
            if(!deck.isCrashed()) return false;
        }
        return true;
    }
}
