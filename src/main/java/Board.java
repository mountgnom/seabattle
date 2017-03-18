import javax.management.MXBean;
import java.util.List;

/**
 * Игровая доска, на ней располагаются корабли.
 *
 * Created by TDzhahangirov on 15.03.2017.
 */
@MXBean
public interface Board {

    /**
     * создание нового игрока. В реализации интерфейса доожнобыть ограничение на создание не болеечем 2х игроков
     * @return
     */
    public Gamer createGamer();


    @MXBean
    public interface Gamer{

        /**
         *
         * @return список кораблей игрока
         */
        List<Ship> getShips();

        /**
         * устанаваливает список караблей игрока
         * @param ships
         */
        void setShips(List<Ship> ships);
    };

}
