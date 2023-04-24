import java.util.Scanner;
import javax.swing.*;
public class CandleShop{
    public static void main(String[] args){
        //****************
        // project 2
        //****************  
        Scanner scan = new Scanner(System.in);

        // the candle variable 
        String name = "";
        Double cost = 0.0;
        int burnTime = 0;
        int type = 0; 
        double discountCost;

        //instantiate candles with its object 
        Candle one = new Candle( name, 0, cost, burnTime);
        Candle two = new Candle( name, 0, cost, burnTime);
        Candle three = new Candle( name, 0, cost, burnTime);

        //Print welcome statement for the shop set upa
        System.out.println("Welcome to the candle shop! Let's set up the shop.");

        //Creates a for loop of 3 types of candles to collect input of name, cost, burntime
        for(type = 1; type <= 3; type++){
            System.out.print("\nPlease enter the name for candle type " + type + ": ");
            name = scan.nextLine();
            
            System.out.print("\nPlease enter the price for the candle type " + type + ": ");
            cost = scan.nextDouble();
            
            System.out.print("\nPlease enter the burn time (hours) for candle type " + type + ": ");
            burnTime = scan.nextInt();

            scan.nextLine();
        //storing information based on shopkeep input for later calls
            if(type == 1){
                one.setName(name);
                one.setCost(cost);
                one.setTime(burnTime);
            }
            else if( type == 2){
                two.setName(name);
                two.setCost(cost);
                two.setTime(burnTime); 
            }
            else{
                three.setName(name);
                three.setCost(cost);
                three.setTime(burnTime);
            }
        //creates an empty space 
        }System.out.println();

        //visual representation of the cost, type, candle name , burn time as a table
        JFrame JFrame = new JFrame();
        String[][] tableData = {{"1", one.getName(), String.valueOf(one.getCost()),String.valueOf(one.getTime())}, 
            {"2", two.getName(), String.valueOf(two.getCost()), String.valueOf(two.getTime())},
            {"3", three.getName(), String.valueOf(three.getCost()), String.valueOf(three.getTime())}};
        String[] tableColumn = { "Type", "Candle Name", "Cost/Candle ($)", "Burn Time hours"};
        JTable jTable = new JTable(tableData, tableColumn);

        jTable.setBounds( 30, 40, 230, 280);
        JScrollPane jScrollPane = new JScrollPane(jTable);
        JFrame.add(jScrollPane);
        JFrame.setSize(400, 200);
        JFrame.setVisible(true);
        
        //Prints input of the customer's purchase 
        System.out.println("Welcome to the Candle shop! Pick your favorite choice of candle from our collection!");
        System.out.println("\nPlease enter the number of " + one.getName() + " candles for purchase: ");
        int totalCandleOne = scan.nextInt();
        System.out.println("\nPlease enter the number of " + two.getName() + " candles for purchase: ");
        int totalCandleTwo = scan.nextInt();
        System.out.println("\nPlease enter the number of " + three.getName() + " candles for purchase: ");
        int totalCandleThree = scan.nextInt();

        //calculate total cost, and output the total cost 
        double totalCost = ((one.getCost() * totalCandleOne) + 
                            ( two.getCost() * totalCandleTwo) + 
                            ( three.getCost() * totalCandleThree));
        int totalPurchase = totalCandleOne + totalCandleTwo + totalCandleThree;
        
        System.out.println("You have made a purchase of " + totalPurchase + " candles");
        System.out.println("You have purchased " + one.getName() + " Type 1 candles, " 
                            + two.getName() + " Type 2 Candles and " + three.getName()
                            + "Type 3 candles!");

        System.out.println("Your total cost of the candles is " + totalCost + " dollars (USD)");
        
        //compute of total cost after discount and output the total cost after discount
        if( (totalCost>= 20) && (totalCost < 35)){
            discountCost = totalCost* 0.95;
            System.out.println("Your total cost after the discount is " + String.format( "%.2f",discountCost)  + " Dollars.");
        } else if((totalCost>= 35) && (totalCost < 55)){
            discountCost = totalCost * 0.93;
            System.out.println("Your total cost after the discount is " + String.format( "%.2f", discountCost)  + " Dollars.");  
        }else if ((totalCost >=55) && (totalCost < 100)){
            discountCost = totalCost * 0.90;
            System.out.println("Your total cost after the discount is " + String.format( "%.2f", discountCost)  + " Dollars.");
        }
        else{
            discountCost = totalCost * 0.80;
            System.out.println("Your total cost after the discount is " + String.format( "%.2f", discountCost)  + " Dollars.");
        }

        //calculate total burn time and burn time cost per minute
        int totalBurnTime = (( one.getTime() * totalCandleOne) + 
                            ( two.getTime() * totalCandleTwo) + 
                            ( three.getTime() * totalCandleThree));
        double burnTimeCost = (discountCost / (totalBurnTime * 60));

        // output the total burn time and burn time cost per minute
        System.out.print("The total burn time is " + totalBurnTime + " hours");
        System.out.println(" The total burn cost per minute is " +  String.format( "%.2f", burnTimeCost) + " dollars");
        System.out.println();
        
        //output of a histogram displaying amount of candles of each type using three for loops
        System.out.println("Histogram of # of candles purchased:");
        System.out.print(totalCandleOne + " Type 1 " + one.getName()+ " Candles: " );
        for( int i = 1 ; i<= totalCandleOne; i++){
            System.out.print("#");
        }
        System.out.println();
        System.out.print(totalCandleTwo + " Type 2 " + two.getName()+ " Candles: ");
        for( int i = 1; i<= totalCandleTwo; i++ ){
           System.out.print("+");
        }
        System.out.println();
        System.out.print(totalCandleThree + " Type 3 " + three.getName()+ " Candles: ");
        for( int i = 1; i<= totalCandleThree; i++ ){
            System.out.print("@");
        }
        System.out.println();

        //Customer input of loyalty program
        System.out.println("\nAre you a part of the loyalty Program? Press 1 if Yes and Press 2 if No");
        int loyalty = scan.nextInt();
        
        // output of loyalty points depending on total candle value
        int loyaltyPoint = totalPurchase / 10;
        if( loyalty == 1){
            System.out.println();
            System.out.println("!!!!!!!!!!!!Here is your loyatly program progress!!!!!!!!!!!!");
             if( loyaltyPoint <=0)
             {
                System.out.println("Your current loyalty point is 0. Make  more purchases");
             }
             else{
                 System.out.println("You have earned " + loyaltyPoint + " loyalty points today");
             }
        }else{
            System.out.println("Please seek out a staff if you wish to become a member!");
        }
         scan.close();

         System.out.println("Thank you for shopping!");
    }
}
