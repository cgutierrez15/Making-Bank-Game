import java.util.Random;
import java.util.Scanner; 

public class PlayerTurn{
  
Scanner keyboard = new Scanner(System.in);
Random rand = new Random();

double bank = 10000; 


  //public double setbank(double b){
  //  double bank = b; 
   // return bank;
 // }
  
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
    return bank; 
  }
    
  public double calchustle(double hustlenum){
    if( new Random().nextDouble() <= 0.80 ) { 
      double hustleprofit = hustlenum * 0.3; 
      bank += hustleprofit; 
      System.out.println("You profited" + " " + "$" + hustleprofit); 
    }
    else{
      bank = bank; 
      System.out.println("You broke even");
    }
    System.out.println("Your current balance is:" + "" + "$" + bank); 
    return bank; 
  }
  
  public String calcextreme(String extremeval){
    return extremeval; 
  }
  
  //public double checkbank(double bank){
  //if(bank == 0.0){
    //System.out.println("YOU LOST IT ALL! HOW COULD YOU!"); 
  //}
  //return bank; 
  
}

  



