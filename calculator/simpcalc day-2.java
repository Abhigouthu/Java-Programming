package calculator;

import java.util.Scanner;

public class simpcalc {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Month");
		int day = sc.nextInt();
		switch (day) {

		case 1:
		case 3:
		case 5:
			System.out.println("31 days");
			break;
		case 4:
		case 6:
			System.out.println("30 days");
			break;
		case 2:
			System.out.println("28/29 Days");
			break;
		default:
			System.out.println("Invalid month");

			System.out.println();
		}
	}

}
