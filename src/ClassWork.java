/**
 * 
 * @author Felix Quinones
 * Created 2.5.20
 *
 */
import java.util.Scanner;
public class ClassWork {
	public static void main(String[] arg) {
		Scanner keyboard=new Scanner(System.in);
		System.out.println("Provide us with the first number you want to multiply.");
		double x = keyboard.nextDouble();
		System.out.println("Provide us with the second number you want to multiply.");
		double y = keyboard.nextDouble();
		System.out.println("Provide us with the third number you want to multiply.");
		double z = keyboard.nextDouble();
		
		double Prod = x*y*z;
		System.out.println(" The product of these three numbers is "+ Prod);
				
	}

}
