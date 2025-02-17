import java.lang.Math;
import java.util.*;

public class quad {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    double a,b,c, discriminant, x1,x2;
    System.out.print("Please enter the value for a: ");
    a = input.nextDouble();
    System.out.print("Please enter the value for b: ");
    b = input.nextDouble();
    System.out.print("Please enter the value for c: ");
    c = input.nextDouble();

    discriminant = ((Math.sqrt(b*b - 4*a*c))*100)/100;
    System.out.println(discriminant);

    if(a==0){
      System.out.println("The a value cannot equal 0. Please try again!");
      System.exit(0);
    }
    if (discriminant > 0){

      x1 = Math.round(((b*-1)+discriminant)/2*a)*100/100;
      x2 = Math.round(((b*-1)-discriminant)/2*a)*100/100;
      System.out.println("x1 = "+x1 + " x2 = "+x2);

    } else if (discriminant == 0){

      x1 = Math.round(((b*-1)+discriminant)/2*a)*100/100;
      x2 = Math.round(((b*-1)-discriminant)/2*a)*100/100;
      System.out.println("Both solutions for this equation are "+x1); 

    } else {
      System.out.println("There are no solutions for this quadratic eqn.");
    }
    
    
  }

}
