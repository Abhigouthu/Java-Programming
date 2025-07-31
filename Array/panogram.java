package Array;
import java.util.Scanner;

public class panogram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence or string:");
        String input = sc.nextLine().toLowerCase(); 

        boolean[] alphabet = new boolean[26]; 

        for (char ch : input.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') { 
                alphabet[ch - 'a'] = true;
            }
        }

        boolean isPangram = true;
        for (boolean present : alphabet) {
            if (!present) {
                isPangram = false;
                break;
            }
        }

        if (isPangram) {
            System.out.println(" It is a Pangram (contains all alphabets).");
        } else {
            System.out.println("Not a Pangram (missing some alphabets).");
        }

	}

}
