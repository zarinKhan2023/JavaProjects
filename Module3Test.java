/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fastfoodkitchen;

import java.util.ArrayList;

/**
 *
 * @author zkhan
 */
public class Module3Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      FastFoodKitchenSimulation kitchen = new FastFoodKitchenSimulation();
        
        // Part A
        int orderPosition = kitchen.findOrderSeq(2);
        System.out.println("Using sequential search >> order position is " + orderPosition);
        
        // Part B
        //kitchen.selectionSort();
        
        // Part C
        kitchen.insertionSort();
        ArrayList<BurgerOrder> sortedOrders = kitchen.getOrderList();
        int orderSize = 0;
        for (BurgerOrder order : sortedOrders) {
            orderSize = order.getNumCheeseburger() + order.getNumHamburger() + order.getNumVeggieburger();
            System.out.println(order.getOrderNum() + " has " + orderSize + " burgers.");
                    
        }
        
        // Part D
        orderPosition = kitchen.findOrderBin(2);
        System.out.println("Using binary search >> order position is " + orderPosition);
    }
    
}
  
