import java.util.Scanner;

public class MakingBank
{
  public static void main(String args[])
    
  {
    PlayerTurn player = new PlayerTurn();  // PlayerTurn class object
    System.out.println("Welcome to Wall Street. You have $10K, whoever reaches 1 Million Dollars first wins!");
    
    System.out.println("Choose how much money to invest in stocks, banking, gambling, hustling or banking.");

    System.out.println(" ");
    
    int counter = 1; 
    
    while (counter < 11){
    Scanner input = new Scanner(System.in); 
    
    System.out.println("Welcome to Day" + " " + counter); 
    
    System.out.println(" "); 
    

    
    System.out.println("STOCK MARKET: Buy shares.");
    player.stockquote(); 
    System.out.println("How many shares would you like to buy?"); 
    double stocknum = input.nextDouble();
    player.buyorder(stocknum); 
    player.marketflux(); 
    player.brokecheck();
    System.out.println("How many shares would you like to sell?"); 
    double sellnum = input.nextDouble(); 
    player.bankround(); 
    player.sellorder(sellnum); 
    player.wincheck(); 
    player.bankround(); 

    System.out.println(" ");
    
    System.out.println("INVESTMENT BANKING: You have a 90% chance of making 2% and a 10% chance of loosing everything. How much money would you like to invest?");
    double investnum = input.nextDouble();
    player.calcinvest(investnum); 
    player.brokecheck();
    player.wincheck(); 
    player.bankround();
    
    System.out.println(" ");
    
    System.out.println("GAMBLING: You have a 50% chance of doubling your money or loosing everything. How much money would you like to gamble?");
    double gamblenum = input.nextDouble();
    player.calcgamble(gamblenum); 
    //player.checkbank(player.calcgamble(gamblenum)); 
    player.brokecheck();
    player.wincheck(); 
    player.bankround();
    
    System.out.println(" ");
    
    System.out.println("HUSTLING: You have an 80% chance of Making a 30% profit or a 20% chance of loosing 10%. How much money would you like to hustle?");
    double hustlenum = input.nextDouble();
    player.calchustle(hustlenum); 
    player.brokecheck();
    player.wincheck(); 
    player.bankround();
    
    System.out.println(" ");
    player.bankround();
    
    //System.out.println("WILD CARD: A crazy film producer is offering anyone $5,000 to drive through a real burning building. It�s off the record so you�d have to foot the medical bill. The Biggest Risk for the Biggest Reward. Are you up for the challenge? YES or NO?");
    //String extremeval = input.next();
    //player.calcextreme(extremeval); 
    //player.brokecheck();
  
    //System.out.println(" ");
    
    counter ++; 
    }
  }
}