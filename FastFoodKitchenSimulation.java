package fastfoodkitchen;

import java.util.ArrayList;

/**
 *
 * @author zkhan
 */
public class FastFoodKitchenSimulation {
    
    private ArrayList<BurgerOrder> orderList = new ArrayList<BurgerOrder>();
    private static int nextOrderNum = 1;
    
    /**
     * Constructor to have at least one order in orderList
     */
    public FastFoodKitchenSimulation() {
    
        BurgerOrder order1 = new BurgerOrder(3, 0, 0, 0, true, nextOrderNum);
        orderList.add(order1);
        FastFoodKitchenSimulation.incrementNextOrderNum();
        BurgerOrder order2 = new BurgerOrder(2, 0, 0, 0, true, nextOrderNum);
        orderList.add(order2);
        FastFoodKitchenSimulation.incrementNextOrderNum();
        BurgerOrder order3 = new BurgerOrder(1, 0, 0, 0, true, nextOrderNum);
        orderList.add(order3);
        FastFoodKitchenSimulation.incrementNextOrderNum();
        
    };
    
    /**
     * Finds an order number in the list using sequential algorithm
     * @param orderID
     * @return The position of the order (-1 if order is not found)
     */
    public int findOrderSeq(int orderID) {
        for (int i = 0; i < orderList.size(); i++) {
            if (orderList.get(i).getOrderNum() == orderID) {
                return i;
            }
        }
        return -1;
    }
    
    /**
     * Sorts the order list using selection algorithm
     */
    public void selectionSort() {
        
        // Loops through holding i as compared
        for (int i = 0; i < orderList.size(); i++) {
            //Sets smallest position to current i position
            int smallestPos = i;
            
            // Gets the amount of burgers in the order listed in i position
            int iBurgers = orderList.get(i).getNumCheeseburger() + orderList.get(i).getNumHamburger() + orderList.get(i).getNumVeggieburger();
            for (int j = i + 1; j < orderList.size(); j++) {
                // Gets the amount of burgers in the order listed in j position
                int jBurgers = orderList.get(j).getNumCheeseburger() + orderList.get(j).getNumHamburger() + orderList.get(j).getNumVeggieburger();
                
                // Sets the smallest known amount of burgers to i
                int smallest = iBurgers;
                // If amount found at j is less, then replace values
                if (jBurgers < smallest) {
                    // Smallest amount becomes whatever was found in jburgers
                    smallest = jBurgers;
                    // Smallest position is found at whatever this j position is
                    smallestPos = j;
                    // Sets iOrder to whatever was in I position
                    BurgerOrder iOrder = orderList.get(i);
                    if (orderList.get(smallestPos) != iOrder) {
                        orderList.set(i, orderList.get(smallestPos));
                        orderList.set(smallestPos, iOrder);
                    }
                }
            }
        }
    }
    
    
    public void insertionSort() {
        for (int j = 1; j < orderList.size(); j++) {
            int temp = getBurgers(j);
            BurgerOrder tempOrder = orderList.get(j);
            int possibleIndex = j;
            while (possibleIndex > 0 && temp < getBurgers(possibleIndex-1)) {
                orderList.set(possibleIndex, orderList.get(possibleIndex - 1));
                possibleIndex--;
            }
            orderList.set(possibleIndex, tempOrder);
        }
    }
    
    
    public int getBurgers(int i) {
        BurgerOrder order = orderList.get(i);
        int num = order.getNumCheeseburger()+order.getNumHamburger()+order.getNumVeggieburger();
        return num;
    }
    
    /**
     * Finds an order using binary algorithm
     * @param orderID
     * @return The position of the order (-1 if order is not found)
     */
    public int findOrderBin(int orderID) {
        int left = 0;
        int right = orderList.size() - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (orderID < orderList.get(middle).getOrderNum()) {
                right = middle - 1;
            }
            else if (orderID > orderList.get(middle).getOrderNum()) {
                left = middle + 1;
            }
            else {
                return middle;
            }
        }
        return -1;
    }
    
    public ArrayList<BurgerOrder> getOrderList() {
        return orderList;
    }
    
    /**
     * Gets the next order number
     * @return Next order number
     */
    public int getNextOrderNum() {
        return nextOrderNum;
    }
    
    /**
     * Increments the order number
     */
    private static void incrementNextOrderNum() {
        nextOrderNum++;
    }
    
    /**
     * Adds an order to the list
     * @param ham Hamburgers
     * @param cheese CheeseBurgers
     * @param veggie VeggieBurgers
     * @param soda Sodas
     * @param toGo To Go
     * @return The number of the next order
     */
    public int addOrder(int ham, int cheese, int veggie, int soda, boolean toGo) {
        int nextOrder = getNextOrderNum();
        BurgerOrder order = new BurgerOrder(ham, cheese, veggie, soda, toGo, nextOrder);
        orderList.add(order);
        FastFoodKitchenSimulation.incrementNextOrderNum();
        return nextOrder;
    }
    
    /**
     * Cancels the last order entered
     * @return Whether the last order was successfully removed
     */
    public boolean cancelLastOrder() {
        if (!orderList.isEmpty()) {
            orderList.remove(orderList.size() - 1);
            nextOrderNum--;
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * Gets the amount of orders pending
     * @return Orders Pending
     */
    public int getNumOrdersPending() {
        return orderList.size();
    }
    
    /**
     * Determines if a given order is done
     * @param orderID Order number
     * @return If order ID is done
     */
    public boolean isOrderDone(int orderID) {
        for (int i = 0; i < orderList.size() - 1; i++) {
            int orderNum = orderList.get(i).getOrderNum();
            if (orderNum == orderID) {
                return false;
            }
        }
        return true;
    }
    
    public boolean cancelOrder(int orderID) {
        for (int i = 0; i < orderList.size() - 1; i++) {
            int orderNum = orderList.get(i).getOrderNum();
            if (orderNum == orderID) {
                orderList.remove(i);
                return true;
            }
        }
        return false;
    }
    
}
