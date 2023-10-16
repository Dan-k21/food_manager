package view;

import input.Input;
import manager.FoodManager;

public class Menu {
    private FoodManager listFood = new FoodManager();

    public void showMainMenu() {
        int choice;
        do {
            System.out.println("--------------------------\n" +
                               "      Quản lý MENU     \n" +
                    "1. Thêm sản phẩm\n" +
                    "2. Sửa sản phẩm\n" +
                    "3. Xoá sản phẩm\n" +
                    "0. Thoát\n");
            choice = Input.getInputInt();
            switch (choice) {
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }
}
