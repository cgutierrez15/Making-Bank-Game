import java.util.Random;
import java.util.Scanner; 

public class stockmarket{
  Scanner keyboard = new Scanner(System.in);
  Random rand = new Random();
  
  double stockprice = 47.23;
  
    public void marketflux(){
      if( new Random().nextDouble() <= 0.50 ) { 
        stockprice = stockprice + Math.random() * 5; 
      }
      else{
        stockprice = stockprice - Math.random() * 5; 
      } 
    }
  
    public double stockquote(){
      System.out.println("Stock Price Per Share:");
      System.out.println("$" + stockprice); 
      return stockprice; 
    }
    
    public double buyorder(double stocknum){
      return stockprice; 
    }
}