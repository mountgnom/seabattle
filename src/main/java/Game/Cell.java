package Game;

/**
 * Клетка игровой доски, может быть палубой корабля.
 *
 * Created by TDzhahangirov on 16.03.2017.
 */
public interface Cell {

    /**
     * устанавлимвает координату X (А-К)
     * @param x
     */
    void setX(int x);

    /**
     * @return   координату X (А-К)
     */
    int getX();

    /**
     * устанавлимвает координату Y (1-10)
     * @param y
     */
    void setY(int y);

    /**
     * @return   координату Y (1-10)
     */
    int getY();

    /**
     *
     * @return признак, является ли клетка доски палубой корабля. определяется по наличию id корабля
     */
    //boolean isDeck();

}
