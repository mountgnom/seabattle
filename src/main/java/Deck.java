/**
 * Палуба корабля. наследует интерфейс "Клетка игровой доски"
 *
 * Created by TDzhahangirov on 18.03.2017.
 */
public interface Deck extends Cell {

    /**
     * устанавливает id корабля, палубой которого является данная клетка
     * @param shipId
     */
    void setShipId(String shipId);

    /**
     *
     * @return id корабля, палубой которого является данная клетка
     */
    String getShipId();

    /**
     *
     * @return - признак, является ли палуба разбитой
     */
    boolean isCrashed();

}
