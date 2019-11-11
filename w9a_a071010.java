import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
  // Write your code here
  int numD, quot, i=1, j;
  int numB[] = new int[100];
  Scanner scan = new Scanner(System.in);
  
  System.out.print("Decimal goes here--");
  numD =scan.nextInt();
  
  quot = numD();
  
  while (quot !=0)
  {
    numB[i++] = quot%2;
    quot = quot/2;
  }
  System.out.print("THE BINARY NUMBER IS");
  for(j=i-1; j>0; j--)
  {
    System.out.print(numB[j]);
  }
  System.out.print("\n");
  }
  }
  
 
