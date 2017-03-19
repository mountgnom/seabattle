package GameImpl;

import Game.Deck;

/**
 * Created by TDzhahangirov on 19.03.2017.
 */
public class DeckImpl implements Deck {

    private int x;
    private int y;
    private String shipId;

    public void setX(int x) {
        this.x=x;
    }

    public int getX() {
        return this.x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return this.y;
    }

    public void setShipId(String shipId) {
        this.shipId = shipId;
    }

    public String getShipId() {
        return this.shipId;
    }

    public boolean isCrashed() {
        return false;
    }
}
