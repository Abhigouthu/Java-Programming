package Array;
import java.util.Scanner;

public class Trailing0 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        int count = 0;
        
        // Count factors of 5 in n!
        for (int i = 5; n / i >= 1; i *= 5) {
            count += n / i;
        }
        
        System.out.println("Trailing zeros in " + n + "! = " + count);

	}

}
