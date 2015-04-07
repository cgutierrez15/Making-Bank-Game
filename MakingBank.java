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
    player.stockreturn(stocknum); 
    player.brokecheck();

    System.out.println(" ");
    
    System.out.println("INVESTMENT BANKING: You have a 90% chance of making 2% and a 10% chance of loosing everything.");
    double investnum = input.nextDouble();
    player.calcinvest(investnum); 
    player.brokecheck();

    System.out.println(" ");
    
    System.out.println("GAMBLING: You have a 50% chance of doubling your money or loosing everything.");
    double gamblenum = input.nextDouble();
    player.calcgamble(gamblenum); 
    //player.checkbank(player.calcgamble(gamblenum)); 
    player.brokecheck();
    
    System.out.println(" ");
    
    System.out.println("HUSTLING: You have an 80% chance of Making a 30% profit or a 20% chance of breaking even.");
    double hustlenum = input.nextDouble();
    player.calchustle(hustlenum); 
    player.brokecheck();
    
    System.out.println(" ");
    
    System.out.println("WILD CARD: A crazy film producer is offering anyone $5,000 to drive through a real burning building. ItÕs off the record so youÕd have to foot the medical bill. The Biggest Risk for the Biggest Reward. Are you up for the challenge? YES or NO?");
    String extremeval = input.next();
    player.calcextreme(extremeval); 
    player.brokecheck();
  
    System.out.println(" ");
    
    counter ++; 
    }
  }
}