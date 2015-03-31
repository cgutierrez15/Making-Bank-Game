import java.util.Scanner;

public class MakingBank
{
  public static void main(String args[])
    
  {
    Scanner input = new Scanner(System.in); 
    
    System.out.println("You have $10K, you need to make $50K in 10 Days . . .");
    
    System.out.println("Choose how much money to spend Investing, Gambling, Hustling, or Extreme (Wild Card) per Day.");

    System.out.println(" ");
    
    PlayerTurn player = new PlayerTurn();  // PlayerTurn class object
   // player.setbank(10000); 
    
    System.out.println("How much money would you like to Invest? You have a 90% chance of making 2% and a 10% chance of loosing everything.");
    int investnum = input.nextInt();
    player.calcinvest(investnum); 
    //player.checkbank(player.calcinvest(investnum)); 

    System.out.println(" ");
    
    System.out.println("How much money would you like to Gamble? You have a 50% chance of doubling your money or loosing everything.");
    int gamblenum = input.nextInt();
    player.calcgamble(gamblenum); 
    //player.checkbank(player.calcgamble(gamblenum)); 
    
    System.out.println("How much money would you like to Hustle? You have an 80% chance of Making a 30% profit or a 20% chance of breaking even.");
    int hustlenum = input.nextInt();
    player.calchustle(hustlenum); 
    
    System.out.println("Extreme Challenge: A crazy film producer is offering anyone $5,000 to drive through a real burning building. It’s off the record so you’d have to foot the medical bill. The Biggest Risk for the Biggest Reward. Are you up for the challenge?");
    String extremeval = input.nextLine();
    player.calcextreme(extremeval); 
  
  }
}