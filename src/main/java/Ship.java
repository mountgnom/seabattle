import java.util.List;

/**
 * Корабль, состоит из списка клеток, являющихся его палубами
 *
 * Created by TDzhahangirov on 15.03.2017.
 */
public interface Ship {

    /**
     *
     * @return List<Deck> список палуб корабля
     */
    List<Cell> getDecks();

    /**
     * утснавливает список палуб корабля
     * @param decks - список палуб корабля
     */
    void setDecks(List<Deck> decks);

    /**
     *
     * @return признак того, что корабль разбит, True- если все палубы разбиты
     */
    boolean isCrashed();

}
