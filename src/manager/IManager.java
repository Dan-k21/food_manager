package manager;

import model.Food;

import java.util.ArrayList;
import java.util.List;

public interface IManager<F> {
    boolean add(F food);
    boolean edit(int id, F newFood);
    boolean delete(int id);
    List<F> showAll();
}
