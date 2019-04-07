 /*Task 2.Write a program to declear and initialize a double variable with some value such as 50.25.
 Then retrieve the integral part and store it in the variable of type long,
 and the fractional part and store it in a variable of type double.
 Display the actual number,thge integral part and the Fractional part.
 
 */
 class Fractionalpart{
	 public static void main(String[] args)
	 {
		 double val=50.25;
		 int intpart=(int)val;
		 double frac=val-intpart;
		 System.out.println("Original Number : "+val);
		 System.out.println("Integral part : "+intpart);
		 System.out.println("Fractional part : "+frac);	 
		 }
 }  