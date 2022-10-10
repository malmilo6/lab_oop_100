package edu.faf.oop.Order;

import edu.faf.oop.Menu.Dishes;
import edu.faf.oop.Menu.Menu;
import edu.faf.oop.RootClass.Root;

import java.util.Random;

public class Order extends Root {
    private long orderNumber;
    private String orderedFood;
    public double totalPrice;
    protected boolean discount;

    public Order(long orderNumber, String itemId) {
        super(itemId);
        this.orderNumber = orderNumber;
    }

    public void setOrderedFood(String orderedFood) {
        this.orderedFood = orderedFood;
    }
    public String getOrderedFood(){
        return orderedFood;
    }
    public void createOrder(Menu menu) {
        menu.fillList();
        menu.fillMenu();
        Random randIndex = new Random();
        int index = randIndex.nextInt(11);
        setOrderedFood(menu.getDish(index));
        totalPrice = menu.getChoice(menu.getDish(index));
    }

}
