package calculator;
import java.util.Scanner;

public class sum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a positive integer (n):");

        int n = sc.nextInt();
        int sum = 0;

        // Loop to calculate sum
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println(sum);

        sc.close();
	}

}
