// Programmer: Emmanuel Aguirre
// HW: Wk 13
// Class: Cmpr112
// File: Dice.java

public class Dice
{
 int value; 
 int myDices;
 int myBounces;
 
 public Dice(int dices, int bounces) 
 {  
  value = 0; 
  myDices = dices;
  myBounces = bounces;
 }  
 
 public int Throw() 
 { 
  int total= 0;
  for(int i = 0; i < myDices; i++)
  {
   int avg = 0;
   for(int j = myBounces; j > 0; j--) 
  
   {
    avg += (1 + (int) (Math.random() * 6)); 
    avg/=myBounces;
    total+=avg;
   }
  }
  
  value = total;
  //System.out.println(value);
  return value; 
 } 
 
 public int Value() 
 {  
  return value; 
 }
 
 @Override
 public String toString()
 {
  return "Number of Dices: " + myDices
    + "\nNumber of Bounces: " + myBounces
    + "\nCurrent Value: " + value;
 }
 
 
}

//-- end of Dice.java ------------------------