
import java.util.*;
public class pattern  
{    
public static void main(String args[])   
{    
Scanner sc= new Scanner(System.in);  
System.out.print("Enter your desire number ");  
int n1= sc.nextInt(); 
int row, col;       
  
for (row=0; row<n1; row++)   
{

    for (col = 1; col <= n1 - row; col++) {
        System.out.print(" ");
    }
    for (col = 1; col <= 2 * row - 1; col++) {
        System.out.print("*");
    }
 System.out.println();
}
  Factory Pattern
}   
}  