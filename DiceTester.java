// Programmer: Emmanuel Aguirre
// Lab 8
// Class: Cmpr112
// File: DiceTester.java


public class DiceTester 
{

 public static void main(String[] args) 
 {
  Dice first = new Dice(5,1);
  first.Throw();
  System.out.println(first); //implicitly calls first.toString();
  
  System.out.println();
  
  TripleDice threeDice = new TripleDice(1);
  threeDice.Throw();
  System.out.println(threeDice); //implicitly calls threeDice.toString();
  
  System.out.println();
  
  TripleDiceWithHistory threeDiceHistory = new TripleDiceWithHistory(1);
  threeDiceHistory.Throw();
  threeDiceHistory.Throw();
  threeDiceHistory.Throw();
  System.out.println(threeDiceHistory); //implicitly calls threeDiceHistory.toString();
  
  TripleDiceWithHistory threeDiceHistoryTwo = new TripleDiceWithHistory(1);
  threeDiceHistoryTwo.Throw();
  threeDiceHistoryTwo.Throw();
  threeDiceHistoryTwo.Throw();
  System.out.println(threeDiceHistoryTwo);
  
  if(threeDiceHistory.equals(threeDiceHistoryTwo))
  {
	  System.out.println("The two TripleDiceWithHistory have equal values.");
  }
  
  System.exit(0);
  
 
 }

}

//-- end of DiceTester.java ------------------------