import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int totalSymbolAmt, numPerRow;
      char symbol;
  
      System.out.print("Gimme a symbol to print out:");
      symbol = input.next().charAt(0);
  
      System.out.print("Enter how many times you want the symbol to appear: ");
      totalSymbolAmt = input.nextInt();
  
      System.out.print("Enter how many times you want the symbol to show up per line: ");
      
      numPerRow = input.nextInt();
  
      //System.out.println("eep");
      int counter = 1;
  
        for(int i = 1; i <= totalSymbolAmt; i++) {
  
          if(counter == (numPerRow)){
            counter = 1;
            System.out.print(symbol+"\n");
  
          }else{
           counter++;
            System.out.print(symbol);
          }
        } 
        
      }
  
    }