

public class TripleDiceWithHistory extends TripleDice implements Cloneable
{
 
 int [] myArr;
 int numThrows;
 public TripleDiceWithHistory(int bounces)
 {
  super(bounces);
  myArr = new int[10];
  for(int i = 0; i<10; i++)
   myArr[i] = 0;
  numThrows = 0;
 }
 
 @Override
 public int Throw()
 {
  int value = super.Throw();
  myArr[numThrows] = value;
  numThrows++;
  return value;
 }
 
 @Override
 public String toString()
 {
  String history = new String();
  for(int i = 0; i<numThrows; i++)
  {
   history += "Throw " + (i+1) + ": " + myArr[i] + "\n";
  }
  
  return super.toString() + "\n" + history; 
  
 }
 
 @Override
 public boolean equals(Object obj) 
 {
     if (obj instanceof TripleDiceWithHistory)
         return (value== ((TripleDiceWithHistory)obj).Value()) ; 
     else
         return false;
 }
 
 @Override
 public Object clone() throws CloneNotSupportedException
 {
	 return (TripleDiceWithHistory) super.clone();
 }
 
 
}

//-- end of TripleDiceWithHistory.java ------------------------
// Good job, Emmanuel
