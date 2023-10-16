package manager;

import dao.ReadAndWriteFoodList;
import model.Food;

import java.util.ArrayList;
import java.util.List;

public class FoodManager implements IManager<Food> {
    List<Food> foodList;
    ReadAndWriteFoodList readAndWriteFoodList = new ReadAndWriteFoodList();

    @Override
    public boolean add(Food food) {
        this.foodList.add(food);
        readAndWriteFoodList.writeFile(this.foodList);
        return false;
    }

    @Override
    public boolean edit(int id, Food newFood) {
        int index = findById(id);
        this.foodList.set(index, newFood);
        readAndWriteFoodList.writeFile(foodList);
        return true;
    }

    @Override
    public boolean delete(int id) {
        int index = findById(id);
        this.foodList.remove(index);
        readAndWriteFoodList.writeFile(foodList);
        return true;
    }

    @Override
    public List<Food> showAll() {
        return this.foodList;
    }

    public int findById(int id) {
        for (int i = 0; i < this.foodList.size(); i++) {
            if (id == this.foodList.get(i).getId()) {
                return i;
            }
        }
        return -1;
    }
}
