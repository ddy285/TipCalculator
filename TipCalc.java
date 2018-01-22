import java.util.Scanner;
public class TipCalc{
public static void main (String [] args){
Scanner input = new Scanner(System.in);
System.out.println("Enter the subtotal and gratuity rate: ");
double subTotal = input.nextDouble();
double gratuity = input.nextDouble();
double gratuityAmount = (subTotal * gratuity)/100 ;
double total = (subTotal + gratuityAmount);
System.out.println("The gratuity is " +gratuityAmount + " and total is " +total);
}
}
