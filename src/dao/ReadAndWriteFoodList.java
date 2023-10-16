package dao;

import model.Food;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFoodList {
    File file = new File("food.csv");
    
    public void writeFile(List<Food> foodList) {
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String data = "";
            for (Food food :
                    foodList) {
                data += food.getId() + ", " +
                        food.getFood() + ", " +
                        food.getPrice() + ", " +
                        food.getCategory() + ", " +
                        food.getDescribe() + ", " +
                        food.getQuantity();
            }
            bufferedWriter.write(data);
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Food> readFile() {
        List<Food> foodList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(", ");
                Food food = new Food(data[0], Integer.parseInt(data[1]), data[2], data[3], Integer.parseInt(data[4]));
                foodList.add(food);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return foodList;
    }
}
