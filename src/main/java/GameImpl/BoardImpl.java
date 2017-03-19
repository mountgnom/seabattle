package GameImpl;

import Game.Board;
import Game.Ship;

import java.util.List;

/**
 * Created by TDzhahangirov on 19.03.2017.
 */
public class BoardImpl implements Board {

    private List<Gamer> gamers;

// TODO: 19.03.2017
     public Gamer createGamer() {
         if (this.gamers.size()==2) return null;
         Gamer gamer = new Gamer();
         this.gamers.add(gamer);
         return gamer;
    }

    public class Gamer implements  Board.Gamer{

        private List<Ship> ships;

        public List<Ship> getShips() {
            return ships;
        }

        public void setShips(List<Ship> ships) {
            this.ships = ships;
        }
    }

}
