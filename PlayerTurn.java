 import java.util.Random;
import java.util.Scanner; 

public class PlayerTurn{
  
Scanner keyboard = new Scanner(System.in);
Random rand = new Random();

double bank = 10000; 
double stockprice = 47.23;
double initstockprice = 0;  
double sharesnum = 0; 

public double bankround(){
  bank = (double)Math.round(bank * 100) / 100;
  return bank; 
}

  public double calcinvest(double investnum){
    if(investnum <= bank){
    if( new Random().nextDouble() <= 0.90 ) { 
      double investprofit = (investnum * 0.02); 
      bank += investprofit; 
      System.out.println("You returned" + " " + "$" + investprofit);
    }
    else{
      bank = bank - investnum; 
      System.out.println("You lost" + " " + "$" + investnum);
    }
    System.out.println("Your current balance is" + " " + "$" + bank); 
    }
    else{
      System.out.println("Insufficient funds. Transaction cancelled.");
    }
    return bank;

  }
  
  public double calcgamble(double gamblenum){
    if(gamblenum <= bank){
    if( new Random().nextDouble() <= 0.50 ) { 
      double gambleprofit = gamblenum; 
      bank += gambleprofit; 
      System.out.println("You won" + " " + "$" + gambleprofit);
    }
    else{
      bank = bank - gamblenum;
      System.out.println("You lost" + " " + "$" + gamblenum);
    }
    System.out.println("Your current balance is" + " " + "$" + bank);
    }
     else{
      System.out.println("Insufficient funds. Transaction cancelled.");
    }
    return bank; 
  }
    
  public double calchustle(double hustlenum){
    if(hustlenum <= bank){
    if( new Random().nextDouble() <= 0.80 ) { 
      double hustleprofit = hustlenum * 0.3; 
      bank += hustleprofit; 
      System.out.println("You profited" + " " + "$" + hustleprofit); 
    }
    else{
      bank = bank - (hustlenum * 0.1); 
      System.out.println("You lost: $" + hustlenum * 0.1);
    }
    System.out.println("Your current balance is: $" + bank); 
    }
    else{
      System.out.println("Insufficient funds. Transaction cancelled.");
    }
    return bank; 
  }
  
  public String calcextreme(String extremeval){
    //String lowercase = extremeval.toLowerCase();
    if(extremeval == "yes"){
      if( new Random().nextDouble() <= 0.70 ){
        double medicalbill = 2500; 
        bank = bank - medicalbill; 
        System.out.println("EPIC FAIL! You sausage, you just lost" + " " + "$" + medicalbill + " " + "on medical expenses!");
      }
      else{
        double extremecholo = 5000; 
        bank += extremecholo; 
        System.out.println("THAT WAS RADICAL! You escaped with only a few scratches. You just made 5G's.");
        System.out.println("Your current balance is" + " " + "$" + bank);
    }
    }
   else{
     System.out.println("Maybe next time."); 
    }
    return extremeval; 
  }
  
  public double brokecheck(){
  if(bank == 0.0){
    System.out.println("YOU LOST IT ALL! HOW COULD YOU!");
  }
  return bank;
}
  
 public double marketflux(){
   //System.out.println("MarketFlux called.");
      if( new Random().nextDouble() <= 0.50 ) { 
        stockprice = stockprice + Math.random() * 5; 
        stockprice = (double)Math.round(stockprice * 100) / 100;
      }
      else{
        stockprice = stockprice - Math.random() * 5; 
        stockprice = (double)Math.round(stockprice * 100) / 100;
      } 
      System.out.println("Stock price is $" + stockprice);
      return bank; 
      
    }
  
    public double stockquote(){
      System.out.println("Price Per Share:" + " " + "$" + stockprice);
           // System.out.println("Stock price is $" + stockprice);

      return stockprice; 
       

    }
    
    public double buyorder(double stocknum){
      if(stocknum * stockprice <= bank){
      sharesnum = stocknum; 
      bank = bank - ( stocknum * stockprice); 
      initstockprice = stockprice;
        //System.out.println("Stock price is $" + stockprice);
      }
      else{
      System.out.println("Insufficient funds. Transaction cancelled.");
    }
      return stockprice; 
          

    }
    
    public double sellorder(double sellnum){
      double initialval = sellnum * initstockprice; 
      double currentval = sellnum * stockprice; 
      double flux = currentval - initialval; 
      bank += initialval + flux; 
      if(flux >0){
        System.out.println("You made:" + " " + "$" + flux); 
        System.out.println("Your current balance is" + " " + "$" + bank);
              //System.out.println("Stock price is $" + stockprice);

      }
      else{
        System.out.println("You lost:" + " " + "$" + flux);
        System.out.println("Your current balance is" + " " + "$" + bank);
              //System.out.println("Stock price is $" + stockprice);

      }
      return flux; 
    }
  
    public double wincheck(){
      if (bank >= 1000000){
        System.out.println("Congratulations, you made 1 Million Dollars; you can surely win in Wall Street! Now see if you can get to 10 Million."); 
      }
      return bank; 
    }
  //public double checkbank(double bank){
  //if(bank == 0.0){
    //System.out.println("YOU LOST IT ALL! HOW COULD YOU!"); 
  //}
  //return bank; 
  
}



  



