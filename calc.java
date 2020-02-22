/*
 * Name: Ahmed gamal abbas
 * Bench Number;3 section 1;
 * Email: ahmedabbs9@gmail.com
 */
import java.util.*;
public class calc {
	public static void main(String[] args) {
		Scanner objectname = new Scanner(System.in);

		float A, B;
		char S;
		float ON = 1;
		do {
			System.out.println("Enter the first Number:");
			A = objectname.nextFloat();
			System.out.println("Enter the second Number:");
			B = objectname.nextFloat();
			System.out.println("Enter the operation (+ , - , * , / , % ) :");

			S = objectname.next().charAt(0);

			if (S == '+') {
				System.out.println("The answer is " + (A + B));
				//break;
			}

			if (S == '-') {
				System.out.println("The answer is " + (A - B));
				//break;

			}
			if (S == '*') {
				System.out.println("The answer is " + (A * B));
				//break;

			}
			if (S == '/') {
				System.out.println("The answer is " + (A / B));
				//break;

			}
			if (S == '%') {
				System.out.println("The answer is " + (A % B));
				//break;
			}
			System.out.println("To Continue Enter any number  ");
			System.out.println("To Exit Enter 0 ");
			ON = objectname.nextFloat();
		}
		while (ON != 0);

	}
}