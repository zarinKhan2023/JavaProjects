/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fastfoodkitchen;

/**
 *
 * @author zkhan
 */
public class BurgerOrder {
    private int numHamburgers = 0;
    private int numCheeseburgers = 0;
    private int numVeggieburgers = 0;
    private int numSodas = 0;
    private boolean orderToGo = false; 
    private int orderNum = 1;
    
    public BurgerOrder(){
        
    }
    /**
     * 
     * @param hamburgers number of hamburgers
     * @param cheeseburgers number of cheeseburgers
     * @param veggie number of veggieburgers
     * @param soda number of sodas
     * @param order  order (yes/no)
     * @param numOrd number of order 
     */
    public BurgerOrder( int hamburgers , int cheeseburgers, int veggie, int soda, boolean order, int numOrd){
    numHamburgers = hamburgers; 
    numCheeseburgers = cheeseburgers;
    numVeggieburgers = veggie;
    numSodas = soda; 
    orderToGo = order; 
    orderNum = numOrd;
    }
    /**
     * sets the number of hamburgers
     * @param hamburgers 
     */
    public void setNumHamburger( int hamburgers){
          if(numHamburgers <= 0){
            System.out.println("Error. Try a value more than 0");
        }else{
          this.numHamburgers = hamburgers;  
        }
    }
    /**
     * returns number of hamburgers
     * @return  number of hamburgers
     */
    public int getNumHamburger(){
        return numHamburgers;
    }
    /**
     * sets the number of cheese burgers
     * @param cheeseburgers 
     */
    public void setNumCheeseburger(int cheeseburgers ){
         if (numCheeseburgers <= 0){
            System.out.println("Error. Try a value ore than 0");
        }else{
            this.numCheeseburgers = cheeseburgers;
        }
    }
    /**
     * returns the number of cheese burger
     * @return the number of cheeseburgers
     */
    public int getNumCheeseburger(){
        return numCheeseburgers;
     }
    /**
     * sets the number of soda
     * @param soda 
     */
    public void setNumSodas(int soda){
                if(numSodas <= 0){
            System.out.println("Error. Try a value more than 0");
        }else{
            this.numSodas = soda; 
        }
    }
    /**
     * sets the number of veggie burger
     * @param veggieBurger  
     */
    public void setNumVeggieburger (int veggieBurger){
        if(numVeggieburgers <= 0){
            System.out.println("Error.Try a value more than 0");
        }else{
            this.numVeggieburgers = veggieBurger;
        }
    }
    /**
     * returns the number of veggieburgers
     * @return number of veggieburgers
     */
    public int getNumVeggieburger(){
      return numVeggieburgers;  
    }
    /**
     * returns the number of sodas
     * @return number of sodas
     */
    public int getNumSodas(){
        return numSodas;  
    }
    /**
     * sets order to go
     * @param order 
     */
    public void setOrderToGo( boolean order){
        this.orderToGo = order;
        
    }
    /**
     * returns order to go
     * @return order to go
     */
    public boolean isOrderToGo(){
        return orderToGo;  
    }
    /**
     * set number of order
     * @param numOrder  
     */
    public void setOrderNum( int numOrder){
        this.orderNum = numOrder;
    }
    /**
     * returns the number of orders
     * @return number of order
     */
    public int getOrderNum(){
        return orderNum;
    }
    
 }
 

