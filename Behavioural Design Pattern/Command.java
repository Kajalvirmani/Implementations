import java.util.ArrayList;
import java.util.List;
// Step 1
// Create a command interface.

// Order.java

 interface Order {
   void execute();
}
// Step 2
// Create a request class.

// Stock.java

 class Stock {
	
   private String name = "ABC";
   private int quantity = 10;

   public void buy(){
      System.out.println("Stock [ Name: "+name+",Quantity: " + quantity +" ] bought");
         
   }
   public void sell(){
      System.out.println("Stock [ Name: "+name+",Quantity: " + quantity +" ] sold");
   }
}
// Step 3
// Create concrete classes implementing the Order interface.

// BuyStock.java

 class BuyStock implements Order {
   private Stock abcStock;

   public BuyStock(Stock abcStock){
      this.abcStock = abcStock;
   }

   public void execute() {
      abcStock.buy();
   }
}
// SellStock.java

 class SellStock implements Order {
   private Stock abcStock;

   public SellStock(Stock abcStock){
      this.abcStock = abcStock;
   }

   public void execute() {
      abcStock.sell();
   }
}
// Step 4
// Create command invoker class.

//Broker.java



 class Broker {
   private List<Order> orderList = new ArrayList<Order>(); 

   public void takeOrder(Order order){
      orderList.add(order);		
   }

   public void placeOrders(){
   
      for (Order order : orderList) {
         order.execute();
      }
      orderList.clear();
   }
}
// Step 5
// Use the Broker class to take and execute commands.

// CommandPatternDemo.java

public class Command {
   public static void main(String[] args) {
      Stock abcStock = new Stock();

      BuyStock buyStockOrder = new BuyStock(abcStock);
      SellStock sellStockOrder = new SellStock(abcStock);

      Broker broker = new Broker();
      broker.takeOrder(buyStockOrder);
      broker.takeOrder(sellStockOrder);

      broker.placeOrders();
   }
}