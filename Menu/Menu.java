package edu.faf.oop.Menu;

import java.util.HashMap;

public class Menu extends Dishes{

    private final HashMap<String, Double> menuPrice = new HashMap<>();


    public Menu(String menuType,String itemId) {
        super(menuType, itemId);
    }


    public void fillMenu() {
        menuPrice.put("Hamburger",50.0);
        menuPrice.put("Sandwich",45.0);
        menuPrice.put("Taco",30.0);
        menuPrice.put("Burrito",50.0);

        menuPrice.put("Milk Shake",15.0);
        menuPrice.put("Coca cola",13.0);
        menuPrice.put("Coffee",10.0);
        menuPrice.put("Tea",8.0);

        menuPrice.put("Cake",12.0);
        menuPrice.put("Tiramisu",20.0);
        menuPrice.put("Apple pie",15.0);
        menuPrice.put("Cookies",14.0);
    }
    public double getChoice(String dish) {
        return menuPrice.get(dish);
    }
}
