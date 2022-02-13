package utility;

public class PerformCalculation { 
	   
   public static void addNumber(double number1, double number2) {
	   double result = number1 + number2 ;
	   System.out.println(number1 + " + " + number2 + " = " + result ); 
   }
   
   public static void subtractNumber(double number1, double number2) {
	   double result = number1 - number2;
	   System.out.println(number1 + " - " + number2 + " = " + result ); 
   }
   
   public static void mutiplyNumber(double number1, double number2) {
	   double result = number1 * number2;
	   System.out.println(number1 + " * " + number2 + " = " + result);   
   }
   
   public static void divideNumber(double number1, double number2) {
	   if (number2 == 0) {
		   System.out.println("Division by zero");
	   }
	   else { 
		   double result = number1/number2;
		   System.out.println(number1 + " / " + number2 + " = " + result);
	   }
   }
}
